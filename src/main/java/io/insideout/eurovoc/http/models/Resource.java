package io.insideout.eurovoc.http.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Created by david on 16/2/14.
 */
public class Resource {

    @JsonProperty("resource_group_id")
    private String resourceGroupId;

    @JsonProperty("cache_last_updated")
    private Date cacheLastUpdated;

    @JsonProperty("revision_timestamp")
    private Date revisionTimestamp;

    @JsonProperty("webstore_last_updated")
    private Date webstoreLastUpdated;

    private String id;
    private Long size;
    private String state;
    private String hash;
    private String description;
    private String format;

    @JsonProperty("tracking_summary")
    private TrackingSummary trackingSummary;

    @JsonProperty("mimetype_inner")
    private String mimetypeInner;
    private String mimetype;

    @JsonProperty("cache_url")
    private String cacheURL;

    private String name;
    private Date created;
    private String url;

    @JsonProperty("webstore_url")
    private String webstoreURL;

    @JsonProperty("last_modified")
    private Date lastModified;

    private Long position;

    @JsonProperty("revision_id")
    private String revisionId;

    @JsonProperty("resource_type")
    private String resourceType;

    public String getResourceGroupId() {
        return resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public Date getCacheLastUpdated() {
        return cacheLastUpdated;
    }

    public void setCacheLastUpdated(Date cacheLastUpdated) {
        this.cacheLastUpdated = cacheLastUpdated;
    }

    public Date getRevisionTimestamp() {
        return revisionTimestamp;
    }

    public void setRevisionTimestamp(Date revisionTimestamp) {
        this.revisionTimestamp = revisionTimestamp;
    }

    public Date getWebstoreLastUpdated() {
        return webstoreLastUpdated;
    }

    public void setWebstoreLastUpdated(Date webstoreLastUpdated) {
        this.webstoreLastUpdated = webstoreLastUpdated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public TrackingSummary getTrackingSummary() {
        return trackingSummary;
    }

    public void setTrackingSummary(TrackingSummary trackingSummary) {
        this.trackingSummary = trackingSummary;
    }

    public String getMimetypeInner() {
        return mimetypeInner;
    }

    public void setMimetypeInner(String mimetypeInner) {
        this.mimetypeInner = mimetypeInner;
    }

    public String getMimetype() {
        return mimetype;
    }

    public void setMimetype(String mimetype) {
        this.mimetype = mimetype;
    }

    public String getCacheURL() {
        return cacheURL;
    }

    public void setCacheURL(String cacheURL) {
        this.cacheURL = cacheURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getWebstoreURL() {
        return webstoreURL;
    }

    public void setWebstoreURL(String webstoreURL) {
        this.webstoreURL = webstoreURL;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public Long getPosition() {
        return position;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    public String getRevisionId() {
        return revisionId;
    }

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
}
