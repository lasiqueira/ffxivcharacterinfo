package com.lasiqueira.ffxivcharacterinfo.api.converter;

import com.lasiqueira.ffxivcharacterinfo.api.dto.character.CharacterResponseDTO;
import com.lasiqueira.ffxivcharacterinfo.model.character.Character;
import io.github.benas.randombeans.EnhancedRandomBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CharacterResponseDTOConverterTest {

    private Character character;
    private CharacterResponseDTOConverter characterResponseDTOConverter;
    @BeforeEach
    public void setup(){
        this.characterResponseDTOConverter = new CharacterResponseDTOConverter();
        this.character = EnhancedRandomBuilder.aNewEnhancedRandom().nextObject(Character.class);
    }

    @Test
    @DisplayName("Test converting character")
    public void convertTest(){
        CharacterResponseDTO characterResponseDTO = characterResponseDTOConverter.convert(character);
        assertNotNull(characterResponseDTO);
        assertEquals(character.getId(),characterResponseDTO.getId());
        assertEquals(character.getName(), characterResponseDTO.getName());
    }

}
