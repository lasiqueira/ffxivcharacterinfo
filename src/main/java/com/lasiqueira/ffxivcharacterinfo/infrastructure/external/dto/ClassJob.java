
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
    "Class",
    "ExpLevel",
    "ExpLevelMax",
    "ExpLevelTogo",
    "IsSpecialised",
    "Job",
    "Level",
    "Name",
    "UnlockedState"
})
public class ClassJob {

    @JsonProperty("Class")
    private Class_ _class;
    @JsonProperty("ExpLevel")
    private Integer expLevel;
    @JsonProperty("ExpLevelMax")
    private Integer expLevelMax;
    @JsonProperty("ExpLevelTogo")
    private Integer expLevelTogo;
    @JsonProperty("IsSpecialised")
    private Boolean isSpecialised;
    @JsonProperty("Job")
    private Job_ job;
    @JsonProperty("Level")
    private Integer level;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("UnlockedState")
    private UnlockedState_ unlockedState;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Class")
    public Class_ getClass_() {
        return _class;
    }

    @JsonProperty("Class")
    public void setClass_(Class_ _class) {
        this._class = _class;
    }

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

    @JsonProperty("IsSpecialised")
    public Boolean getIsSpecialised() {
        return isSpecialised;
    }

    @JsonProperty("IsSpecialised")
    public void setIsSpecialised(Boolean isSpecialised) {
        this.isSpecialised = isSpecialised;
    }

    @JsonProperty("Job")
    public Job_ getJob() {
        return job;
    }

    @JsonProperty("Job")
    public void setJob(Job_ job) {
        this.job = job;
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

    @JsonProperty("UnlockedState")
    public UnlockedState_ getUnlockedState() {
        return unlockedState;
    }

    @JsonProperty("UnlockedState")
    public void setUnlockedState(UnlockedState_ unlockedState) {
        this.unlockedState = unlockedState;
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
