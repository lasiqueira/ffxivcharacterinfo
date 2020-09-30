package com.lasiqueira.ffxivcharacterinfo.api.dto.character;

import java.util.HashMap;
import java.util.Map;

public enum GenderDTO {
    MALE(1),
    FEMALE(2);

    private int genderCode;
    private static Map map = new HashMap<>();
    GenderDTO(int genderCode) {
        this.genderCode = genderCode;
    }
    static {
        for (GenderDTO gender : GenderDTO.values()) {
            map.put(gender.genderCode, gender);
        }
    }

    public static GenderDTO valueOf(int pageType) {
        return (GenderDTO) map.get(pageType);
    }

}
