
package com.lasiqueira.ffxivcharacterinfo.infrastructure.external.dto.character;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
    "Company",
    "Rank"
})
public class GrandCompany {

    @JsonProperty("Company")
    private Company company;
    @JsonProperty("Rank")
    private Rank rank;

    @JsonProperty("Company")
    public Company getCompany() {
        return company;
    }

    @JsonProperty("Company")
    public void setCompany(Company company) {
        this.company = company;
    }

    @JsonProperty("Rank")
    public Rank getRank() {
        return rank;
    }

    @JsonProperty("Rank")
    public void setRank(Rank rank) {
        this.rank = rank;
    }

}
