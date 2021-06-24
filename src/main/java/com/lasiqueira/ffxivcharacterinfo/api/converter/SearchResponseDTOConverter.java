package com.lasiqueira.ffxivcharacterinfo.api.converter;

import com.lasiqueira.ffxivcharacterinfo.api.dto.search.SearchPaginationDTO;
import com.lasiqueira.ffxivcharacterinfo.api.dto.search.SearchResponseDTO;
import com.lasiqueira.ffxivcharacterinfo.api.dto.search.SearchResultDTO;
import com.lasiqueira.ffxivcharacterinfo.model.search.Search;
import com.lasiqueira.ffxivcharacterinfo.model.search.SearchPagination;
import com.lasiqueira.ffxivcharacterinfo.model.search.SearchResult;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class SearchResponseDTOConverter {
    public SearchResponseDTO convert(Search search){
        return new SearchResponseDTO(convertPagination(search.getSearchPagination()), convertResults(search.getSearchResults()));
    }

    private List<SearchResultDTO> convertResults(List<SearchResult> searchResults){
        return searchResults.stream()
            .map(result -> new SearchResultDTO(result.getId(), result.getName(), result.getAvatar()))
            .collect(Collectors.toList());

    }

    private SearchPaginationDTO convertPagination(SearchPagination searchPagination){
        return new SearchPaginationDTO(
                searchPagination.getPage(),
                searchPagination.getPageNext(),
                searchPagination.getPagePrev(),
                searchPagination.getPageTotal(),
                searchPagination.getResults(),
                searchPagination.getResultsPerPage(),
                searchPagination.getResultsTotal()
                );
    }
}
