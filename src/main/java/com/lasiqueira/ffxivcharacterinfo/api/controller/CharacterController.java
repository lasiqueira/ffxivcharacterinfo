package com.lasiqueira.ffxivcharacterinfo.api.controller;

import com.lasiqueira.ffxivcharacterinfo.api.converter.CharacterResponseDTOConverter;
import com.lasiqueira.ffxivcharacterinfo.api.converter.SearchResponseDTOConverter;
import com.lasiqueira.ffxivcharacterinfo.api.dto.character.CharacterResponseDTO;
import com.lasiqueira.ffxivcharacterinfo.api.dto.search.SearchResponseDTO;
import com.lasiqueira.ffxivcharacterinfo.service.CharacterService;
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
    private final CharacterResponseDTOConverter characterResponseDTOConverter;
    private final SearchResponseDTOConverter searchResponseDTOConverter;
    private final Logger logger;

    public CharacterController(CharacterService characterService, CharacterResponseDTOConverter characterResponseDTOConverter, SearchResponseDTOConverter searchResponseDTOConverter) {
        this.characterService = characterService;
        this.characterResponseDTOConverter = characterResponseDTOConverter;
        this.searchResponseDTOConverter = searchResponseDTOConverter;
        this.logger = LoggerFactory.getLogger(CharacterController.class);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CharacterResponseDTO> getCharacterData(@PathVariable Long id) throws IOException, ResponseStatusException {
        logger.info("Get character data...");
        logger.debug("id: {}", id);
        return ResponseEntity.ok(characterResponseDTOConverter.convert(characterService.getCharacterData(id)));
    }

    @GetMapping("/search")
    public ResponseEntity<SearchResponseDTO> getCharacterSearch(
            @RequestParam String name,
            @RequestParam(required = false) String server,
            @RequestParam(required = false) Integer page) throws IOException, ResponseStatusException {
        logger.info("Get character search...");
        logger.debug("name: {}, server: {}, page: {}", name, server, page);
        return ResponseEntity.ok(searchResponseDTOConverter.convert(characterService.getCharacterSearch(name, server, page)));
    }
}
