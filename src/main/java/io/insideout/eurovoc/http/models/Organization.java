package io.insideout.eurovoc.http.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Created by david on 16/2/14.
 */
public class Organization {

    private String description;
    private String title;
    private Date created;

    @JsonProperty("approval_status")
    private String approvalStatus;

    @JsonProperty("revision_timestamp")
    private Date revisionTimestamp;

    @JsonProperty("is_organization")
    private boolean isOrganization;
    private String state;

    @JsonProperty("image_url")
    private String imageURL;

    @JsonProperty("revision_id")
    private String revisionId;
    private String type;
    private String id;
    private String name;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public Date getRevisionTimestamp() {
        return revisionTimestamp;
    }

    public void setRevisionTimestamp(Date revisionTimestamp) {
        this.revisionTimestamp = revisionTimestamp;
    }

    public boolean isOrganization() {
        return isOrganization;
    }

    public void setOrganization(boolean isOrganization) {
        this.isOrganization = isOrganization;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getRevisionId() {
        return revisionId;
    }

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
