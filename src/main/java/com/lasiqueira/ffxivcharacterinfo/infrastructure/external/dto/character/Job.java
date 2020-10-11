
package com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
    "Abbreviation",
    "ClassJobCategory",
    "ID",
    "Icon",
    "Name",
    "Url"
})
public class Job {

    @JsonProperty("Abbreviation")
    private String abbreviation;
    @JsonProperty("ID")
    private Integer iD;
    @JsonProperty("Icon")
    private String icon;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Url")
    private String url;
    @JsonProperty("ClassJobCategory")
    private ClassJobCategory classJobCategory;

    @JsonProperty("Abbreviation")
    public String getAbbreviation() {
        return abbreviation;
    }

    @JsonProperty("Abbreviation")
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
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

    public ClassJobCategory getClassJobCategory() {
        return classJobCategory;
    }

    public void setClassJobCategory(ClassJobCategory classJobCategory) {
        this.classJobCategory = classJobCategory;
    }
}
