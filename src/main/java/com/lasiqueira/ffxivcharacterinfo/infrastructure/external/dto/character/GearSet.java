
package com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Attributes",
    "Class",
    "Gear",
    "GearKey",
    "Job",
    "Level"
})
public class GearSet {

    @JsonProperty("Attributes")
    private List<Attribute> attributes = null;
    @JsonProperty("Class")
    private Class__ _class;
    @JsonProperty("Gear")
    private Gear gear;
    @JsonProperty("GearKey")
    private String gearKey;
    @JsonProperty("Job")
    private Job__ job;
    @JsonProperty("Level")
    private Integer level;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Attributes")
    public List<Attribute> getAttributes() {
        return attributes;
    }

    @JsonProperty("Attributes")
    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    @JsonProperty("Class")
    public Class__ getClass_() {
        return _class;
    }

    @JsonProperty("Class")
    public void setClass_(Class__ _class) {
        this._class = _class;
    }

    @JsonProperty("Gear")
    public Gear getGear() {
        return gear;
    }

    @JsonProperty("Gear")
    public void setGear(Gear gear) {
        this.gear = gear;
    }

    @JsonProperty("GearKey")
    public String getGearKey() {
        return gearKey;
    }

    @JsonProperty("GearKey")
    public void setGearKey(String gearKey) {
        this.gearKey = gearKey;
    }

    @JsonProperty("Job")
    public Job__ getJob() {
        return job;
    }

    @JsonProperty("Job")
    public void setJob(Job__ job) {
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
