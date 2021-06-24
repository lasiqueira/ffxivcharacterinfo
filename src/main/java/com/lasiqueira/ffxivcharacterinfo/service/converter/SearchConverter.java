package com.lasiqueira.ffxivcharacterinfo.service.converter;

import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.search.CharacterSearch;
import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.search.Pagination;
import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.search.Result;
import com.lasiqueira.ffxivcharacterinfo.model.search.Search;
import com.lasiqueira.ffxivcharacterinfo.model.search.SearchPagination;
import com.lasiqueira.ffxivcharacterinfo.model.search.SearchResult;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SearchConverter {
    public Search convert(CharacterSearch characterSearch){
       return new Search(
               convertPagination(characterSearch.getPagination()),
               convertResults(characterSearch.getResults())
       );
    }

    private List<SearchResult> convertResults(List<Result> results){
        return results.stream()
            .map(result -> new SearchResult(result.getID(), result.getName(), result.getAvatar()))
            .collect(Collectors.toList());
    }

    private SearchPagination convertPagination(Pagination pagination){
        return new SearchPagination(
                pagination.getPage(),
                pagination.getPageNext(),
                pagination.getPagePrev(),
                pagination.getPageTotal(),
                pagination.getResults(),
                pagination.getResultsPerPage(),
                pagination.getResultsTotal()
        );
    }
}
