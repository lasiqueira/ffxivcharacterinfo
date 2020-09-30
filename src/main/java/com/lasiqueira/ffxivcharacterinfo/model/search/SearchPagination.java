package com.lasiqueira.ffxivcharacterinfo.model.search;

public class SearchPagination {

    private Integer page;
    private Integer pageNext;
    private Integer pagePrev;
    private Integer pageTotal;
    private Integer results;
    private Integer resultsPerPage;
    private Integer resultsTotal;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageNext() {
        return pageNext;
    }

    public void setPageNext(Integer pageNext) {
        this.pageNext = pageNext;
    }

    public Integer getPagePrev() {
        return pagePrev;
    }

    public void setPagePrev(Integer pagePrev) {
        this.pagePrev = pagePrev;
    }

    public Integer getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
    }

    public Integer getResults() {
        return results;
    }

    public void setResults(Integer results) {
        this.results = results;
    }

    public Integer getResultsPerPage() {
        return resultsPerPage;
    }

    public void setResultsPerPage(Integer resultsPerPage) {
        this.resultsPerPage = resultsPerPage;
    }

    public Integer getResultsTotal() {
        return resultsTotal;
    }

    public void setResultsTotal(Integer resultsTotal) {
        this.resultsTotal = resultsTotal;
    }
}
