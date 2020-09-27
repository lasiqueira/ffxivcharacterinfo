
package com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto;

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
    "Body",
    "Bracelets",
    "Earrings",
    "Feet",
    "Hands",
    "Head",
    "Legs",
    "MainHand",
    "Necklace",
    "Ring1",
    "Ring2",
    "SoulCrystal",
    "Waist"
})
public class Gear {

    @JsonProperty("Body")
    private Body body;
    @JsonProperty("Bracelets")
    private Bracelets bracelets;
    @JsonProperty("Earrings")
    private Earrings earrings;
    @JsonProperty("Feet")
    private Feet feet;
    @JsonProperty("Hands")
    private Hands hands;
    @JsonProperty("Head")
    private Head head;
    @JsonProperty("Legs")
    private Legs legs;
    @JsonProperty("MainHand")
    private MainHand mainHand;
    @JsonProperty("Necklace")
    private Necklace necklace;
    @JsonProperty("Ring1")
    private Ring1 ring1;
    @JsonProperty("Ring2")
    private Ring2 ring2;
    @JsonProperty("SoulCrystal")
    private SoulCrystal soulCrystal;
    @JsonProperty("Waist")
    private Waist waist;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Body")
    public Body getBody() {
        return body;
    }

    @JsonProperty("Body")
    public void setBody(Body body) {
        this.body = body;
    }

    @JsonProperty("Bracelets")
    public Bracelets getBracelets() {
        return bracelets;
    }

    @JsonProperty("Bracelets")
    public void setBracelets(Bracelets bracelets) {
        this.bracelets = bracelets;
    }

    @JsonProperty("Earrings")
    public Earrings getEarrings() {
        return earrings;
    }

    @JsonProperty("Earrings")
    public void setEarrings(Earrings earrings) {
        this.earrings = earrings;
    }

    @JsonProperty("Feet")
    public Feet getFeet() {
        return feet;
    }

    @JsonProperty("Feet")
    public void setFeet(Feet feet) {
        this.feet = feet;
    }

    @JsonProperty("Hands")
    public Hands getHands() {
        return hands;
    }

    @JsonProperty("Hands")
    public void setHands(Hands hands) {
        this.hands = hands;
    }

    @JsonProperty("Head")
    public Head getHead() {
        return head;
    }

    @JsonProperty("Head")
    public void setHead(Head head) {
        this.head = head;
    }

    @JsonProperty("Legs")
    public Legs getLegs() {
        return legs;
    }

    @JsonProperty("Legs")
    public void setLegs(Legs legs) {
        this.legs = legs;
    }

    @JsonProperty("MainHand")
    public MainHand getMainHand() {
        return mainHand;
    }

    @JsonProperty("MainHand")
    public void setMainHand(MainHand mainHand) {
        this.mainHand = mainHand;
    }

    @JsonProperty("Necklace")
    public Necklace getNecklace() {
        return necklace;
    }

    @JsonProperty("Necklace")
    public void setNecklace(Necklace necklace) {
        this.necklace = necklace;
    }

    @JsonProperty("Ring1")
    public Ring1 getRing1() {
        return ring1;
    }

    @JsonProperty("Ring1")
    public void setRing1(Ring1 ring1) {
        this.ring1 = ring1;
    }

    @JsonProperty("Ring2")
    public Ring2 getRing2() {
        return ring2;
    }

    @JsonProperty("Ring2")
    public void setRing2(Ring2 ring2) {
        this.ring2 = ring2;
    }

    @JsonProperty("SoulCrystal")
    public SoulCrystal getSoulCrystal() {
        return soulCrystal;
    }

    @JsonProperty("SoulCrystal")
    public void setSoulCrystal(SoulCrystal soulCrystal) {
        this.soulCrystal = soulCrystal;
    }

    @JsonProperty("Waist")
    public Waist getWaist() {
        return waist;
    }

    @JsonProperty("Waist")
    public void setWaist(Waist waist) {
        this.waist = waist;
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
