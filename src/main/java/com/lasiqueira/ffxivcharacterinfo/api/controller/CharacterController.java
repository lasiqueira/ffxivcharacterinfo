package com.lasiqueira.ffxivcharacterinfo.api.controller;

import com.lasiqueira.ffxivcharacterinfo.api.dto.CharacterResponseDTO;
import com.lasiqueira.ffxivcharacterinfo.service.CharacterService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;

@RestController
@RequestMapping("/v1/character")
public class CharacterController {
    private final CharacterService characterService;
    private final MapperFacade mapperFacade;

    public CharacterController(CharacterService characterService, MapperFacade mapperFacade) {
        this.characterService = characterService;
        this.mapperFacade = mapperFacade;
    }

    @GetMapping("/{id}")
    public ResponseEntity<CharacterResponseDTO> getCharacterData(@PathVariable Long id) throws IOException, ResponseStatusException {
        return ResponseEntity.ok(mapperFacade.map(characterService.getCharacterData(id), CharacterResponseDTO.class));
    }
}
