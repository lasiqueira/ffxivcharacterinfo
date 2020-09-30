package com.lasiqueira.ffxivcharacterinfo.infrastructure.external.client;

import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character.CharacterData;
import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.search.CharacterSearch;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;

public interface ApiPort {
    CharacterData getCharacterData(Long id) throws IOException, ResponseStatusException;
    CharacterSearch getCharacterSearch(String name, String server, Integer page) throws IOException, ResponseStatusException;
}
