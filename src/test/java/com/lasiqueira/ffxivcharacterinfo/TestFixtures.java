package com.lasiqueira.ffxivcharacterinfo;

import com.lasiqueira.ffxivcharacterinfo.api.dto.character.*;
import com.lasiqueira.ffxivcharacterinfo.api.dto.search.SearchPaginationDTO;
import com.lasiqueira.ffxivcharacterinfo.api.dto.search.SearchResponseDTO;
import com.lasiqueira.ffxivcharacterinfo.api.dto.search.SearchResultDTO;
import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character.*;
import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.search.CharacterSearch;
import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.search.Pagination;
import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.search.Result;
import com.lasiqueira.ffxivcharacterinfo.model.character.Gender;
import com.lasiqueira.ffxivcharacterinfo.model.search.Search;
import com.lasiqueira.ffxivcharacterinfo.model.search.SearchPagination;
import com.lasiqueira.ffxivcharacterinfo.model.search.SearchResult;

import java.util.ArrayList;
import java.util.List;

/**
 * Hand-written test data for the external (XIVAPI), model and API layers.
 * Mutable lists are used so tests can modify the fixtures.
 */
public final class TestFixtures {
    public static final long CHARACTER_ID = 7309689L;
    public static final String CHARACTER_NAME = "Test Character";
    public static final String AVATAR = "https://img2.finalfantasyxiv.com/f/avatar.jpg";

    private TestFixtures() {
    }

    // ----- external (XIVAPI) DTOs -----

    public static CharacterData characterData() {
        com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character.Character character =
                new com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character.Character();
        character.setID(CHARACTER_ID);
        character.setAvatar(AVATAR);
        character.setName(CHARACTER_NAME);
        character.setRace(named(new Race(), "Miqo'te"));
        character.setTribe(named(new Tribe(), "Seeker of the Sun"));
        character.setTitle(named(new Title(), "the Insatiable"));
        character.setNameday("1st Sun of the 1st Astral Moon");
        character.setGender(1);
        character.setActiveClassJob(activeClassJob());
        character.setClassJobs(new ArrayList<>(List.of(classJob("Disciple of War", "Gladiator", "Paladin", 90))));
        character.setGrandCompany(grandCompany());
        GuardianDeity guardianDeity = new GuardianDeity();
        guardianDeity.setName("Menphina, the Lover");
        character.setGuardianDeity(guardianDeity);
        character.setDC("Light");
        character.setServer("Lich");

        CharacterData characterData = new CharacterData();
        characterData.setCharacter(character);
        return characterData;
    }

    public static CharacterSearch characterSearch() {
        Pagination pagination = new Pagination();
        pagination.setPage(1);
        pagination.setPageNext(2);
        pagination.setPagePrev(null);
        pagination.setPageTotal(2);
        pagination.setResults(1);
        pagination.setResultsPerPage(50);
        pagination.setResultsTotal(51);

        Result result = new Result();
        result.setID(CHARACTER_ID);
        result.setName(CHARACTER_NAME);
        result.setAvatar(AVATAR);
        result.setServer("Lich");

        CharacterSearch characterSearch = new CharacterSearch();
        characterSearch.setPagination(pagination);
        characterSearch.setResults(new ArrayList<>(List.of(result)));
        return characterSearch;
    }

    // ----- model -----

    public static com.lasiqueira.ffxivcharacterinfo.model.character.Character character() {
        return new com.lasiqueira.ffxivcharacterinfo.model.character.Character(
                CHARACTER_ID,
                AVATAR,
                CHARACTER_NAME,
                new com.lasiqueira.ffxivcharacterinfo.model.character.Race("Miqo'te", "Seeker of the Sun"),
                "the Insatiable",
                "1st Sun of the 1st Astral Moon",
                Gender.MALE,
                new com.lasiqueira.ffxivcharacterinfo.model.character.ClassJob("Disciple of War", "Gladiator", "Paladin", 90),
                new ArrayList<>(List.of(new com.lasiqueira.ffxivcharacterinfo.model.character.ClassJob("Disciple of War", "Gladiator", "Paladin", 90))),
                new com.lasiqueira.ffxivcharacterinfo.model.character.GrandCompany("Maelstrom", "Storm Captain"),
                "Menphina, the Lover",
                "Light",
                "Lich");
    }

    public static Search search() {
        return new Search(
                new SearchPagination(1, 2, null, 2, 1, 50, 51),
                new ArrayList<>(List.of(new SearchResult(CHARACTER_ID, CHARACTER_NAME, AVATAR))));
    }

    // ----- API DTOs -----

    public static CharacterResponseDTO characterResponseDTO() {
        return new CharacterResponseDTO(
                CHARACTER_ID,
                AVATAR,
                CHARACTER_NAME,
                new RaceDTO("Miqo'te", "Seeker of the Sun"),
                "the Insatiable",
                "1st Sun of the 1st Astral Moon",
                GenderDTO.MALE,
                new ClassJobDTO("Disciple of War", "Gladiator", "Paladin", 90),
                new ArrayList<>(List.of(new ClassJobDTO("Disciple of War", "Gladiator", "Paladin", 90))),
                new GrandCompanyDTO("Maelstrom", "Storm Captain"),
                "Menphina, the Lover",
                "Light",
                "Lich");
    }

    public static SearchResponseDTO searchResponseDTO() {
        return new SearchResponseDTO(
                new SearchPaginationDTO(1, 2, null, 2, 1, 50, 51),
                new ArrayList<>(List.of(new SearchResultDTO(CHARACTER_ID, CHARACTER_NAME, AVATAR))));
    }

    // ----- helpers -----

    private static ActiveClassJob activeClassJob() {
        ActiveClassJob activeClassJob = new ActiveClassJob();
        activeClassJob.setClass_(clazz("Disciple of War", "Gladiator"));
        activeClassJob.setJob(named(new Job(), "Paladin"));
        activeClassJob.setLevel(90);
        return activeClassJob;
    }

    private static ClassJob classJob(String category, String className, String jobName, int level) {
        ClassJob classJob = new ClassJob();
        classJob.setClass(clazz(category, className));
        classJob.setJob(named(new Job(), jobName));
        classJob.setLevel(level);
        return classJob;
    }

    private static com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character.Class clazz(String category, String name) {
        ClassJobCategory classJobCategory = new ClassJobCategory();
        classJobCategory.setName(category);
        com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character.Class clazz =
                new com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character.Class();
        clazz.setClassJobCategory(classJobCategory);
        clazz.setName(name);
        return clazz;
    }

    private static com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character.GrandCompany grandCompany() {
        com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character.GrandCompany grandCompany =
                new com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character.GrandCompany();
        Company company = new Company();
        company.setName("Maelstrom");
        grandCompany.setCompany(company);
        grandCompany.setRank(named(new Rank(), "Storm Captain"));
        return grandCompany;
    }

    private static Race named(Race race, String name) {
        race.setName(name);
        return race;
    }

    private static Tribe named(Tribe tribe, String name) {
        tribe.setName(name);
        return tribe;
    }

    private static Title named(Title title, String name) {
        title.setName(name);
        return title;
    }

    private static Job named(Job job, String name) {
        job.setName(name);
        return job;
    }

    private static Rank named(Rank rank, String name) {
        rank.setName(name);
        return rank;
    }
}
