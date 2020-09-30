
package com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.search;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Pagination",
    "Results"
})
public class CharacterSearch {

    @JsonProperty("Pagination")
    private Pagination pagination;
    @JsonProperty("Results")
    private List<Result> results = null;

    @JsonProperty("Pagination")
    public Pagination getPagination() {
        return pagination;
    }

    @JsonProperty("Pagination")
    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    @JsonProperty("Results")
    public List<Result> getResults() {
        return results;
    }

    @JsonProperty("Results")
    public void setResults(List<Result> results) {
        this.results = results;
    }

}
