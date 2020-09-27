package com.lasiqueira.ffxivcharacterinfo.model;

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
}
