package com.lasiqueira.ffxivcharacterinfo.api.controller;

import com.lasiqueira.ffxivcharacterinfo.api.dto.CharacterResponseDTO;
import com.lasiqueira.ffxivcharacterinfo.service.CharacterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/character")
public class CharacterController {
    private CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<CharacterResponseDTO> getCharacterData(@PathVariable Long id){
        return ResponseEntity.of(null);
    }
}
