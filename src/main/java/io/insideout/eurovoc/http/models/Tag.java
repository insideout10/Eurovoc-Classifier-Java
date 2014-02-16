package io.insideout.eurovoc.http.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Created by david on 16/2/14.
 */
public class Tag {

    @JsonProperty("vocabulary_id")
    private String vocabularyId;

    @JsonProperty("display_name")
    private String displayName;

    @JsonProperty("revision_timestamp")
    private Date revisionTimestamp;

    private String state;
    private String id;
    private String name;

    public String getVocabularyId() {
        return vocabularyId;
    }

    public void setVocabularyId(String vocabularyId) {
        this.vocabularyId = vocabularyId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Date getRevisionTimestamp() {
        return revisionTimestamp;
    }

    public void setRevisionTimestamp(Date revisionTimestamp) {
        this.revisionTimestamp = revisionTimestamp;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

