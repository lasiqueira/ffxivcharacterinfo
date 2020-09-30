package com.lasiqueira.ffxivcharacterinfo.model.search;

import java.util.List;

public class Search {
    private SearchPagination searchPagination;
    private List<SearchResult> searchResults;

    public Search() {
    }

    public Search(SearchPagination searchPagination, List<SearchResult> searchResults) {
        this.searchPagination = searchPagination;
        this.searchResults = searchResults;
    }

    public SearchPagination getSearchPagination() {
        return searchPagination;
    }

    public void setSearchPagination(SearchPagination searchPagination) {
        this.searchPagination = searchPagination;
    }

    public List<SearchResult> getSearchResults() {
        return searchResults;
    }

    public void setSearchResults(List<SearchResult> searchResults) {
        this.searchResults = searchResults;
    }
}
