package com.lasiqueira.ffxivcharacterinfo.infrastructure.external;

import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.client.ApiAdapter;
import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.client.XivApi;
import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character.CharacterData;
import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.search.CharacterSearch;
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
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
public class ApiAdapterTest {

    private ApiAdapter apiAdapter;
    @MockBean
    private XivApi xivApi;
    @MockBean
    private Call<CharacterData> characterDataCall;
    @MockBean
    private Call<CharacterSearch> characterSearchCall;
    private CharacterData characterData;
    private CharacterSearch characterSearch;

    private static final long CHARACTER_ID = 1234l;

    @BeforeEach
    public void setup(){
        this.xivApi = Mockito.mock(XivApi.class);
        this.apiAdapter = new ApiAdapter(xivApi);
        this.characterDataCall = Mockito.mock(Call.class);
        this.characterSearchCall = Mockito.mock(Call.class);
        this.characterData = EnhancedRandomBuilder.aNewEnhancedRandom().nextObject(CharacterData.class);
        characterSearch = EnhancedRandomBuilder.aNewEnhancedRandom().nextObject(CharacterSearch.class);
    }


    @Test
    @DisplayName("Test get character data from 3rd party api")
    public void getCharacterDataTest() throws IOException {
        when(xivApi.getCharacterData(Mockito.anyLong())).thenReturn(characterDataCall);
        when(characterDataCall.execute()).thenReturn(Response.success(characterData));
        CharacterData response = apiAdapter.getCharacterData(CHARACTER_ID);
        assertNotNull(response);
    }

    @Test
    @DisplayName("Test get character data from 3rd party api with not found exception")
    public void getCharacterDataNotFoundTest() throws IOException {
        when(xivApi.getCharacterData(Mockito.anyLong())).thenReturn(characterDataCall);
        when(characterDataCall.execute()).thenReturn(Response.error(HttpStatus.NOT_FOUND.value(), ResponseBody.create(MediaType.get(org.springframework.http.MediaType.APPLICATION_JSON_VALUE), "")));
        assertThrows(ResponseStatusException.class, () -> apiAdapter.getCharacterData(CHARACTER_ID));
    }

    @Test
    @DisplayName("Test get character data from 3rd party api with bad request exception")
    public void getCharacterDataBadRequestTest() throws IOException {
        when(xivApi.getCharacterData(Mockito.anyLong())).thenReturn(characterDataCall);
        when(characterDataCall.execute()).thenReturn(Response.error(HttpStatus.BAD_REQUEST.value(), ResponseBody.create(MediaType.get(org.springframework.http.MediaType.APPLICATION_JSON_VALUE), "")));
        assertThrows(ResponseStatusException.class, () -> apiAdapter.getCharacterData(CHARACTER_ID));
    }

    @Test
    @DisplayName("Test get character data from 3rd party api with internal server error exception")
    public void getCharacterDataInternalServerErrorTest() throws IOException {
        when(xivApi.getCharacterData(Mockito.anyLong())).thenReturn(characterDataCall);
        when(characterDataCall.execute()).thenReturn(Response.error(HttpStatus.INTERNAL_SERVER_ERROR.value(), ResponseBody.create(MediaType.get(org.springframework.http.MediaType.APPLICATION_JSON_VALUE), "")));
        assertThrows(ResponseStatusException.class, () -> apiAdapter.getCharacterData(CHARACTER_ID));
    }

    @Test
    @DisplayName("Test get character data from 3rd party api with IO exception")
    public void getCharacterDataIOExceptionTest() throws IOException {
        when(xivApi.getCharacterData(Mockito.anyLong())).thenReturn(characterDataCall);
        when(characterDataCall.execute()).thenThrow(new IOException());
        assertThrows(IOException.class, () -> apiAdapter.getCharacterData(CHARACTER_ID));
    }

    @Test
    @DisplayName("Test get character search from 3rd party api")
    public void getCharacterSearchTest() throws IOException {
        when(xivApi.getCharacterSearch(Mockito.anyString(), Mockito.anyString(), Mockito.anyInt())).thenReturn(characterSearchCall);
        when(characterSearchCall.execute()).thenReturn(Response.success(characterSearch));
        CharacterSearch response = apiAdapter.getCharacterSearch(Mockito.anyString(), Mockito.anyString(), Mockito.anyInt());
        assertNotNull(response);
    }
    @Test
    @DisplayName("Test get character search with an empty result list from 3rd party api")
    public void getCharacterSearchEmptyResultsTest() throws IOException {
        characterSearch.setResults(new ArrayList<>());
        when(xivApi.getCharacterSearch(Mockito.anyString(), Mockito.anyString(), Mockito.anyInt())).thenReturn(characterSearchCall);
        when(characterSearchCall.execute()).thenReturn(Response.success(characterSearch));
        CharacterSearch response = apiAdapter.getCharacterSearch(Mockito.anyString(), Mockito.anyString(), Mockito.anyInt());
        assertNotNull(response);
        assertTrue(response.getResults().isEmpty());
    }

    @Test
    @DisplayName("Test get character search from 3rd party api with not acceptable exception")
    public void getCharacterSearchNotAcceptableTest() throws IOException {
        when(xivApi.getCharacterSearch(Mockito.anyString(), Mockito.anyString(), Mockito.anyInt())).thenReturn(characterSearchCall);
        when(characterSearchCall.execute()).thenReturn(Response.error(HttpStatus.NOT_ACCEPTABLE.value(), ResponseBody.create(MediaType.get(org.springframework.http.MediaType.APPLICATION_JSON_VALUE), "")));
        assertThrows(ResponseStatusException.class, () -> apiAdapter.getCharacterSearch(Mockito.anyString(), Mockito.anyString(), Mockito.anyInt()));
    }

    @Test
    @DisplayName("Test get character search from 3rd party api with internal server error exception")
    public void getCharacterSearchInternalServerErrorTest() throws IOException {
        when(xivApi.getCharacterSearch(Mockito.anyString(), Mockito.anyString(), Mockito.anyInt())).thenReturn(characterSearchCall);
        when(characterSearchCall.execute()).thenReturn(Response.error(HttpStatus.INTERNAL_SERVER_ERROR.value(), ResponseBody.create(MediaType.get(org.springframework.http.MediaType.APPLICATION_JSON_VALUE), "")));
        assertThrows(ResponseStatusException.class, () -> apiAdapter.getCharacterSearch(Mockito.anyString(), Mockito.anyString(), Mockito.anyInt()));
    }

    @Test
    @DisplayName("Test get character search from 3rd party api with IO exception")
    public void getCharacterSearchIOExceptionTest() throws IOException {
        when(xivApi.getCharacterSearch(Mockito.anyString(), Mockito.anyString(), Mockito.anyInt())).thenReturn(characterSearchCall);
        when(characterSearchCall.execute()).thenThrow(new IOException());
        assertThrows(IOException.class, () -> apiAdapter.getCharacterSearch(Mockito.anyString(), Mockito.anyString(), Mockito.anyInt()));
    }

}
