package com.lasiqueira.ffxivcharacterinfo.model.search;

import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Search search = (Search) o;
        return Objects.equals(searchPagination, search.searchPagination) &&
                Objects.equals(searchResults, search.searchResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(searchPagination, searchResults);
    }

    @Override
    public String toString() {
        return "Search{" +
                "searchPagination=" + searchPagination +
                ", searchResults=" + searchResults +
                '}';
    }
}
