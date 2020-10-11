
package com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
    "Attribute",
    "Value"
})
public class Attribute {

    @JsonProperty("Attribute")
    private Attribute attribute;
    @JsonProperty("Value")
    private Integer value;

    @JsonProperty("Attribute")
    public Attribute getAttribute() {
        return attribute;
    }

    @JsonProperty("Attribute")
    public void setAttribute(Attribute attribute) {
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

}
