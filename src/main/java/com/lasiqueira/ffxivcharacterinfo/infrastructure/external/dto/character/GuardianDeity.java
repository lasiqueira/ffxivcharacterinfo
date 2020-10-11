
package com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character;


import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
    "GuardianDeity",
    "ID",
    "Icon",
    "Name",
    "Url"
})
public class GuardianDeity {

    @JsonProperty("GuardianDeity")
    private Object guardianDeity;
    @JsonProperty("ID")
    private Integer iD;
    @JsonProperty("Icon")
    private String icon;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Url")
    private String url;

    @JsonProperty("GuardianDeity")
    public Object getGuardianDeity() {
        return guardianDeity;
    }

    @JsonProperty("GuardianDeity")
    public void setGuardianDeity(Object guardianDeity) {
        this.guardianDeity = guardianDeity;
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

}
