
package com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.search;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Page",
    "PageNext",
    "PagePrev",
    "PageTotal",
    "Results",
    "ResultsPerPage",
    "ResultsTotal"
})
public class Pagination {

    @JsonProperty("Page")
    private Integer page;
    @JsonProperty("PageNext")
    private Integer pageNext;
    @JsonProperty("PagePrev")
    private Integer pagePrev;
    @JsonProperty("PageTotal")
    private Integer pageTotal;
    @JsonProperty("Results")
    private Integer results;
    @JsonProperty("ResultsPerPage")
    private Integer resultsPerPage;
    @JsonProperty("ResultsTotal")
    private Integer resultsTotal;

    @JsonProperty("Page")
    public Integer getPage() {
        return page;
    }

    @JsonProperty("Page")
    public void setPage(Integer page) {
        this.page = page;
    }

    @JsonProperty("PageNext")
    public Integer getPageNext() {
        return pageNext;
    }

    @JsonProperty("PageNext")
    public void setPageNext(Integer pageNext) {
        this.pageNext = pageNext;
    }

    @JsonProperty("PagePrev")
    public Integer getPagePrev() {
        return pagePrev;
    }

    @JsonProperty("PagePrev")
    public void setPagePrev(Integer pagePrev) {
        this.pagePrev = pagePrev;
    }

    @JsonProperty("PageTotal")
    public Integer getPageTotal() {
        return pageTotal;
    }

    @JsonProperty("PageTotal")
    public void setPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
    }

    @JsonProperty("Results")
    public Integer getResults() {
        return results;
    }

    @JsonProperty("Results")
    public void setResults(Integer results) {
        this.results = results;
    }

    @JsonProperty("ResultsPerPage")
    public Integer getResultsPerPage() {
        return resultsPerPage;
    }

    @JsonProperty("ResultsPerPage")
    public void setResultsPerPage(Integer resultsPerPage) {
        this.resultsPerPage = resultsPerPage;
    }

    @JsonProperty("ResultsTotal")
    public Integer getResultsTotal() {
        return resultsTotal;
    }

    @JsonProperty("ResultsTotal")
    public void setResultsTotal(Integer resultsTotal) {
        this.resultsTotal = resultsTotal;
    }

}
