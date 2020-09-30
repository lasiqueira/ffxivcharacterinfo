package com.lasiqueira.ffxivcharacterinfo.api.dto.search;

import java.util.List;

public class SearchResponseDTO {

    private SearchPaginationDTO searchPagination;
    private List<SearchResultDTO> searchResults;

    public SearchPaginationDTO getSearchPagination() {
        return searchPagination;
    }

    public void setSearchPagination(SearchPaginationDTO searchPagination) {
        this.searchPagination = searchPagination;
    }

    public List<SearchResultDTO> getSearchResults() {
        return searchResults;
    }

    public void setSearchResults(List<SearchResultDTO> searchResults) {
        this.searchResults = searchResults;
    }
}
