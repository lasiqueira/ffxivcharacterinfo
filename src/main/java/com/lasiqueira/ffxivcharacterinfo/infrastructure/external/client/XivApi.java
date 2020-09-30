package com.lasiqueira.ffxivcharacterinfo.infrastructure.external.client;

import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character.CharacterData;
import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.search.CharacterSearch;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface XivApi {
    @GET("character/{id}?data=CJ&extended=1")
    Call<CharacterData> getCharacterData(@Path("id") final Long id);

    @GET("character/search?name={name}&server={server}&page={page}")
    Call<CharacterSearch> getCharacterSearch(@Path("name") final String name, @Path("server") final String server, @Path("page") final Integer page);
}
