package com.lasiqueira.ffxivcharacterinfo.api.dto.character;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GrandCompanyDTO that = (GrandCompanyDTO) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(rank, that.rank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rank);
    }

    @Override
    public String toString() {
        return "GrandCompanyDTO{" +
                "name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
