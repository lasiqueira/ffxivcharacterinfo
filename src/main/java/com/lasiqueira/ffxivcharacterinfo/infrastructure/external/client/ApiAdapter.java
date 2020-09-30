package com.lasiqueira.ffxivcharacterinfo.infrastructure.external.client;

import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character.CharacterData;
import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.search.CharacterSearch;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;
import retrofit2.Response;
import java.io.IOException;

@Component
@CacheConfig(cacheNames = {"character"})
public class ApiAdapter implements ApiPort{
    private final XivApi xivApi;

    public ApiAdapter(XivApi xivApi) {
        this.xivApi = xivApi;
    }

    @Override
    @Cacheable(key = "#id")
    public CharacterData getCharacterData(Long id) throws IOException, ResponseStatusException {
        Response<CharacterData> response = xivApi.getCharacterData(id).execute();
        handleResponseCode(response);
        return response.body();
    }
    private void handleResponseCode(Response response) throws ResponseStatusException{
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

    @Override
    public CharacterSearch getCharacterSearch(String name, String server, Integer page) throws IOException, ResponseStatusException {
        Response<CharacterSearch> response = xivApi.getCharacterSearch(name, server, page).execute();
        handleResponseCode(response);
        return response.body();
    }
}
