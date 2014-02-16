package io.insideout.eurovoc.http.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by david on 16/2/14.
 */
public class ExtraExtra {

    @JsonProperty("package_id")
    private String packageId;

    @JsonProperty("revision_id")
    private String revisionId;

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public String getRevisionId() {
        return revisionId;
    }

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }
}
