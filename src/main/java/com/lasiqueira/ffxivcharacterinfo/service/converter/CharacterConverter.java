package com.lasiqueira.ffxivcharacterinfo.service.converter;

import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character.ActiveClassJob;
import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character.CharacterData;
import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character.Company;
import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character.Rank;
import com.lasiqueira.ffxivcharacterinfo.model.character.*;
import com.lasiqueira.ffxivcharacterinfo.model.character.Character;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class CharacterConverter {
    public Character convert(CharacterData characterData) {
       return new Character(
               characterData.getCharacter().getID(),
               characterData.getCharacter().getAvatar(),
               characterData.getCharacter().getName(),
               convertRace(characterData.getCharacter()),
               characterData.getCharacter().getTitle().getName(),
               characterData.getCharacter().getNameday(),
               Gender.valueOf(characterData.getCharacter().getGender()),
               convertActiveClass(characterData.getCharacter().getActiveClassJob()),
               convertClasses(characterData.getCharacter().getClassJobs()),
               convertGrandCompany(characterData.getCharacter().getGrandCompany()),
               characterData.getCharacter().getGuardianDeity().getName(),
               characterData.getCharacter().getDC(),
               characterData.getCharacter().getServer()
       );

    }

    private List<ClassJob> convertClasses(List<com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character.ClassJob> classJobs) {
        return classJobs.stream()
                .map(classJob -> new ClassJob(classJob.getClass_().getClassJobCategory().getName(),
                        classJob.getClass_().getName(),
                        classJob.getJob().getName(),
                        classJob.getLevel()))
                .collect(Collectors.toList());
    }

    private ClassJob convertActiveClass(ActiveClassJob activeClassJob) {
        return new ClassJob(
                activeClassJob.getClass_().getClassJobCategory().getName(),
                activeClassJob.getClass_().getName(),
                activeClassJob.getJob().getName(),
                activeClassJob.getLevel()
                );
    }

    private Race convertRace(com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character.Character character) {
        return new Race(character.getRace().getName(), character.getTribe().getName());

    }

    private GrandCompany convertGrandCompany(com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character.GrandCompany grandCompany) {
        return new GrandCompany(
                Optional.ofNullable(grandCompany.getCompany()).orElse(new Company()).getName(),
                Optional.ofNullable(grandCompany.getRank()).orElse(new Rank()).getName()
        );

    }
}
