
package com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
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
public class Item {

    @JsonProperty("ClassJobCategory")
    private ClassJobCategory classJobCategory;
    @JsonProperty("ID")
    private Integer iD;
    @JsonProperty("Icon")
    private String icon;
    @JsonProperty("ItemUICategory")
    private ItemUICategory itemUICategory;
    @JsonProperty("LevelEquip")
    private Integer levelEquip;
    @JsonProperty("LevelItem")
    private Integer levelItem;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Rarity")
    private Integer rarity;

    @JsonProperty("ClassJobCategory")
    public ClassJobCategory getClassJobCategory() {
        return classJobCategory;
    }

    @JsonProperty("ClassJobCategory")
    public void setClassJobCategory(ClassJobCategory classJobCategory) {
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
    public ItemUICategory getItemUICategory() {
        return itemUICategory;
    }

    @JsonProperty("ItemUICategory")
    public void setItemUICategory(ItemUICategory itemUICategory) {
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

}
