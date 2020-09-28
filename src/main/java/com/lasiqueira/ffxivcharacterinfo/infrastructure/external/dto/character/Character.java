
package com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ActiveClassJob",
    "Avatar",
    "Bio",
    "ClassJobs",
    "ClassJobsElemental",
    "DC",
    "FreeCompanyId",
    "GearSet",
    "Gender",
    "GenderID",
    "GrandCompany",
    "GuardianDeity",
    "ID",
    "Lang",
    "Name",
    "Nameday",
    "ParseDate",
    "Portrait",
    "PvPTeamId",
    "Race",
    "Server",
    "Title",
    "TitleTop",
    "Town",
    "Tribe"
})
public class Character {

    @JsonProperty("ActiveClassJob")
    private ActiveClassJob activeClassJob;
    @JsonProperty("Avatar")
    private String avatar;
    @JsonProperty("Bio")
    private String bio;
    @JsonProperty("ClassJobs")
    private List<ClassJob> classJobs = null;

    @JsonProperty("DC")
    private String dC;
    @JsonProperty("FreeCompanyId")
    private String freeCompanyId;
    @JsonProperty("GearSet")
    private GearSet gearSet;
    @JsonProperty("Gender")
    private Integer gender;
    @JsonProperty("GenderID")
    private Integer genderID;
    @JsonProperty("GrandCompany")
    private GrandCompany grandCompany;
    @JsonProperty("GuardianDeity")
    private GuardianDeity guardianDeity;
    @JsonProperty("ID")
    private Long iD;
    @JsonProperty("Lang")
    private Object lang;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Nameday")
    private String nameday;
    @JsonProperty("ParseDate")
    private Integer parseDate;
    @JsonProperty("Portrait")
    private String portrait;
    @JsonProperty("PvPTeamId")
    private Object pvPTeamId;
    @JsonProperty("Race")
    private Race race;
    @JsonProperty("Server")
    private String server;
    @JsonProperty("Title")
    private Title title;
    @JsonProperty("TitleTop")
    private Boolean titleTop;
    @JsonProperty("Town")
    private Town town;
    @JsonProperty("Tribe")
    private Tribe tribe;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ActiveClassJob")
    public ActiveClassJob getActiveClassJob() {
        return activeClassJob;
    }

    @JsonProperty("ActiveClassJob")
    public void setActiveClassJob(ActiveClassJob activeClassJob) {
        this.activeClassJob = activeClassJob;
    }

    @JsonProperty("Avatar")
    public String getAvatar() {
        return avatar;
    }

    @JsonProperty("Avatar")
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @JsonProperty("Bio")
    public String getBio() {
        return bio;
    }

    @JsonProperty("Bio")
    public void setBio(String bio) {
        this.bio = bio;
    }

    @JsonProperty("ClassJobs")
    public List<ClassJob> getClassJobs() {
        return classJobs;
    }

    @JsonProperty("ClassJobs")
    public void setClassJobs(List<ClassJob> classJobs) {
        this.classJobs = classJobs;
    }


    @JsonProperty("DC")
    public String getDC() {
        return dC;
    }

    @JsonProperty("DC")
    public void setDC(String dC) {
        this.dC = dC;
    }

    @JsonProperty("FreeCompanyId")
    public String getFreeCompanyId() {
        return freeCompanyId;
    }

    @JsonProperty("FreeCompanyId")
    public void setFreeCompanyId(String freeCompanyId) {
        this.freeCompanyId = freeCompanyId;
    }

    @JsonProperty("GearSet")
    public GearSet getGearSet() {
        return gearSet;
    }

    @JsonProperty("GearSet")
    public void setGearSet(GearSet gearSet) {
        this.gearSet = gearSet;
    }

    @JsonProperty("Gender")
    public Integer getGender() {
        return gender;
    }

    @JsonProperty("Gender")
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @JsonProperty("GenderID")
    public Integer getGenderID() {
        return genderID;
    }

    @JsonProperty("GenderID")
    public void setGenderID(Integer genderID) {
        this.genderID = genderID;
    }

    @JsonProperty("GrandCompany")
    public GrandCompany getGrandCompany() {
        return grandCompany;
    }

    @JsonProperty("GrandCompany")
    public void setGrandCompany(GrandCompany grandCompany) {
        this.grandCompany = grandCompany;
    }

    @JsonProperty("GuardianDeity")
    public GuardianDeity getGuardianDeity() {
        return guardianDeity;
    }

    @JsonProperty("GuardianDeity")
    public void setGuardianDeity(GuardianDeity guardianDeity) {
        this.guardianDeity = guardianDeity;
    }

    @JsonProperty("ID")
    public Long getID() {
        return iD;
    }

    @JsonProperty("ID")
    public void setID(Long iD) {
        this.iD = iD;
    }

    @JsonProperty("Lang")
    public Object getLang() {
        return lang;
    }

    @JsonProperty("Lang")
    public void setLang(Object lang) {
        this.lang = lang;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Nameday")
    public String getNameday() {
        return nameday;
    }

    @JsonProperty("Nameday")
    public void setNameday(String nameday) {
        this.nameday = nameday;
    }

    @JsonProperty("ParseDate")
    public Integer getParseDate() {
        return parseDate;
    }

    @JsonProperty("ParseDate")
    public void setParseDate(Integer parseDate) {
        this.parseDate = parseDate;
    }

    @JsonProperty("Portrait")
    public String getPortrait() {
        return portrait;
    }

    @JsonProperty("Portrait")
    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    @JsonProperty("PvPTeamId")
    public Object getPvPTeamId() {
        return pvPTeamId;
    }

    @JsonProperty("PvPTeamId")
    public void setPvPTeamId(Object pvPTeamId) {
        this.pvPTeamId = pvPTeamId;
    }

    @JsonProperty("Race")
    public Race getRace() {
        return race;
    }

    @JsonProperty("Race")
    public void setRace(Race race) {
        this.race = race;
    }

    @JsonProperty("Server")
    public String getServer() {
        return server;
    }

    @JsonProperty("Server")
    public void setServer(String server) {
        this.server = server;
    }

    @JsonProperty("Title")
    public Title getTitle() {
        return title;
    }

    @JsonProperty("Title")
    public void setTitle(Title title) {
        this.title = title;
    }

    @JsonProperty("TitleTop")
    public Boolean getTitleTop() {
        return titleTop;
    }

    @JsonProperty("TitleTop")
    public void setTitleTop(Boolean titleTop) {
        this.titleTop = titleTop;
    }

    @JsonProperty("Town")
    public Town getTown() {
        return town;
    }

    @JsonProperty("Town")
    public void setTown(Town town) {
        this.town = town;
    }

    @JsonProperty("Tribe")
    public Tribe getTribe() {
        return tribe;
    }

    @JsonProperty("Tribe")
    public void setTribe(Tribe tribe) {
        this.tribe = tribe;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
