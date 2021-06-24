package com.lasiqueira.ffxivcharacterinfo.api.converter;

import com.lasiqueira.ffxivcharacterinfo.api.dto.character.*;
import com.lasiqueira.ffxivcharacterinfo.model.character.Character;
import com.lasiqueira.ffxivcharacterinfo.model.character.*;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CharacterResponseDTOConverter {
    public CharacterResponseDTO convert(Character character) {
        return new CharacterResponseDTO(
                character.getId(),
                character.getAvatar(),
                character.getName(),
                convertRace(character.getRace()),
                character.getTitle(),
                character.getNameDay(),
                GenderDTO.valueOf(character.getGender().name()),
                convertClass(character.getActiveClass()),
                convertClasses(character.getClasses()),
                convertGrandCompany(character.getGrandCompany()),
                character.getGuardianDeity(),
                character.getDataCenter(),
                character.getServer()
                );
    }

    private List<ClassJobDTO> convertClasses(List<ClassJob> classJobs) {
       return classJobs.stream()
                .map(this::convertClass)
                .collect(Collectors.toList());
    }

    private ClassJobDTO convertClass(ClassJob classJob) {
        return new ClassJobDTO(classJob.getCategory(), classJob.getName(), classJob.getJob(), classJob.getLevel());
    }

    private RaceDTO convertRace(Race race) {
        return new RaceDTO(race.getName(), race.getTribe());
    }

    private GrandCompanyDTO convertGrandCompany(GrandCompany grandCompany) {
       return new GrandCompanyDTO(grandCompany.getName(), grandCompany.getRank());
    }
}
