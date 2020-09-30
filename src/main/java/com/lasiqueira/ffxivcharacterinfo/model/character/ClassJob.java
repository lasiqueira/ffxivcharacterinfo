package com.lasiqueira.ffxivcharacterinfo.model.character;

import java.util.Objects;

public class ClassJob {
   private String category;
    private String name;
    private String job;
    private int level;

    public ClassJob(){}
    public ClassJob(String category, String name, String job, int level) {
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
        ClassJob classJob = (ClassJob) o;
        return level == classJob.level &&
                Objects.equals(category, classJob.category) &&
                Objects.equals(name, classJob.name) &&
                Objects.equals(job, classJob.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, name, job, level);
    }

    @Override
    public String toString() {
        return "ClassJob{" +
                "category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", level=" + level +
                '}';
    }
}
