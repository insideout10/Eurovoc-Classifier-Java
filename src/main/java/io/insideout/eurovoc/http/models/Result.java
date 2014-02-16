package io.insideout.eurovoc.http.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Result {

    @JsonProperty("license_title")
    private String licenseTitle;
    private String maintainer;
    @JsonProperty("relationships_as_object")
    private String[] relationshipsAsObject;

    @JsonProperty("is_private")
    private boolean isPrivate;

    @JsonProperty("maintainer_email")
    private String maintainerEmail;

    @JsonProperty("revision_timestamp")
    private Date revisionTimestamp;

    private String id;

    @JsonProperty("metadata_created")
    private Date metadataCreated;

    @JsonProperty("metadata_modified")
    private Date metadataModified;

    @JsonProperty("owner_org")
    private String ownerOrganization;

    private String author;

    @JsonProperty("author_email")
    private String authorEmail;
    private String state;
    private String version;

    @JsonProperty("license_id")
    private String licenseId;
    private String type;
    private Resource[] resources;

    @JsonProperty("num_resources")
    private Long numResources;
    private Tag[] tags;

    @JsonProperty("tracking_summary")
    private TrackingSummary trackingSummary;
    private String[] groups;

    @JsonProperty("relationships_as_subject")
    private String[] relationshipsAsSubject;

    @JsonProperty("num_tags")
    private Long numTags;
    private String name;

    @JsonProperty("isopen")
    private boolean isOpen;
    private String url;
    private String notes;
    private String title;
    private Extra[] extras;

    @JsonProperty("license_url")
    private String licenseURL;

    @JsonProperty("revision_id")
    private String revisionId;

    private Organization organization;

    public String getLicenseTitle() {
        return licenseTitle;
    }

    public void setLicenseTitle(String licenseTitle) {
        this.licenseTitle = licenseTitle;
    }

    public String getMaintainer() {
        return maintainer;
    }

    public void setMaintainer(String maintainer) {
        this.maintainer = maintainer;
    }

    public String[] getRelationshipsAsObject() {
        return relationshipsAsObject;
    }

    public void setRelationshipsAsObject(String[] relationshipsAsObject) {
        this.relationshipsAsObject = relationshipsAsObject;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public String getMaintainerEmail() {
        return maintainerEmail;
    }

    public void setMaintainerEmail(String maintainerEmail) {
        this.maintainerEmail = maintainerEmail;
    }

    public Date getRevisionTimestamp() {
        return revisionTimestamp;
    }

    public void setRevisionTimestamp(Date revisionTimestamp) {
        this.revisionTimestamp = revisionTimestamp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getMetadataCreated() {
        return metadataCreated;
    }

    public void setMetadataCreated(Date metadataCreated) {
        this.metadataCreated = metadataCreated;
    }

    public Date getMetadataModified() {
        return metadataModified;
    }

    public void setMetadataModified(Date metadataModified) {
        this.metadataModified = metadataModified;
    }

    public String getOwnerOrganization() {
        return ownerOrganization;
    }

    public void setOwnerOrganization(String ownerOrganization) {
        this.ownerOrganization = ownerOrganization;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Resource[] getResources() {
        return resources;
    }

    public void setResources(Resource[] resources) {
        this.resources = resources;
    }

    public Long getNumResources() {
        return numResources;
    }

    public void setNumResources(Long numResources) {
        this.numResources = numResources;
    }

    public Tag[] getTags() {
        return tags;
    }

    public void setTags(Tag[] tags) {
        this.tags = tags;
    }

    public TrackingSummary getTrackingSummary() {
        return trackingSummary;
    }

    public void setTrackingSummary(TrackingSummary trackingSummary) {
        this.trackingSummary = trackingSummary;
    }

    public String[] getGroups() {
        return groups;
    }

    public void setGroups(String[] groups) {
        this.groups = groups;
    }

    public String[] getRelationshipsAsSubject() {
        return relationshipsAsSubject;
    }

    public void setRelationshipsAsSubject(String[] relationshipsAsSubject) {
        this.relationshipsAsSubject = relationshipsAsSubject;
    }

    public Long getNumTags() {
        return numTags;
    }

    public void setNumTags(Long numTags) {
        this.numTags = numTags;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Extra[] getExtras() {
        return extras;
    }

    public void setExtras(Extra[] extras) {
        this.extras = extras;
    }

    public String getLicenseURL() {
        return licenseURL;
    }

    public void setLicenseURL(String licenseURL) {
        this.licenseURL = licenseURL;
    }

    public String getRevisionId() {
        return revisionId;
    }

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
}
