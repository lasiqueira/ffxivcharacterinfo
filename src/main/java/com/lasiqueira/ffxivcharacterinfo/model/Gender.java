package com.lasiqueira.ffxivcharacterinfo.model;

public enum Gender {
    MALE(1),
    FEMALE(2);

    private int genderCode;

    Gender(int genderCode) {
        this.genderCode = genderCode;
    }


}
