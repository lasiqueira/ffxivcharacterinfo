package com.lasiqueira.ffxivcharacterinfo.infrastructure.external;

import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.client.ApiAdapter;
import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.client.XivApi;
import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character.CharacterData;
import io.github.benas.randombeans.EnhancedRandomBuilder;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;
public class ApiAdapterTest {

    private ApiAdapter apiAdapter;
    @MockBean
    private XivApi xivApi;
    @MockBean
    Call<CharacterData> call;
    private CharacterData characterData;

    @BeforeEach
    public void setup(){
        this.xivApi = Mockito.mock(XivApi.class);
        this.apiAdapter = new ApiAdapter(xivApi);
        this.call = Mockito.mock(Call.class);
        this.characterData = EnhancedRandomBuilder.aNewEnhancedRandom().nextObject(CharacterData.class);
    }


    @Test
    @DisplayName("Test get character data from 3rd party api")
    public void getCharacterDataTest() throws IOException {
        when(xivApi.getCharacterData(Mockito.anyLong())).thenReturn(call);
        when(call.execute()).thenReturn(Response.success(characterData));
        CharacterData response = apiAdapter.getCharacterData(1234l);
        assertNotNull(response);
    }

    @Test
    @DisplayName("Test get character data from 3rd party api with not found exception")
    public void getCharacterDataNotFoundTest() throws IOException {
        when(xivApi.getCharacterData(Mockito.anyLong())).thenReturn(call);
        when(call.execute()).thenReturn(Response.error(HttpStatus.NOT_FOUND.value(), ResponseBody.create(MediaType.get(org.springframework.http.MediaType.APPLICATION_JSON_VALUE), "")));
        assertThrows(ResponseStatusException.class, () -> apiAdapter.getCharacterData(1234l));
    }

    @Test
    @DisplayName("Test get character data from 3rd party api with bad request exception")
    public void getCharacterDataBadRequestTest() throws IOException {
        when(xivApi.getCharacterData(Mockito.anyLong())).thenReturn(call);
        when(call.execute()).thenReturn(Response.error(HttpStatus.BAD_REQUEST.value(), ResponseBody.create(MediaType.get(org.springframework.http.MediaType.APPLICATION_JSON_VALUE), "")));
        assertThrows(ResponseStatusException.class, () -> apiAdapter.getCharacterData(1234l));
    }

    @Test
    @DisplayName("Test get character data from 3rd party api with internal server error exception")
    public void getCharacterDataInternalServerErrorTest() throws IOException {
        when(xivApi.getCharacterData(Mockito.anyLong())).thenReturn(call);
        when(call.execute()).thenReturn(Response.error(HttpStatus.INTERNAL_SERVER_ERROR.value(), ResponseBody.create(MediaType.get(org.springframework.http.MediaType.APPLICATION_JSON_VALUE), "")));
        assertThrows(ResponseStatusException.class, () -> apiAdapter.getCharacterData(1234l));
    }


}
