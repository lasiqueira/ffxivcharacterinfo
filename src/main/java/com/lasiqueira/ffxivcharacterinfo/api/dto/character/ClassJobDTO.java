package com.lasiqueira.ffxivcharacterinfo.api.dto.character;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassJobDTO that = (ClassJobDTO) o;
        return level == that.level &&
                Objects.equals(category, that.category) &&
                Objects.equals(name, that.name) &&
                Objects.equals(job, that.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, name, job, level);
    }

    @Override
    public String toString() {
        return "ClassJobDTO{" +
                "category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", level=" + level +
                '}';
    }
}
