package com.lasiqueira.ffxivcharacterinfo.service;

import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.search.CharacterSearch;
import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.search.Pagination;
import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.search.Result;
import com.lasiqueira.ffxivcharacterinfo.model.Search;
import com.lasiqueira.ffxivcharacterinfo.model.SearchPagination;
import com.lasiqueira.ffxivcharacterinfo.model.SearchResult;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SearchConverter {
    public Search convert(CharacterSearch characterSearch){
        Search search = new Search();
        search.setCharacterSearchPagination(convertPagination(characterSearch.getPagination()));
        search.setCharacterSearchResults(convertResults(characterSearch.getResults()));
        return search;
    }

    private List<SearchResult> convertResults(List<Result> results){
        List<SearchResult> searchResults = new ArrayList<>();
        results.stream()
            .map(result -> new SearchResult(result.getID(), result.getName(), result.getAvatar()))
            .forEach(searchResults::add);
        return searchResults;

    }

    private SearchPagination convertPagination(Pagination pagination){
        SearchPagination searchPagination = new SearchPagination();
        searchPagination.setPage(pagination.getPage());
        searchPagination.setPageNext(pagination.getPageNext());
        searchPagination.setPagePrev(pagination.getPagePrev());
        searchPagination.setPageTotal(pagination.getPageTotal());
        searchPagination.setResults(pagination.getResults());
        searchPagination.setResultsPerPage(pagination.getResultsPerPage());
        searchPagination.setResultsTotal(pagination.getResultsTotal());

        return searchPagination;
    }
}
