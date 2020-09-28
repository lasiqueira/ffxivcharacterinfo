
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
    "Attribute",
    "Value"
})
public class Attribute {

    @JsonProperty("Attribute")
    private Attribute_ attribute;
    @JsonProperty("Value")
    private Integer value;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Attribute")
    public Attribute_ getAttribute() {
        return attribute;
    }

    @JsonProperty("Attribute")
    public void setAttribute(Attribute_ attribute) {
        this.attribute = attribute;
    }

    @JsonProperty("Value")
    public Integer getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Integer value) {
        this.value = value;
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
