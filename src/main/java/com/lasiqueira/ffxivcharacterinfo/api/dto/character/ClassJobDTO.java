package com.lasiqueira.ffxivcharacterinfo.api.dto.character;

public class ClassJobDTO {
   private String category;
    private String name;
    private String job;
    private int level;

    public ClassJobDTO(){}
    public ClassJobDTO(String category, String name, String job, int level) {
        this.category = category;
        this.name = name;
        this.job = job;
        this.level = level;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

}
