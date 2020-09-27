package com.lasiqueira.ffxivcharacterinfo.service;

import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.client.XivApi;
import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.CharacterData;
import com.lasiqueira.ffxivcharacterinfo.model.Character;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class CharacterService {
    private  final XivApi xivApi;
    private final CharacterConverter characterConverter;

    public CharacterService(XivApi xivApi, CharacterConverter characterConverter) {
        this.xivApi = xivApi;
        this.characterConverter = characterConverter;
    }

    public Character getCharacterData(Long id) throws IOException {
        CharacterData characterData = xivApi.getCharacterData(id).execute().body();
        return characterConverter.convert(characterData);
    }
}
