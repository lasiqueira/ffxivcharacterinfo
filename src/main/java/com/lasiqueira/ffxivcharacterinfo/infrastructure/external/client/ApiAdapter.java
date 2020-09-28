package com.lasiqueira.ffxivcharacterinfo.infrastructure.external.client;

import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.CharacterData;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;
import retrofit2.Response;
import java.io.IOException;

@Component
public class ApiAdapter implements ApiPort{
    private XivApi xivApi;

    public ApiAdapter(XivApi xivApi) {
        this.xivApi = xivApi;
    }

    @Override
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
            } else {
                throw new ResponseStatusException(
                        HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error"
                );
            }
        }
    }


}
