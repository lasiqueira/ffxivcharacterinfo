package com.lasiqueira.ffxivcharacterinfo.service;

import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character.ActiveClassJob;
import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character.CharacterData;
import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character.Company;
import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character.Rank;
import com.lasiqueira.ffxivcharacterinfo.model.character.*;
import com.lasiqueira.ffxivcharacterinfo.model.character.Character;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class CharacterConverter {
    public Character convert(CharacterData characterData) {
       Character character = new Character();
       character.setId(characterData.getCharacter().getID());
       character.setAvatar(characterData.getCharacter().getAvatar());
       character.setName(characterData.getCharacter().getName());
       character.setDataCenter(characterData.getCharacter().getDC());
       character.setGender(Gender.valueOf(characterData.getCharacter().getGender()));
       character.setServer(characterData.getCharacter().getServer());
       character.setNameDay(characterData.getCharacter().getNameday());
       character.setTitle(characterData.getCharacter().getTitle().getName());
       character.setGuardianDeity(characterData.getCharacter().getGuardianDeity().getName());

       character.setGrandCompany(convertGrandCompany(characterData.getCharacter().getGrandCompany()));
       character.setRace(convertRace(characterData.getCharacter()));
       character.setActiveClass(convertActiveClass(characterData.getCharacter().getActiveClassJob()));
       character.setClasses(convertClasses(characterData.getCharacter().getClassJobs()));
       return character;
    }

    private List<ClassJob> convertClasses(List<com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character.ClassJob> classJobs) {
        List<ClassJob> classJobList = new ArrayList<>();
        classJobs.forEach(classJob ->{
                ClassJob classJobNew = new ClassJob();
                classJobNew.setCategory(classJob.getClass_().getClassJobCategory().getName());
                classJobNew.setName(classJob.getClass_().getName());
                classJobNew.setJob(classJob.getJob().getName());
                classJobNew.setLevel(classJob.getLevel());
                classJobList.add(classJobNew);
                }
        );
        return classJobList;
    }

    private ClassJob convertActiveClass(ActiveClassJob activeClassJob) {
        ClassJob classJob = new ClassJob();
        classJob.setCategory(activeClassJob.getClass_().getClassJobCategory().getName());
        classJob.setName(activeClassJob.getClass_().getName());
        classJob.setJob(activeClassJob.getJob().getName());
        classJob.setLevel(activeClassJob.getLevel());
        return classJob;
    }

    private Race convertRace(com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character.Character character) {
        Race race = new Race();
        race.setName(character.getRace().getName());
        race.setTribe(character.getTribe().getName());
        return race;
    }

    private GrandCompany convertGrandCompany(com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character.GrandCompany grandCompany) {
        GrandCompany grandComp = new GrandCompany();
        grandComp.setName(Optional.ofNullable(grandCompany.getCompany()).orElse(new Company()).getName());
        grandComp.setRank(Optional.ofNullable(grandCompany.getRank()).orElse(new Rank()).getName());
        return grandComp;
    }
}
