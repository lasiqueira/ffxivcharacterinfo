package com.lasiqueira.ffxivcharacterinfo.api.controller;

import com.lasiqueira.ffxivcharacterinfo.api.dto.character.CharacterResponseDTO;
import com.lasiqueira.ffxivcharacterinfo.api.dto.search.SearchResponseDTO;
import com.lasiqueira.ffxivcharacterinfo.service.CharacterService;
import ma.glasnost.orika.MapperFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;

@RestController
@RequestMapping("/v1/character")
public class CharacterController {
    private final CharacterService characterService;
    private final MapperFacade mapperFacade;
    private final Logger logger;

    public CharacterController(CharacterService characterService, MapperFacade mapperFacade) {
        this.characterService = characterService;
        this.mapperFacade = mapperFacade;
        this.logger = LoggerFactory.getLogger(CharacterController.class);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CharacterResponseDTO> getCharacterData(@PathVariable Long id) throws IOException, ResponseStatusException {
        logger.info("Get character data...");
        logger.debug("id: {}", id);
        return ResponseEntity.ok(mapperFacade.map(characterService.getCharacterData(id), CharacterResponseDTO.class));
    }

    @GetMapping("/search")
    public ResponseEntity<SearchResponseDTO> getCharacterSearch(
            @RequestParam String name,
            @RequestParam(required = false) String server,
            @RequestParam(required = false) Integer page) throws IOException, ResponseStatusException {
        logger.info("Get character search...");
        logger.debug("name: {}, server: {}, page: {}", name, server, page);
        return ResponseEntity.ok(mapperFacade.map(characterService.getCharacterSearch(name, server, page), SearchResponseDTO.class));
    }
}
