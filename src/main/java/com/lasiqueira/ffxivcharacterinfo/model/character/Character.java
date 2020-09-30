package com.lasiqueira.ffxivcharacterinfo.model.character;

import java.util.List;
import java.util.Objects;

public class Character {
    private Long id;
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

    public Character() {
    }

    public Character(Long id,
                     String avatar,
                     String name,
                     Race race,
                     String title,
                     String nameDay,
                     Gender gender,
                     ClassJob activeClass,
                     List<ClassJob> classes,
                     GrandCompany grandCompany,
                     String guardianDeity,
                     String dataCenter,
                     String server) {
        this.id = id;
        this.avatar = avatar;
        this.name = name;
        this.race = race;
        this.title = title;
        this.nameDay = nameDay;
        this.gender = gender;
        this.activeClass = activeClass;
        this.classes = classes;
        this.grandCompany = grandCompany;
        this.guardianDeity = guardianDeity;
        this.dataCenter = dataCenter;
        this.server = server;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return Objects.equals(id, character.id) &&
                Objects.equals(avatar, character.avatar) &&
                Objects.equals(name, character.name) &&
                Objects.equals(race, character.race) &&
                Objects.equals(title, character.title) &&
                Objects.equals(nameDay, character.nameDay) &&
                gender == character.gender &&
                Objects.equals(activeClass, character.activeClass) &&
                Objects.equals(classes, character.classes) &&
                Objects.equals(grandCompany, character.grandCompany) &&
                Objects.equals(guardianDeity, character.guardianDeity) &&
                Objects.equals(dataCenter, character.dataCenter) &&
                Objects.equals(server, character.server);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, avatar, name, race, title, nameDay, gender, activeClass, classes, grandCompany, guardianDeity, dataCenter, server);
    }

    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", avatar='" + avatar + '\'' +
                ", name='" + name + '\'' +
                ", race=" + race +
                ", title='" + title + '\'' +
                ", nameDay='" + nameDay + '\'' +
                ", gender=" + gender +
                ", activeClass=" + activeClass +
                ", classes=" + classes +
                ", grandCompany=" + grandCompany +
                ", guardianDeity='" + guardianDeity + '\'' +
                ", dataCenter='" + dataCenter + '\'' +
                ", server='" + server + '\'' +
                '}';
    }
}
