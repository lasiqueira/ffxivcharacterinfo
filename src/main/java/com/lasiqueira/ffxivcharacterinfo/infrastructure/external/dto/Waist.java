
package com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto;

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
public class Waist {

    @JsonProperty("Creator")
    private Object creator;
    @JsonProperty("Dye")
    private Object dye;
    @JsonProperty("Item")
    private Item____________ item;
    @JsonProperty("Materia")
    private List<Materium___________> materia = null;
    @JsonProperty("Mirage")
    private Object mirage;
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
    public Object getDye() {
        return dye;
    }

    @JsonProperty("Dye")
    public void setDye(Object dye) {
        this.dye = dye;
    }

    @JsonProperty("Item")
    public Item____________ getItem() {
        return item;
    }

    @JsonProperty("Item")
    public void setItem(Item____________ item) {
        this.item = item;
    }

    @JsonProperty("Materia")
    public List<Materium___________> getMateria() {
        return materia;
    }

    @JsonProperty("Materia")
    public void setMateria(List<Materium___________> materia) {
        this.materia = materia;
    }

    @JsonProperty("Mirage")
    public Object getMirage() {
        return mirage;
    }

    @JsonProperty("Mirage")
    public void setMirage(Object mirage) {
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
