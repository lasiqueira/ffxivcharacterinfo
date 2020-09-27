package com.lasiqueira.ffxivcharacterinfo.api.dto;

public class GrandCompanyDTO {
    private String name;
    private String rank;

    public GrandCompanyDTO() {
    }

    public GrandCompanyDTO(String name, String rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
