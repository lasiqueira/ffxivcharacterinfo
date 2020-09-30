package com.lasiqueira.ffxivcharacterinfo.model.character;

import java.util.Objects;

public class Race {
    private String name;
    private String tribe;

    public Race() {
    }

    public Race(String name, String tribe) {
        this.name = name;
        this.tribe = tribe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTribe() {
        return tribe;
    }

    public void setTribe(String tribe) {
        this.tribe = tribe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Race race = (Race) o;
        return Objects.equals(name, race.name) &&
                Objects.equals(tribe, race.tribe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, tribe);
    }

    @Override
    public String toString() {
        return "Race{" +
                "name='" + name + '\'' +
                ", tribe='" + tribe + '\'' +
                '}';
    }
}
