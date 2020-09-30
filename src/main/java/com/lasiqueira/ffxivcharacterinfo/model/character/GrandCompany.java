package com.lasiqueira.ffxivcharacterinfo.model.character;

import java.util.Objects;

public class GrandCompany {
    private String name;
    private String rank;

    public GrandCompany() {
    }

    public GrandCompany(String name, String rank) {
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
        GrandCompany that = (GrandCompany) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(rank, that.rank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rank);
    }

    @Override
    public String toString() {
        return "GrandCompany{" +
                "name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
