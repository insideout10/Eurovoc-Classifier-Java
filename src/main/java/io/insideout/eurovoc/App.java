package io.insideout.eurovoc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import io.insideout.eurovoc.http.models.ApiResponse;
import io.insideout.eurovoc.http.models.Resource;
import io.insideout.eurovoc.http.models.Result;
import io.insideout.eurovoc.http.models.Tag;
import io.redlink.sdk.RedLink;
import io.redlink.sdk.RedLinkFactory;
import io.redlink.sdk.analysis.AnalysisRequest;
import io.redlink.sdk.impl.analysis.model.Enhancements;
import io.redlink.sdk.impl.analysis.model.EntityAnnotation;
import org.apache.commons.lang3.text.WordUtils;
import org.apache.http.client.fluent.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;

public class App {

    // configuration parameters.
    private String analysisName;

    // CKAN base URL.
    private final static String CKAN_URL = "http://www.dati.gov.it/catalog/api/action";

    // Redlink analysis instances.
    private RedLink.Analysis analysis;
    private AnalysisRequest.AnalysisRequestBuilder requestBuilder;

    // JSON ObjectMapper instance.
    private ObjectMapper objectMapper = new ObjectMapper();

    // logger.
    private Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * Application starts here.
     *
     * @param args
     */
    public static void main(String[] args) {

        // create a new app instance.
        final App app = new App();
        // create a client.

        try {
            // start processing.
            app.process();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public App() {
        final Config configuration = ConfigFactory.load();
        final String applicationKey = configuration.getString("redlink.application_key");
        analysisName = configuration.getString("redlink.analysis_name");

        analysis = RedLinkFactory.getInstance().createAnalysisClient(applicationKey);
        // create a request builder, which in turn will make requests to Redlink.
        requestBuilder = new AnalysisRequest.AnalysisRequestBuilder();
    }

    /**
     * Process.
     *
     * @throws IOException
     */
    public void process() throws Exception {

        final String packageListURL = CKAN_URL + "/package_list";
        final InputStream inputStream = Request.Get(packageListURL)
                .execute().returnContent().asStream();
        final PackageList packageList = objectMapper.readValue(inputStream, PackageList.class);

        for (final String dataset : packageList.getResult()) {

            // set the dataset metadata URL.
            final String url = CKAN_URL + "/package_show?id=" + URLEncoder.encode(dataset, "utf-8");
            logger.debug("[ url :: {} ]", url);

            final InputStream is = Request.Get(url)
                    .execute().returnContent().asStream();

            final ApiResponse response = objectMapper.readValue(is, ApiResponse.class);
            final Result result = response.getResult();

            // get the descriptions.
            final String descriptions = getDescriptions(result);
            // get the tags.
            final String tags = getTags(result);
            // get the notes.
            final String notes = result.getNotes();

            final String title = result.getTitle();

            final String content = buildContent(title, descriptions, notes, tags);

            try {
                logger.debug("[ title :: {} ]", title);
                analyse(content);
            } catch (Exception e) {
                logger.error(String.format("Uh oh, I couldn't analyse this one [ %s ]", title), e);
            }
        }

    }

    /**
     * Build content to send to the analyzer.
     *
     * @param title        The title.
     * @param descriptions The descriptions.
     * @param notes        The notes.
     * @param tags         The tags.
     */
    private String buildContent(final String title, final String descriptions, final String notes, final String tags) {

        return title + (title.endsWith(".") ? "" : ".") + "\n" +
                descriptions + (descriptions.endsWith(".") ? "" : ".") + "\n" +
                notes + (notes.endsWith(".") ? "" : ".") + "\n" +
                tags;
    }

    /**
     * Iterate over the result's resources to build a multiline description.
     *
     * @param result The result containing the resources to parse.
     * @return A string with the found descriptions separated by a double new line.
     */
    private String getDescriptions(final Result result) {

        final StringBuilder sb = new StringBuilder();
        for (final Resource r : result.getResources()) {
            sb.append(r.getDescription() + "\n\n");
        }

        return sb.toString();
    }

    private String getTags(final Result result) {

        // instantiate a string builder to build the answer.
        final StringBuilder sb = new StringBuilder();

        // a reference to the tags.
        final Tag[] tags = result.getTags();
        for (int i = 0; i < tags.length; i++) {
            // capitalize the tag to help the NLP.
            sb.append(WordUtils.capitalize(tags[i].getDisplayName()));

            // add a period if it's the last tag, otherwise a comma.
            sb.append(i == tags.length - 1 ? "." : ", ");
        }

        return sb.toString();
    }

    /**
     * Analyze the specified content.
     *
     * @param content The content to analyze.
     */
    private void analyse(final String content) {

        logger.debug(content);

        final AnalysisRequest request = requestBuilder.setAnalysis(analysisName).setContent(content).build();
        final Enhancements enhancements = analysis.enhance(request);

//        for (final String language : enhancements.getLanguages()) {
//            logger.info(String.format("Language [ %s ]", language));
//        }

        for (final EntityAnnotation entityAnnotation : enhancements.getEntityAnnotations()) {

            final String label = entityAnnotation.getEntityLabel();
            final String uri = entityAnnotation.getEntityReference().getUri();
            final Double confidence = entityAnnotation.getConfidence();

            logger.info(String.format("Entity found [ label :: %s ][ uri :: %s ][ confidence :: %f ]", label, uri, confidence));

        }

    }
}
