package com.lasiqueira.ffxivcharacterinfo.api.converter;

import com.lasiqueira.ffxivcharacterinfo.api.dto.search.SearchPaginationDTO;
import com.lasiqueira.ffxivcharacterinfo.api.dto.search.SearchResponseDTO;
import com.lasiqueira.ffxivcharacterinfo.api.dto.search.SearchResultDTO;
import com.lasiqueira.ffxivcharacterinfo.model.search.Search;
import com.lasiqueira.ffxivcharacterinfo.model.search.SearchPagination;
import com.lasiqueira.ffxivcharacterinfo.model.search.SearchResult;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SearchResponseDTOConverter {
    public SearchResponseDTO convert(Search search){
        SearchResponseDTO searchResponseDTO = new SearchResponseDTO();
        searchResponseDTO.setSearchPagination(convertPagination(search.getSearchPagination()));
        searchResponseDTO.setSearchResults(convertResults(search.getSearchResults()));
        return searchResponseDTO;
    }

    private List<SearchResultDTO> convertResults(List<SearchResult> searchResults){
        List<SearchResultDTO> searchResultDTOList = new ArrayList<>();
        searchResults.stream()
            .map(result -> new SearchResultDTO(result.getId(), result.getName(), result.getAvatar()))
            .forEach(searchResultDTOList::add);
        return searchResultDTOList;

    }

    private SearchPaginationDTO convertPagination(SearchPagination searchPagination){
        SearchPaginationDTO searchPaginationDTO = new SearchPaginationDTO();
        searchPaginationDTO.setPage(searchPagination.getPage());
        searchPaginationDTO.setPageNext(searchPagination.getPageNext());
        searchPaginationDTO.setPagePrev(searchPagination.getPagePrev());
        searchPaginationDTO.setPageTotal(searchPagination.getPageTotal());
        searchPaginationDTO.setResults(searchPagination.getResults());
        searchPaginationDTO.setResultsPerPage(searchPagination.getResultsPerPage());
        searchPaginationDTO.setResultsTotal(searchPagination.getResultsTotal());

        return searchPaginationDTO;
    }
}
