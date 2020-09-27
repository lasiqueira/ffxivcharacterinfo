
package com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({

    "Character"
})
public class CharacterData {

    @JsonProperty("Character")
    private Character character;

    @JsonProperty("Character")
    public Character getCharacter() {
        return character;
    }

    @JsonProperty("Character")
    public void setCharacter(Character character) {
        this.character = character;
    }



}
