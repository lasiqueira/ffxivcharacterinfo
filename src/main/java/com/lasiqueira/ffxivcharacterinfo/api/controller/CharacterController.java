package com.lasiqueira.ffxivcharacterinfo.api.controller;

import com.lasiqueira.ffxivcharacterinfo.api.dto.CharacterDataResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/character")
public class CharacterController {

    @GetMapping("/{id}")
    public ResponseEntity<CharacterDataResponse> getCharacterData(){
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
