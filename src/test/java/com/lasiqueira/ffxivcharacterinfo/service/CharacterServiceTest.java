package com.lasiqueira.ffxivcharacterinfo.service;

import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.client.ApiAdapter;
import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character.CharacterData;
import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.search.CharacterSearch;
import com.lasiqueira.ffxivcharacterinfo.model.character.Character;
import com.lasiqueira.ffxivcharacterinfo.model.search.Search;
import com.lasiqueira.ffxivcharacterinfo.service.converter.CharacterConverter;
import com.lasiqueira.ffxivcharacterinfo.service.converter.SearchConverter;
import com.lasiqueira.ffxivcharacterinfo.TestFixtures;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

public class CharacterServiceTest {
    private CharacterService characterService;
    private CharacterConverter characterConverter;
    private SearchConverter searchConverter;
    private ApiAdapter apiAdapter;
    private CharacterData characterData;
    private Character character;
    private  CharacterSearch characterSearch;
    private Search search;
    private static final long CHARACTER_ID = 1234l;


    @BeforeEach
    public void setup(){
        characterConverter = Mockito.mock(CharacterConverter.class);
        apiAdapter = Mockito.mock(ApiAdapter.class);
        characterData = TestFixtures.characterData();
        character = TestFixtures.character();
        searchConverter = Mockito.mock(SearchConverter.class);
        characterSearch = TestFixtures.characterSearch();
        search = TestFixtures.search();
        characterService = new CharacterService(apiAdapter, characterConverter, searchConverter);
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
    @DisplayName("Test getting character data with Response Status exception")
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

    @Test
    @DisplayName("Test getting character search")
    public void getCharacterSearchTest() throws IOException {
        when(searchConverter.convert(characterSearch)).thenReturn(search);
        when(apiAdapter.getCharacterSearch(Mockito.anyString(), Mockito.anyString(), Mockito.anyInt())).thenReturn(characterSearch);
        Search result = characterService.getCharacterSearch("name", "server", 1);
        assertNotNull(result);
    }
    @Test
    @DisplayName("Test getting character search with Response Status exception")
    public void getCharacterSearchResponseStatusExceptionTest() throws IOException {
        when(searchConverter.convert(characterSearch)).thenReturn(search);
        when(apiAdapter.getCharacterSearch(Mockito.anyString(), Mockito.anyString(), Mockito.anyInt()))
                .thenThrow(new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, "You must provide the mandatory parameter"));
        assertThrows(ResponseStatusException.class, () -> characterService.getCharacterSearch("name", "server", 1));
    }

    @Test
    @DisplayName("Test getting character search with IO exception")
    public void getCharacterSearchIOExceptionTest() throws IOException {
        when(searchConverter.convert(characterSearch)).thenReturn(search);
        when(apiAdapter.getCharacterSearch(Mockito.anyString(), Mockito.anyString(), Mockito.anyInt())).thenThrow(new IOException());
        assertThrows(IOException.class, () -> characterService.getCharacterSearch("name", "server", 1));
    }

}
