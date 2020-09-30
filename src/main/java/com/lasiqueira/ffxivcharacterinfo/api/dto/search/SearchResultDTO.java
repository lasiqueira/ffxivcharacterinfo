package com.lasiqueira.ffxivcharacterinfo.api.dto.search;

import java.util.Objects;

public class SearchResultDTO {
    private Long id;
    private String name;
    private String avatar;

    public SearchResultDTO(Long id, String name, String avatar) {
        this.id = id;
        this.name = name;
        this.avatar = avatar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchResultDTO that = (SearchResultDTO) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(avatar, that.avatar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, avatar);
    }

    @Override
    public String toString() {
        return "SearchResultDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}
