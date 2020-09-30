package com.lasiqueira.ffxivcharacterinfo.service;

import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.client.ApiPort;
import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character.CharacterData;
import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.search.CharacterSearch;
import com.lasiqueira.ffxivcharacterinfo.model.character.Character;
import com.lasiqueira.ffxivcharacterinfo.model.search.Search;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;

@Service
public class CharacterService {
    private final ApiPort apiPort;
    private final CharacterConverter characterConverter;
    private final SearchConverter searchConverter;
    private final Logger logger;

    public CharacterService(ApiPort apiPort, CharacterConverter characterConverter, SearchConverter searchConverter) {
        this.apiPort = apiPort;
        this.characterConverter = characterConverter;
        this.searchConverter = searchConverter;
        this.logger = LoggerFactory.getLogger(CharacterService.class);
    }

    public Character getCharacterData(Long id) throws IOException, ResponseStatusException {
        logger.info("Get character data...");
        logger.debug("id: {}", id);
        CharacterData characterData = apiPort.getCharacterData(id);
        return characterConverter.convert(characterData);
    }

    public Search getCharacterSearch(String name, String server, Integer page) throws IOException, ResponseStatusException {
        logger.info("Get character search...");
        logger.debug("name: {}, server: {}, page: {}", name, server, page);
        CharacterSearch characterSearch = apiPort.getCharacterSearch(name, server, page);
        return searchConverter.convert(characterSearch);
    }
}
