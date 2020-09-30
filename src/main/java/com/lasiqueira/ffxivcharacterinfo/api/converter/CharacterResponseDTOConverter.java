package com.lasiqueira.ffxivcharacterinfo.api.converter;

import com.lasiqueira.ffxivcharacterinfo.api.dto.character.*;
import com.lasiqueira.ffxivcharacterinfo.model.character.Character;
import com.lasiqueira.ffxivcharacterinfo.model.character.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CharacterResponseDTOConverter {
    public CharacterResponseDTO convert(Character character) {
        CharacterResponseDTO characterResponseDTO = new CharacterResponseDTO();
        characterResponseDTO.setId(character.getId());
        characterResponseDTO.setAvatar(character.getAvatar());
        characterResponseDTO.setName(character.getName());
        characterResponseDTO.setDataCenter(character.getDataCenter());
        characterResponseDTO.setGender(GenderDTO.valueOf(character.getGender().name()));
        characterResponseDTO.setServer(character.getServer());
        characterResponseDTO.setNameDay(character.getNameDay());
        characterResponseDTO.setTitle(character.getTitle());
        characterResponseDTO.setGuardianDeity(character.getGuardianDeity());

        characterResponseDTO.setGrandCompany(convertGrandCompany(character.getGrandCompany()));
        characterResponseDTO.setRace(convertRace(character.getRace()));
        characterResponseDTO.setActiveClass(convertClass(character.getActiveClass()));
        characterResponseDTO.setClasses(convertClasses(character.getClasses()));
       return characterResponseDTO;
    }

    private List<ClassJobDTO> convertClasses(List<ClassJob> classJobs) {
        List<ClassJobDTO> classJobDTOList = new ArrayList<>();
        classJobs.stream()
                .map(this::convertClass)
                .forEach(classJobDTOList::add);
        return classJobDTOList;
    }

    private ClassJobDTO convertClass(ClassJob classJob) {
        ClassJobDTO classJobDTO = new ClassJobDTO();
        classJobDTO.setCategory(classJob.getCategory());
        classJobDTO.setName(classJob.getName());
        classJobDTO.setJob(classJob.getJob());
        classJobDTO.setLevel(classJob.getLevel());
        return classJobDTO;
    }

    private RaceDTO convertRace(Race race) {
        RaceDTO raceDTO = new RaceDTO();
        raceDTO.setName(race.getName());
        raceDTO.setTribe(race.getTribe());
        return raceDTO;
    }

    private GrandCompanyDTO convertGrandCompany(GrandCompany grandCompany) {
        GrandCompanyDTO grandCompanyDTO = new GrandCompanyDTO();
        grandCompanyDTO.setName(grandCompany.getName());
        grandCompanyDTO.setRank(grandCompany.getRank());
        return grandCompanyDTO;
    }
}
