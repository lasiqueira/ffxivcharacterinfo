package com.lasiqueira.ffxivcharacterinfo.infrastructure.external.client;

import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character.CharacterData;
import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.search.CharacterSearch;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface XivApi {
    @GET("character/{id}?data=CJ&extended=1")
    Call<CharacterData> getCharacterData(@Path("id") final Long id);

    @GET("character/search")
    Call<CharacterSearch> getCharacterSearch(@Query("name") final String name, @Query("server") final String server, @Query("page") final Integer page);
}
