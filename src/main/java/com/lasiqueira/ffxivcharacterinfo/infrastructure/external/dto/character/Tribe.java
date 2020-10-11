
package com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
    "ID",
    "Icon",
    "Name",
    "Url"
})
public class Tribe {

    @JsonProperty("ID")
    private Integer iD;
    @JsonProperty("Icon")
    private Object icon;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Url")
    private String url;

    @JsonProperty("ID")
    public Integer getID() {
        return iD;
    }

    @JsonProperty("ID")
    public void setID(Integer iD) {
        this.iD = iD;
    }

    @JsonProperty("Icon")
    public Object getIcon() {
        return icon;
    }

    @JsonProperty("Icon")
    public void setIcon(Object icon) {
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

}
