
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
    "1",
    "2",
    "3",
    "4",
    "5",
    "6",
    "7",
    "8",
    "19",
    "20",
    "21",
    "22",
    "24",
    "27",
    "33",
    "34",
    "44",
    "45",
    "46"
})
public class Attributes {

    @JsonProperty("1")
    private Integer _1;
    @JsonProperty("2")
    private Integer _2;
    @JsonProperty("3")
    private Integer _3;
    @JsonProperty("4")
    private Integer _4;
    @JsonProperty("5")
    private Integer _5;
    @JsonProperty("6")
    private Integer _6;
    @JsonProperty("7")
    private Integer _7;
    @JsonProperty("8")
    private Integer _8;
    @JsonProperty("19")
    private Integer _19;
    @JsonProperty("20")
    private Integer _20;
    @JsonProperty("21")
    private Integer _21;
    @JsonProperty("22")
    private Integer _22;
    @JsonProperty("24")
    private Integer _24;
    @JsonProperty("27")
    private Integer _27;
    @JsonProperty("33")
    private Integer _33;
    @JsonProperty("34")
    private Integer _34;
    @JsonProperty("44")
    private Integer _44;
    @JsonProperty("45")
    private Integer _45;
    @JsonProperty("46")
    private Integer _46;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("1")
    public Integer get1() {
        return _1;
    }

    @JsonProperty("1")
    public void set1(Integer _1) {
        this._1 = _1;
    }

    @JsonProperty("2")
    public Integer get2() {
        return _2;
    }

    @JsonProperty("2")
    public void set2(Integer _2) {
        this._2 = _2;
    }

    @JsonProperty("3")
    public Integer get3() {
        return _3;
    }

    @JsonProperty("3")
    public void set3(Integer _3) {
        this._3 = _3;
    }

    @JsonProperty("4")
    public Integer get4() {
        return _4;
    }

    @JsonProperty("4")
    public void set4(Integer _4) {
        this._4 = _4;
    }

    @JsonProperty("5")
    public Integer get5() {
        return _5;
    }

    @JsonProperty("5")
    public void set5(Integer _5) {
        this._5 = _5;
    }

    @JsonProperty("6")
    public Integer get6() {
        return _6;
    }

    @JsonProperty("6")
    public void set6(Integer _6) {
        this._6 = _6;
    }

    @JsonProperty("7")
    public Integer get7() {
        return _7;
    }

    @JsonProperty("7")
    public void set7(Integer _7) {
        this._7 = _7;
    }

    @JsonProperty("8")
    public Integer get8() {
        return _8;
    }

    @JsonProperty("8")
    public void set8(Integer _8) {
        this._8 = _8;
    }

    @JsonProperty("19")
    public Integer get19() {
        return _19;
    }

    @JsonProperty("19")
    public void set19(Integer _19) {
        this._19 = _19;
    }

    @JsonProperty("20")
    public Integer get20() {
        return _20;
    }

    @JsonProperty("20")
    public void set20(Integer _20) {
        this._20 = _20;
    }

    @JsonProperty("21")
    public Integer get21() {
        return _21;
    }

    @JsonProperty("21")
    public void set21(Integer _21) {
        this._21 = _21;
    }

    @JsonProperty("22")
    public Integer get22() {
        return _22;
    }

    @JsonProperty("22")
    public void set22(Integer _22) {
        this._22 = _22;
    }

    @JsonProperty("24")
    public Integer get24() {
        return _24;
    }

    @JsonProperty("24")
    public void set24(Integer _24) {
        this._24 = _24;
    }

    @JsonProperty("27")
    public Integer get27() {
        return _27;
    }

    @JsonProperty("27")
    public void set27(Integer _27) {
        this._27 = _27;
    }

    @JsonProperty("33")
    public Integer get33() {
        return _33;
    }

    @JsonProperty("33")
    public void set33(Integer _33) {
        this._33 = _33;
    }

    @JsonProperty("34")
    public Integer get34() {
        return _34;
    }

    @JsonProperty("34")
    public void set34(Integer _34) {
        this._34 = _34;
    }

    @JsonProperty("44")
    public Integer get44() {
        return _44;
    }

    @JsonProperty("44")
    public void set44(Integer _44) {
        this._44 = _44;
    }

    @JsonProperty("45")
    public Integer get45() {
        return _45;
    }

    @JsonProperty("45")
    public void set45(Integer _45) {
        this._45 = _45;
    }

    @JsonProperty("46")
    public Integer get46() {
        return _46;
    }

    @JsonProperty("46")
    public void set46(Integer _46) {
        this._46 = _46;
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
