package com.lasiqueira.ffxivcharacterinfo.api.converter;

import com.lasiqueira.ffxivcharacterinfo.api.dto.search.SearchResponseDTO;
import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.search.CharacterSearch;
import com.lasiqueira.ffxivcharacterinfo.model.search.Search;
import com.lasiqueira.ffxivcharacterinfo.service.converter.SearchConverter;
import io.github.benas.randombeans.EnhancedRandomBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class SearchResponseDTOConverterTest {
    private Search search;
    private SearchResponseDTOConverter searchResponseDTOConverter;

    @BeforeEach
    public void setup(){
        searchResponseDTOConverter = new SearchResponseDTOConverter();
        search = EnhancedRandomBuilder.aNewEnhancedRandom().nextObject(Search.class);
    }

    @Test
    @DisplayName("Test converting character search")
    public void convertTest(){
        SearchResponseDTO searchResponseDTO = searchResponseDTOConverter.convert(search);
        assertNotNull(searchResponseDTO);
        assertNotNull(searchResponseDTO.getSearchPagination());
        assertNotNull(searchResponseDTO.getSearchResults());
        assertFalse(searchResponseDTO.getSearchResults().isEmpty());
    }

    @Test
    @DisplayName("Test converting character search with empty result list")
    public void convertEmptyListTest(){
        search.setSearchResults(new ArrayList<>());
        SearchResponseDTO searchResponseDTO = searchResponseDTOConverter.convert(search);
        assertNotNull(searchResponseDTO);
        assertNotNull(searchResponseDTO.getSearchPagination());
        assertNotNull(searchResponseDTO.getSearchResults());
        assertTrue(searchResponseDTO.getSearchResults().isEmpty());
    }
}
