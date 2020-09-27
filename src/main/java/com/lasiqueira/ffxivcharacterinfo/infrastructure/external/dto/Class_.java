
package com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Abbreviation",
    "ClassJobCategory",
    "ID",
    "Icon",
    "Name",
    "Url"
})
public class Class_ {

    @JsonProperty("Abbreviation")
    private String abbreviation;
    @JsonProperty("ClassJobCategory")
    private ClassJobCategory_ classJobCategory;
    @JsonProperty("ID")
    private Integer iD;
    @JsonProperty("Icon")
    private String icon;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Url")
    private String url;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Abbreviation")
    public String getAbbreviation() {
        return abbreviation;
    }

    @JsonProperty("Abbreviation")
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @JsonProperty("ClassJobCategory")
    public ClassJobCategory_ getClassJobCategory() {
        return classJobCategory;
    }

    @JsonProperty("ClassJobCategory")
    public void setClassJobCategory(ClassJobCategory_ classJobCategory) {
        this.classJobCategory = classJobCategory;
    }

    @JsonProperty("ID")
    public Integer getID() {
        return iD;
    }

    @JsonProperty("ID")
    public void setID(Integer iD) {
        this.iD = iD;
    }

    @JsonProperty("Icon")
    public String getIcon() {
        return icon;
    }

    @JsonProperty("Icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("Url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
