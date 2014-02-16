package io.insideout.eurovoc.http.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by david on 16/2/14.
 */
public class Extra {

    private String value;
    private String key;

    @JsonProperty("__extras")
    private ExtraExtra extraExtras;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ExtraExtra getExtraExtras() {
        return extraExtras;
    }

    public void setExtraExtras(ExtraExtra extraExtras) {
        this.extraExtras = extraExtras;
    }
}
