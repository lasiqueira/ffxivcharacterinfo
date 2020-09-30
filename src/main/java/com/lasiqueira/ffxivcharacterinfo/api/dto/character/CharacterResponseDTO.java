package com.lasiqueira.ffxivcharacterinfo.api.dto.character;
import java.util.List;
import java.util.Objects;

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

    public CharacterResponseDTO() {
    }

    public CharacterResponseDTO(Long id,
                                String avatar,
                                String name,
                                RaceDTO race,
                                String title,
                                String nameDay,
                                GenderDTO gender,
                                ClassJobDTO activeClass,
                                List<ClassJobDTO> classes,
                                GrandCompanyDTO grandCompany,
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CharacterResponseDTO that = (CharacterResponseDTO) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(avatar, that.avatar) &&
                Objects.equals(name, that.name) &&
                Objects.equals(race, that.race) &&
                Objects.equals(title, that.title) &&
                Objects.equals(nameDay, that.nameDay) &&
                gender == that.gender &&
                Objects.equals(activeClass, that.activeClass) &&
                Objects.equals(classes, that.classes) &&
                Objects.equals(grandCompany, that.grandCompany) &&
                Objects.equals(guardianDeity, that.guardianDeity) &&
                Objects.equals(dataCenter, that.dataCenter) &&
                Objects.equals(server, that.server);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, avatar, name, race, title, nameDay, gender, activeClass, classes, grandCompany, guardianDeity, dataCenter, server);
    }

    @Override
    public String toString() {
        return "CharacterResponseDTO{" +
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
