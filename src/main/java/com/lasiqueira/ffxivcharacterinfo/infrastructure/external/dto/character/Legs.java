
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
    "Creator",
    "Dye",
    "Item",
    "Materia",
    "Mirage"
})
public class Legs {

    @JsonProperty("Creator")
    private Object creator;
    @JsonProperty("Dye")
    private Dye____ dye;
    @JsonProperty("Item")
    private Item______ item;
    @JsonProperty("Materia")
    private List<Materium______> materia = null;
    @JsonProperty("Mirage")
    private Mirage____ mirage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Creator")
    public Object getCreator() {
        return creator;
    }

    @JsonProperty("Creator")
    public void setCreator(Object creator) {
        this.creator = creator;
    }

    @JsonProperty("Dye")
    public Dye____ getDye() {
        return dye;
    }

    @JsonProperty("Dye")
    public void setDye(Dye____ dye) {
        this.dye = dye;
    }

    @JsonProperty("Item")
    public Item______ getItem() {
        return item;
    }

    @JsonProperty("Item")
    public void setItem(Item______ item) {
        this.item = item;
    }

    @JsonProperty("Materia")
    public List<Materium______> getMateria() {
        return materia;
    }

    @JsonProperty("Materia")
    public void setMateria(List<Materium______> materia) {
        this.materia = materia;
    }

    @JsonProperty("Mirage")
    public Mirage____ getMirage() {
        return mirage;
    }

    @JsonProperty("Mirage")
    public void setMirage(Mirage____ mirage) {
        this.mirage = mirage;
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
