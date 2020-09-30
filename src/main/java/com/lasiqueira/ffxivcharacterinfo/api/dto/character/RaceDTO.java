package com.lasiqueira.ffxivcharacterinfo.api.dto.character;

import java.util.Objects;

public class RaceDTO {
    private String name;
    private String tribe;

    public RaceDTO() {
    }

    public RaceDTO(String name, String tribe) {
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
        RaceDTO raceDTO = (RaceDTO) o;
        return Objects.equals(name, raceDTO.name) &&
                Objects.equals(tribe, raceDTO.tribe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, tribe);
    }

    @Override
    public String toString() {
        return "RaceDTO{" +
                "name='" + name + '\'' +
                ", tribe='" + tribe + '\'' +
                '}';
    }
}
