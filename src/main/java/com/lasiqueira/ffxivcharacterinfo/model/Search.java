package com.lasiqueira.ffxivcharacterinfo.model;

import java.util.List;

public class Search {
    private SearchPagination searchPagination;
    private List<SearchResult> searchResults;

    public SearchPagination getCharacterSearchPagination() {
        return searchPagination;
    }

    public void setCharacterSearchPagination(SearchPagination searchPagination) {
        this.searchPagination = searchPagination;
    }

    public List<SearchResult> getCharacterSearchResults() {
        return searchResults;
    }

    public void setCharacterSearchResults(List<SearchResult> searchResults) {
        this.searchResults = searchResults;
    }
}
