
package com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character;

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
    "ExpLevel",
    "ExpLevelMax",
    "ExpLevelTogo",
    "Level",
    "Name"
})
public class ClassJobsElemental {

    @JsonProperty("ExpLevel")
    private Integer expLevel;
    @JsonProperty("ExpLevelMax")
    private Integer expLevelMax;
    @JsonProperty("ExpLevelTogo")
    private Integer expLevelTogo;
    @JsonProperty("Level")
    private Integer level;
    @JsonProperty("Name")
    private String name;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ExpLevel")
    public Integer getExpLevel() {
        return expLevel;
    }

    @JsonProperty("ExpLevel")
    public void setExpLevel(Integer expLevel) {
        this.expLevel = expLevel;
    }

    @JsonProperty("ExpLevelMax")
    public Integer getExpLevelMax() {
        return expLevelMax;
    }

    @JsonProperty("ExpLevelMax")
    public void setExpLevelMax(Integer expLevelMax) {
        this.expLevelMax = expLevelMax;
    }

    @JsonProperty("ExpLevelTogo")
    public Integer getExpLevelTogo() {
        return expLevelTogo;
    }

    @JsonProperty("ExpLevelTogo")
    public void setExpLevelTogo(Integer expLevelTogo) {
        this.expLevelTogo = expLevelTogo;
    }

    @JsonProperty("Level")
    public Integer getLevel() {
        return level;
    }

    @JsonProperty("Level")
    public void setLevel(Integer level) {
        this.level = level;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
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
