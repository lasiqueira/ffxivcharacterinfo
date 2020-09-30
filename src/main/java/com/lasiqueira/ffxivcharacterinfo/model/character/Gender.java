package com.lasiqueira.ffxivcharacterinfo.model.character;

import java.util.HashMap;
import java.util.Map;

public enum Gender {
    MALE(1),
    FEMALE(2);

    private int genderCode;
    private static Map map = new HashMap<>();
    Gender(int genderCode) {
        this.genderCode = genderCode;
    }
    static {
        for (Gender gender : Gender.values()) {
            map.put(gender.genderCode, gender);
        }
    }

    public static Gender valueOf(int genderCode) {
        return (Gender) map.get(genderCode);
    }

}
