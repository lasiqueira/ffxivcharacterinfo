package com.lasiqueira.ffxivcharacterinfo.service;

import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.client.ApiAdapter;
import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character.CharacterData;
import com.lasiqueira.ffxivcharacterinfo.model.Character;
import io.github.benas.randombeans.EnhancedRandomBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

public class CharacterServiceTest {
    private CharacterService characterService;
    @MockBean
    private CharacterConverter characterConverter;
    @MockBean
    private ApiAdapter apiAdapter;
    private CharacterData characterData;
    private Character character;
    private static final long CHARACTER_ID = 1234l;


    @BeforeEach
    public void setup(){
        characterConverter = Mockito.mock(CharacterConverter.class);
        apiAdapter = Mockito.mock(ApiAdapter.class);
        characterData = EnhancedRandomBuilder.aNewEnhancedRandom().nextObject(CharacterData.class);
        character = EnhancedRandomBuilder.aNewEnhancedRandom().nextObject(Character.class);
        characterService = new CharacterService(apiAdapter, characterConverter);
    }

    @Test
    @DisplayName("Test getting character data")
    public void getCharacterDataTest() throws IOException {
        when(characterConverter.convert(characterData)).thenReturn(character);
        when(apiAdapter.getCharacterData(Mockito.anyLong())).thenReturn(characterData);
        Character result = characterService.getCharacterData(CHARACTER_ID);
        assertNotNull(result);
    }
    @Test
    @DisplayName("Test getting character data with Response Status Exception exception")
    public void getCharacterDataResponseStatusExceptionTest() throws IOException {
        when(characterConverter.convert(characterData)).thenReturn(character);
        when(apiAdapter.getCharacterData(Mockito.anyLong())).thenThrow(new ResponseStatusException(HttpStatus.NOT_FOUND, "Character not found"));
        assertThrows(ResponseStatusException.class, () -> characterService.getCharacterData(CHARACTER_ID));
    }

    @Test
    @DisplayName("Test getting character data with IO exception")
    public void getCharacterDataIOExceptionTest() throws IOException {
        when(characterConverter.convert(characterData)).thenReturn(character);
        when(apiAdapter.getCharacterData(Mockito.anyLong())).thenThrow(new IOException());
        assertThrows(IOException.class, () -> characterService.getCharacterData(CHARACTER_ID));
    }


}
