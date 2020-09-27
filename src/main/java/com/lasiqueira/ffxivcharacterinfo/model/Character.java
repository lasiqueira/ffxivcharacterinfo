package com.lasiqueira.ffxivcharacterinfo.model;

import java.util.List;

public class Character {
    private String avatar;
    private String name;
    private Race race;
    private String title;
    private String nameDay;
    private Gender gender;
    private ClassJob activeClass;
    private List<ClassJob> classes;
    private GrandCompany grandCompany;

    private String guardianDeity;

    private String dataCenter;
    private String server;

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNameDay() {
        return nameDay;
    }

    public void setNameDay(String nameDay) {
        this.nameDay = nameDay;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public ClassJob getActiveClass() {
        return activeClass;
    }

    public void setActiveClass(ClassJob activeClass) {
        this.activeClass = activeClass;
    }

    public List<ClassJob> getClasses() {
        return classes;
    }

    public void setClasses(List<ClassJob> classes) {
        this.classes = classes;
    }

    public GrandCompany getGrandCompany() {
        return grandCompany;
    }

    public void setGrandCompany(GrandCompany grandCompany) {
        this.grandCompany = grandCompany;
    }

    public String getGuardianDeity() {
        return guardianDeity;
    }

    public void setGuardianDeity(String guardianDeity) {
        this.guardianDeity = guardianDeity;
    }

    public String getDataCenter() {
        return dataCenter;
    }

    public void setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }
}
