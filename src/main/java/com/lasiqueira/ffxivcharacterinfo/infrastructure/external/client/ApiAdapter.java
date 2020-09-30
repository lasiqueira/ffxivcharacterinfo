package com.lasiqueira.ffxivcharacterinfo.infrastructure.external.client;

import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character.CharacterData;
import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.search.CharacterSearch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;
import retrofit2.Response;
import java.io.IOException;

@Component
public class ApiAdapter implements ApiPort{
    private final XivApi xivApi;
    private final Logger logger;

    public ApiAdapter(XivApi xivApi) {
        this.xivApi = xivApi;
        this.logger = LoggerFactory.getLogger(ApiAdapter.class);
    }

    @Override
    @Cacheable(cacheNames ="character", key = "#id")
    public CharacterData getCharacterData(Long id) throws IOException, ResponseStatusException {
        logger.info("Get character data...");
        logger.debug("id: {}", id);
        CharacterData characterData = null;
        try {
            Response<CharacterData> response = xivApi.getCharacterData(id).execute();
            handleResponseCode(response);
            characterData = response.body();
        } catch (IOException e){
            logger.error(e.getMessage(), e);
            throw e;
        } catch (ResponseStatusException e){
            logger.error(e.getMessage(), e);
            throw e;
        }
        return characterData;
    }
    @Override
    @Cacheable(cacheNames ="search", key = "{#name, #server, #page}")
    public CharacterSearch getCharacterSearch(String name, String server, Integer page) throws IOException, ResponseStatusException {
        logger.info("Get character search...");
        logger.debug("name: {}, server: {}, page: {}", name, server, page);
        CharacterSearch characterSearch = null;
        try {
            Response<CharacterSearch> response = xivApi.getCharacterSearch(name, server, page).execute();
            handleResponseCode(response);
            characterSearch = response.body();
        } catch (IOException e){
            logger.error(e.getMessage(), e);
            throw e;
        } catch (ResponseStatusException e){
            logger.error(e.getMessage(), e);
            throw e;
        }
        return characterSearch;
    }

    private void handleResponseCode(Response response) throws ResponseStatusException{
        logger.info("Handling response code...");
        logger.debug("Response Code: {}", response.code());
        if(response.code() != HttpStatus.OK.value()) {
            if (response.code() == HttpStatus.BAD_REQUEST.value()) {
                throw new ResponseStatusException(
                        HttpStatus.BAD_REQUEST, "Request was invalid"
                );
            } else if (response.code() == HttpStatus.NOT_FOUND.value()) {
                throw new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Character not found"
                );
            } else if(response.code() == HttpStatus.NOT_ACCEPTABLE.value()){
                throw new ResponseStatusException(
                        HttpStatus.NOT_ACCEPTABLE, "You must provide the mandatory parameter"
                );
            } else {
                throw new ResponseStatusException(
                        HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error"
                );
            }
        }
    }
}
