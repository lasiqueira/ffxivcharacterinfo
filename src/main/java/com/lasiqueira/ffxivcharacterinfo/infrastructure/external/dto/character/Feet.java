
package com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
    "Creator",
    "Dye",
    "Item",
    "Materia",
    "Mirage"
})
public class Feet {

    @JsonProperty("Creator")
    private Object creator;
    @JsonProperty("Dye")
    private Dye dye;
    @JsonProperty("Item")
    private Item item;
    @JsonProperty("Materia")
    private List<Materium> materia = null;
    @JsonProperty("Mirage")
    private Mirage mirage;

    @JsonProperty("Creator")
    public Object getCreator() {
        return creator;
    }

    @JsonProperty("Creator")
    public void setCreator(Object creator) {
        this.creator = creator;
    }

    @JsonProperty("Dye")
    public Dye getDye() {
        return dye;
    }

    @JsonProperty("Dye")
    public void setDye(Dye dye) {
        this.dye = dye;
    }

    @JsonProperty("Item")
    public Item getItem() {
        return item;
    }

    @JsonProperty("Item")
    public void setItem(Item item) {
        this.item = item;
    }

    @JsonProperty("Materia")
    public List<Materium> getMateria() {
        return materia;
    }

    @JsonProperty("Materia")
    public void setMateria(List<Materium> materia) {
        this.materia = materia;
    }

    @JsonProperty("Mirage")
    public Mirage getMirage() {
        return mirage;
    }

    @JsonProperty("Mirage")
    public void setMirage(Mirage mirage) {
        this.mirage = mirage;
    }

}
