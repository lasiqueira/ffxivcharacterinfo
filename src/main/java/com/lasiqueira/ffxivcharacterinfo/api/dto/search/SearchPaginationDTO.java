package com.lasiqueira.ffxivcharacterinfo.api.dto.search;

import java.util.Objects;

public class SearchPaginationDTO {
    private Integer page;
    private Integer pageNext;
    private Integer pagePrev;
    private Integer pageTotal;
    private Integer results;
    private Integer resultsPerPage;
    private Integer resultsTotal;

    public SearchPaginationDTO() {
    }

    public SearchPaginationDTO(Integer page, Integer pageNext, Integer pagePrev, Integer pageTotal, Integer results, Integer resultsPerPage, Integer resultsTotal) {
        this.page = page;
        this.pageNext = pageNext;
        this.pagePrev = pagePrev;
        this.pageTotal = pageTotal;
        this.results = results;
        this.resultsPerPage = resultsPerPage;
        this.resultsTotal = resultsTotal;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchPaginationDTO that = (SearchPaginationDTO) o;
        return Objects.equals(page, that.page) &&
                Objects.equals(pageNext, that.pageNext) &&
                Objects.equals(pagePrev, that.pagePrev) &&
                Objects.equals(pageTotal, that.pageTotal) &&
                Objects.equals(results, that.results) &&
                Objects.equals(resultsPerPage, that.resultsPerPage) &&
                Objects.equals(resultsTotal, that.resultsTotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(page, pageNext, pagePrev, pageTotal, results, resultsPerPage, resultsTotal);
    }

    @Override
    public String toString() {
        return "SearchPaginationDTO{" +
                "page=" + page +
                ", pageNext=" + pageNext +
                ", pagePrev=" + pagePrev +
                ", pageTotal=" + pageTotal +
                ", results=" + results +
                ", resultsPerPage=" + resultsPerPage +
                ", resultsTotal=" + resultsTotal +
                '}';
    }
}
