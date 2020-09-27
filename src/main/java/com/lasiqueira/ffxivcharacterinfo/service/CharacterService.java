package com.lasiqueira.ffxivcharacterinfo.service;

import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.client.XivApi;
import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.CharacterData;
import com.lasiqueira.ffxivcharacterinfo.model.Character;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class CharacterService {
    private XivApi xivApi;

    public CharacterService(XivApi xivApi) {
        this.xivApi = xivApi;
    }

    public Character getCharacterData(String id) throws IOException {
        CharacterData characterData = xivApi.getCharacterData(id).execute().body();
        //TODO convert to Character object
        return null;
    }
}
