package com.lasiqueira.ffxivcharacterinfo.service.converter;

import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.search.CharacterSearch;
import com.lasiqueira.ffxivcharacterinfo.model.search.Search;
import io.github.benas.randombeans.EnhancedRandomBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class SearchConverterTest {
    private CharacterSearch characterSearch;
    private SearchConverter searchConverter;

    @BeforeEach
    public void setup(){
        searchConverter = new SearchConverter();
        characterSearch = EnhancedRandomBuilder.aNewEnhancedRandom().nextObject(CharacterSearch.class);
    }

    @Test
    @DisplayName("Test converting character search")
    public void convertTest(){
        Search search = searchConverter.convert(characterSearch);
        assertNotNull(search);
        assertNotNull(search.getSearchPagination());
        assertNotNull(search.getSearchResults());
        assertFalse(search.getSearchResults().isEmpty());
    }

    @Test
    @DisplayName("Test converting character search with empty result list")
    public void convertEmptyListTest(){
        characterSearch.setResults(new ArrayList<>());
        Search search = searchConverter.convert(characterSearch);
        assertNotNull(search);
        assertNotNull(search.getSearchPagination());
        assertNotNull(search.getSearchResults());
        assertTrue(search.getSearchResults().isEmpty());
    }
}
