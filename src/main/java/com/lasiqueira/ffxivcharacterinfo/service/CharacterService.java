package com.lasiqueira.ffxivcharacterinfo.service;

import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.client.ApiPort;
import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character.CharacterData;
import com.lasiqueira.ffxivcharacterinfo.model.character.Character;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;

@Service
public class CharacterService {
    private final ApiPort apiPort;
    private final CharacterConverter characterConverter;

    public CharacterService(ApiPort apiPort, CharacterConverter characterConverter) {
        this.apiPort = apiPort;
        this.characterConverter = characterConverter;
    }

    public Character getCharacterData(Long id) throws IOException, ResponseStatusException {
        CharacterData characterData = apiPort.getCharacterData(id);
        return characterConverter.convert(characterData);
    }
}
