
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
    "ClassJobCategory",
    "ID",
    "Icon",
    "ItemUICategory",
    "LevelEquip",
    "LevelItem",
    "Name",
    "Rarity"
})
public class Item__ {

    @JsonProperty("ClassJobCategory")
    private ClassJobCategory_____ classJobCategory;
    @JsonProperty("ID")
    private Integer iD;
    @JsonProperty("Icon")
    private String icon;
    @JsonProperty("ItemUICategory")
    private ItemUICategory__ itemUICategory;
    @JsonProperty("LevelEquip")
    private Integer levelEquip;
    @JsonProperty("LevelItem")
    private Integer levelItem;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Rarity")
    private Integer rarity;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ClassJobCategory")
    public ClassJobCategory_____ getClassJobCategory() {
        return classJobCategory;
    }

    @JsonProperty("ClassJobCategory")
    public void setClassJobCategory(ClassJobCategory_____ classJobCategory) {
        this.classJobCategory = classJobCategory;
    }

    @JsonProperty("ID")
    public Integer getID() {
        return iD;
    }

    @JsonProperty("ID")
    public void setID(Integer iD) {
        this.iD = iD;
    }

    @JsonProperty("Icon")
    public String getIcon() {
        return icon;
    }

    @JsonProperty("Icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @JsonProperty("ItemUICategory")
    public ItemUICategory__ getItemUICategory() {
        return itemUICategory;
    }

    @JsonProperty("ItemUICategory")
    public void setItemUICategory(ItemUICategory__ itemUICategory) {
        this.itemUICategory = itemUICategory;
    }

    @JsonProperty("LevelEquip")
    public Integer getLevelEquip() {
        return levelEquip;
    }

    @JsonProperty("LevelEquip")
    public void setLevelEquip(Integer levelEquip) {
        this.levelEquip = levelEquip;
    }

    @JsonProperty("LevelItem")
    public Integer getLevelItem() {
        return levelItem;
    }

    @JsonProperty("LevelItem")
    public void setLevelItem(Integer levelItem) {
        this.levelItem = levelItem;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Rarity")
    public Integer getRarity() {
        return rarity;
    }

    @JsonProperty("Rarity")
    public void setRarity(Integer rarity) {
        this.rarity = rarity;
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
