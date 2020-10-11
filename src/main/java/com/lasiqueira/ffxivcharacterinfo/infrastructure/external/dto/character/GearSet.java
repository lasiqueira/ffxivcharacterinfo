
package com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character;

import java.util.List;
import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
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
    private Class _class;
    @JsonProperty("Gear")
    private Gear gear;
    @JsonProperty("GearKey")
    private String gearKey;
    @JsonProperty("Job")
    private Job job;
    @JsonProperty("Level")
    private Integer level;

    @JsonProperty("Attributes")
    public List<Attribute> getAttributes() {
        return attributes;
    }

    @JsonProperty("Attributes")
    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    @JsonProperty("Class")
    public Class getClass_() {
        return _class;
    }

    @JsonProperty("Class")
    public void setClass_(Class _class) {
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
    public Job getJob() {
        return job;
    }

    @JsonProperty("Job")
    public void setJob(Job job) {
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

}
