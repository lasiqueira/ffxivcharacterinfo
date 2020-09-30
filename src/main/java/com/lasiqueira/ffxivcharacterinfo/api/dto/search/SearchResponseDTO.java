package com.lasiqueira.ffxivcharacterinfo.api.dto.search;

import java.util.List;
import java.util.Objects;

public class SearchResponseDTO {

    private SearchPaginationDTO searchPagination;
    private List<SearchResultDTO> searchResults;

    public SearchResponseDTO() {
    }

    public SearchResponseDTO(SearchPaginationDTO searchPagination, List<SearchResultDTO> searchResults) {
        this.searchPagination = searchPagination;
        this.searchResults = searchResults;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchResponseDTO that = (SearchResponseDTO) o;
        return Objects.equals(searchPagination, that.searchPagination) &&
                Objects.equals(searchResults, that.searchResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(searchPagination, searchResults);
    }

    @Override
    public String toString() {
        return "SearchResponseDTO{" +
                "searchPagination=" + searchPagination +
                ", searchResults=" + searchResults +
                '}';
    }
}
