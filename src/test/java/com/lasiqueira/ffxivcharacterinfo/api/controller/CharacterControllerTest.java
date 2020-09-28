package com.lasiqueira.ffxivcharacterinfo.api.controller;

import com.lasiqueira.ffxivcharacterinfo.api.dto.CharacterResponseDTO;
import com.lasiqueira.ffxivcharacterinfo.model.Character;
import com.lasiqueira.ffxivcharacterinfo.service.CharacterService;
import io.github.benas.randombeans.EnhancedRandomBuilder;
import ma.glasnost.orika.MapperFacade;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
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
public class CharacterControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private MapperFacade mapperFacade;
    @MockBean
    private CharacterService characterService;
    private CharacterResponseDTO characterResponseDTO;

    private Character character;
    private static final long CHARACTER_ID = 1345l;
    @BeforeEach
    public void setup(){
        this.character = EnhancedRandomBuilder.aNewEnhancedRandom().nextObject(Character.class);
        this.characterResponseDTO = EnhancedRandomBuilder.aNewEnhancedRandom().nextObject(CharacterResponseDTO.class);
    }

    @Test
    @DisplayName("Test getting the character data")
    public void getCharacterDataTest() throws IOException {
        when(characterService.getCharacterData(Mockito.anyLong())).thenReturn(character);
        when(mapperFacade.map(character, CharacterResponseDTO.class)).thenReturn(characterResponseDTO);
        try {
            mockMvc.perform(get("/v1/character/{id}", CHARACTER_ID))
                    .andExpect(status().isOk())
                    .andExpect(content().contentType(MediaType.APPLICATION_JSON));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("Test getting the character data with no data found")
    public void getCharacterDataNotFoundTest() throws IOException {
        when(characterService.getCharacterData(Mockito.anyLong())).thenThrow(new ResponseStatusException(HttpStatus.NOT_FOUND, "Character not found"));
        when(mapperFacade.map(character, CharacterResponseDTO.class)).thenReturn(characterResponseDTO);
        try {
            mockMvc.perform(get("/v1/character/{id}", CHARACTER_ID))
                    .andExpect(status().isNotFound())
                    .andExpect(content().contentType(MediaType.APPLICATION_JSON));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("Test getting the character data with bad request")
    public void getCharacterDataBadRequestTest() throws IOException {
        when(characterService.getCharacterData(Mockito.anyLong())).thenThrow(new ResponseStatusException(HttpStatus.BAD_REQUEST, "Request was invalid"));
        when(mapperFacade.map(character, CharacterResponseDTO.class)).thenReturn(characterResponseDTO);
        try {
            mockMvc.perform(get("/v1/character/{id}", CHARACTER_ID))
                    .andExpect(status().isBadRequest())
                    .andExpect(content().contentType(MediaType.APPLICATION_JSON));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("Test getting the character data with internal server error")
    public void getCharacterDataInternalServerErrorTest() throws IOException {
        when(characterService.getCharacterData(Mockito.anyLong())).thenThrow(new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error"));
        when(mapperFacade.map(character, CharacterResponseDTO.class)).thenReturn(characterResponseDTO);
        try {
            mockMvc.perform(get("/v1/character/{id}", CHARACTER_ID))
                    .andExpect(status().isInternalServerError())
                    .andExpect(content().contentType(MediaType.APPLICATION_JSON));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    @DisplayName("Test getting the character data with IO Exception")
    public void getCharacterDataIOExceptionTest() throws IOException {
        when(characterService.getCharacterData(Mockito.anyLong())).thenThrow(new IOException());
        when(mapperFacade.map(character, CharacterResponseDTO.class)).thenReturn(characterResponseDTO);
        try {
            mockMvc.perform(get("/v1/character/{id}", CHARACTER_ID))
                    .andExpect(status().isInternalServerError())
                    .andExpect(content().contentType(MediaType.APPLICATION_JSON));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
