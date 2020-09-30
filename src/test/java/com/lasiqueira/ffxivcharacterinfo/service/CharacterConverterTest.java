package com.lasiqueira.ffxivcharacterinfo.service;

import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character.CharacterData;
import com.lasiqueira.ffxivcharacterinfo.model.Character;
import io.github.benas.randombeans.EnhancedRandomBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CharacterConverterTest {

    private CharacterData characterData;
    private CharacterConverter characterConverter;
    @BeforeEach
    public void setup(){
        this.characterConverter = new CharacterConverter();
        this.characterData = EnhancedRandomBuilder.aNewEnhancedRandom().nextObject(CharacterData.class);
        this.characterData.getCharacter().setGender(1);
    }

    @Test
    public void convertTest(){
        Character character = characterConverter.convert(characterData);
        assertNotNull(character);
        assertEquals(characterData.getCharacter().getID(),character.getId());
        assertEquals(characterData.getCharacter().getName(), character.getName());
    }

    //These are the only nullable fields;
    @Test
    @DisplayName("Test converting with null Company")
    public void convertWithNullCompanyTest(){
        this.characterData.getCharacter().getGrandCompany().setCompany(null);
        Character character = characterConverter.convert(characterData);
        assertNotNull(character);
        assertNull(character.getGrandCompany().getName());
    }
    @Test
    @DisplayName("Test converting with null Rank")
    public void convertWithNullRankTest(){
        this.characterData.getCharacter().getGrandCompany().setRank(null);
        Character character = characterConverter.convert(characterData);
        assertNotNull(character);
        assertNull(character.getGrandCompany().getRank());
    }
}
