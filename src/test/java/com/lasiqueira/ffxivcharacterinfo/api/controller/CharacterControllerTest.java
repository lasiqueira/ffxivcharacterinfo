package com.lasiqueira.ffxivcharacterinfo.api.controller;

import com.lasiqueira.ffxivcharacterinfo.api.converter.CharacterResponseDTOConverter;
import com.lasiqueira.ffxivcharacterinfo.api.converter.SearchResponseDTOConverter;
import com.lasiqueira.ffxivcharacterinfo.api.dto.character.CharacterResponseDTO;
import com.lasiqueira.ffxivcharacterinfo.api.dto.search.SearchResponseDTO;
import com.lasiqueira.ffxivcharacterinfo.model.character.Character;
import com.lasiqueira.ffxivcharacterinfo.model.search.Search;
import com.lasiqueira.ffxivcharacterinfo.service.CharacterService;
import com.lasiqueira.ffxivcharacterinfo.TestFixtures;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.cache.test.autoconfigure.AutoConfigureCache;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(CharacterController.class)
@AutoConfigureCache
public class CharacterControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockitoBean
    private CharacterResponseDTOConverter characterResponseDTOConverter;
    @MockitoBean
    private SearchResponseDTOConverter searchResponseDTOConverter;
    @MockitoBean
    private CharacterService characterService;
    private CharacterResponseDTO characterResponseDTO;
    private SearchResponseDTO searchResponseDTO;

    private Character character;
    private Search search;
    private static final long CHARACTER_ID = 1345l;
    @BeforeEach
    public void setup(){
        this.character = TestFixtures.character();
        this.characterResponseDTO = TestFixtures.characterResponseDTO();
        this.search = TestFixtures.search();
        this.searchResponseDTO = TestFixtures.searchResponseDTO();

    }

    @Test
    @DisplayName("Test getting the character data")
    public void getCharacterDataTest() throws Exception {
        when(characterService.getCharacterData(Mockito.anyLong())).thenReturn(character);
        when(characterResponseDTOConverter.convert(character)).thenReturn(characterResponseDTO);
        mockMvc.perform(get("/v1/character/{id}", CHARACTER_ID))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    @DisplayName("Test getting the character data with no data found")
    public void getCharacterDataNotFoundTest() throws Exception {
        when(characterService.getCharacterData(Mockito.anyLong())).thenThrow(new ResponseStatusException(HttpStatus.NOT_FOUND, "Character not found"));
        when(characterResponseDTOConverter.convert(character)).thenReturn(characterResponseDTO);
        mockMvc.perform(get("/v1/character/{id}", CHARACTER_ID))
                .andExpect(status().isNotFound())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    @DisplayName("Test getting the character data with bad request")
    public void getCharacterDataBadRequestTest() throws Exception {
        when(characterService.getCharacterData(Mockito.anyLong())).thenThrow(new ResponseStatusException(HttpStatus.BAD_REQUEST, "Request was invalid"));
        when(characterResponseDTOConverter.convert(character)).thenReturn(characterResponseDTO);
        mockMvc.perform(get("/v1/character/{id}", CHARACTER_ID))
                .andExpect(status().isBadRequest())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    @DisplayName("Test getting the character data with internal server error")
    public void getCharacterDataInternalServerErrorTest() throws Exception {
        when(characterService.getCharacterData(Mockito.anyLong()))
                .thenThrow(new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error"));
        when(characterResponseDTOConverter.convert(character)).thenReturn(characterResponseDTO);
        mockMvc.perform(get("/v1/character/{id}", CHARACTER_ID))
                .andExpect(status().isInternalServerError())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }
    @Test
    @DisplayName("Test getting the character data with IO Exception")
    public void getCharacterDataIOExceptionTest() throws Exception {
        when(characterService.getCharacterData(Mockito.anyLong())).thenThrow(new IOException());
        when(characterResponseDTOConverter.convert(character)).thenReturn(characterResponseDTO);
        mockMvc.perform(get("/v1/character/{id}", CHARACTER_ID))
                .andExpect(status().isInternalServerError())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    @DisplayName("Test getting the character search")
    public void getCharacterSearchTest() throws Exception {
        when(characterService.getCharacterSearch(Mockito.anyString(), Mockito.anyString(), Mockito.anyInt())).thenReturn(search);
        when(searchResponseDTOConverter.convert(search)).thenReturn(searchResponseDTO);
        mockMvc.perform(
                    get("/v1/character/search")
                    .param("name", "name")
                    .param("server", "server")
                    .param("page", "1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }
    @Test
    @DisplayName("Test getting the character search without parameters")
    public void getCharacterSearchNoParamsTest() throws Exception {
        when(characterService.getCharacterSearch(Mockito.anyString(), Mockito.anyString(), Mockito.anyInt())).thenReturn(search);
        when(searchResponseDTOConverter.convert(search)).thenReturn(searchResponseDTO);
        mockMvc.perform(
                get("/v1/character/search"))
                .andExpect(status().isBadRequest())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    @DisplayName("Test getting the character search with not acceptable")
    public void getCharacterSearchNotAcceptableTest() throws Exception {
        when(characterService.getCharacterSearch(
                Mockito.anyString(),
                Mockito.anyString(),
                Mockito.anyInt()))
                .thenThrow(new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, "You must provide the mandatory parameter"));
        when(searchResponseDTOConverter.convert(search)).thenReturn(searchResponseDTO);
        mockMvc.perform(
                get("/v1/character/search")
                        .param("name", "name")
                        .param("server", "server")
                        .param("page", "1"))
                .andExpect(status().isNotAcceptable())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    @DisplayName("Test getting the character search with internal server error")
    public void getCharacterSearchInternalServerErrorTest() throws Exception {
        when(characterService.getCharacterSearch(
                Mockito.anyString(),
                Mockito.anyString(),
                Mockito.anyInt()))
                .thenThrow(new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error"));
        when(searchResponseDTOConverter.convert(search)).thenReturn(searchResponseDTO);
        mockMvc.perform(
                get("/v1/character/search")
                        .param("name", "name")
                        .param("server", "server")
                        .param("page", "1"))
                .andExpect(status().isInternalServerError())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }


    @Test
    @DisplayName("Test getting the character search with IO Exception")
    public void getCharacterSearchIOExceptionTest() throws Exception {
        when(characterService.getCharacterSearch(Mockito.anyString(), Mockito.anyString(), Mockito.anyInt())).thenThrow(new IOException());
        when(searchResponseDTOConverter.convert(search)).thenReturn(searchResponseDTO);
        mockMvc.perform(
                get("/v1/character/search")
                        .param("name", "name")
                        .param("server", "server")
                        .param("page", "1"))
                .andExpect(status().isInternalServerError())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

}
