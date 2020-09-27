package com.lasiqueira.ffxivcharacterinfo.infrastructure.external.client;

import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.CharacterData;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface XivApi {
    @GET("character/{id}?data=CJ&extended=1")
    Call<CharacterData> getCharacterData(@Path("id") final String id);
}
