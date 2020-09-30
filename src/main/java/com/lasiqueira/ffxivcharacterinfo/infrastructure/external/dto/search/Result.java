
package com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.search;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Avatar",
    "FeastMatches",
    "ID",
    "Lang",
    "Name",
    "Rank",
    "RankIcon",
    "Server"
})
public class Result {

    @JsonProperty("Avatar")
    private String avatar;
    @JsonProperty("FeastMatches")
    private Integer feastMatches;
    @JsonProperty("ID")
    private Integer iD;
    @JsonProperty("Lang")
    private String lang;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Rank")
    private Object rank;
    @JsonProperty("RankIcon")
    private Object rankIcon;
    @JsonProperty("Server")
    private String server;

    @JsonProperty("Avatar")
    public String getAvatar() {
        return avatar;
    }

    @JsonProperty("Avatar")
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @JsonProperty("FeastMatches")
    public Integer getFeastMatches() {
        return feastMatches;
    }

    @JsonProperty("FeastMatches")
    public void setFeastMatches(Integer feastMatches) {
        this.feastMatches = feastMatches;
    }

    @JsonProperty("ID")
    public Integer getID() {
        return iD;
    }

    @JsonProperty("ID")
    public void setID(Integer iD) {
        this.iD = iD;
    }

    @JsonProperty("Lang")
    public String getLang() {
        return lang;
    }

    @JsonProperty("Lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Rank")
    public Object getRank() {
        return rank;
    }

    @JsonProperty("Rank")
    public void setRank(Object rank) {
        this.rank = rank;
    }

    @JsonProperty("RankIcon")
    public Object getRankIcon() {
        return rankIcon;
    }

    @JsonProperty("RankIcon")
    public void setRankIcon(Object rankIcon) {
        this.rankIcon = rankIcon;
    }

    @JsonProperty("Server")
    public String getServer() {
        return server;
    }

    @JsonProperty("Server")
    public void setServer(String server) {
        this.server = server;
    }

}
