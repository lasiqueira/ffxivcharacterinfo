package com.lasiqueira.ffxivcharacterinfo.api.dto;
import java.util.List;

public class CharacterResponseDTO {
    private Long id;
    private String avatar;
    private String name;
    private RaceDTO race;
    private String title;
    private String nameDay;
    private GenderDTO gender;
    private ClassJobDTO activeClass;
    private List<ClassJobDTO> classes;
    private GrandCompanyDTO grandCompany;

    private String guardianDeity;

    private String dataCenter;
    private String server;

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

    public RaceDTO getRace() {
        return race;
    }

    public void setRace(RaceDTO race) {
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

    public GenderDTO getGender() {
        return gender;
    }

    public void setGender(GenderDTO gender) {
        this.gender = gender;
    }

    public ClassJobDTO getActiveClass() {
        return activeClass;
    }

    public void setActiveClass(ClassJobDTO activeClass) {
        this.activeClass = activeClass;
    }

    public List<ClassJobDTO> getClasses() {
        return classes;
    }

    public void setClasses(List<ClassJobDTO> classes) {
        this.classes = classes;
    }

    public GrandCompanyDTO getGrandCompany() {
        return grandCompany;
    }

    public void setGrandCompany(GrandCompanyDTO grandCompany) {
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
