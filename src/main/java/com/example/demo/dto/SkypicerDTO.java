
package com.example.demo.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ref_tasks",
    "search_params",
    "currency_rate",
    "refresh",
    "connections",
    "currency",
    "_results",
    "del",
    "all_airlines",
    "time",
    "all_stopover_airports",
    "data",
    "search_id"
})
public class SkypicerDTO {

    @JsonProperty("ref_tasks")
    private List<Object> refTasks;
    @JsonProperty("search_params")
    private SearchParams searchParams;
    @JsonProperty("currency_rate")
    private Double currencyRate;
    @JsonProperty("refresh")
    private List<Object> refresh;
    @JsonProperty("connections")
    private List<Object> connections;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("_results")
    private Integer results;
    @JsonProperty("del")
    private Double del;
    @JsonProperty("all_airlines")
    private List<Object> allAirlines;
    @JsonProperty("time")
    private Integer time;
    @JsonProperty("all_stopover_airports")
    private List<Object> allStopoverAirports;
    @JsonProperty("data")
    private List<Datum> data;
    @JsonProperty("search_id")
    private String searchId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ref_tasks")
    public List<Object> getRefTasks() {
        return refTasks;
    }

    @JsonProperty("ref_tasks")
    public void setRefTasks(List<Object> refTasks) {
        this.refTasks = refTasks;
    }

    @JsonProperty("search_params")
    public SearchParams getSearchParams() {
        return searchParams;
    }

    @JsonProperty("search_params")
    public void setSearchParams(SearchParams searchParams) {
        this.searchParams = searchParams;
    }

    @JsonProperty("currency_rate")
    public Double getCurrencyRate() {
        return currencyRate;
    }

    @JsonProperty("currency_rate")
    public void setCurrencyRate(Double currencyRate) {
        this.currencyRate = currencyRate;
    }

    @JsonProperty("refresh")
    public List<Object> getRefresh() {
        return refresh;
    }

    @JsonProperty("refresh")
    public void setRefresh(List<Object> refresh) {
        this.refresh = refresh;
    }

    @JsonProperty("connections")
    public List<Object> getConnections() {
        return connections;
    }

    @JsonProperty("connections")
    public void setConnections(List<Object> connections) {
        this.connections = connections;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("_results")
    public Integer getResults() {
        return results;
    }

    @JsonProperty("_results")
    public void setResults(Integer results) {
        this.results = results;
    }

    @JsonProperty("del")
    public Double getDel() {
        return del;
    }

    @JsonProperty("del")
    public void setDel(Double del) {
        this.del = del;
    }

    @JsonProperty("all_airlines")
    public List<Object> getAllAirlines() {
        return allAirlines;
    }

    @JsonProperty("all_airlines")
    public void setAllAirlines(List<Object> allAirlines) {
        this.allAirlines = allAirlines;
    }

    @JsonProperty("time")
    public Integer getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(Integer time) {
        this.time = time;
    }

    @JsonProperty("all_stopover_airports")
    public List<Object> getAllStopoverAirports() {
        return allStopoverAirports;
    }

    @JsonProperty("all_stopover_airports")
    public void setAllStopoverAirports(List<Object> allStopoverAirports) {
        this.allStopoverAirports = allStopoverAirports;
    }

    @JsonProperty("data")
    public List<Datum> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<Datum> data) {
        this.data = data;
    }

    @JsonProperty("search_id")
    public String getSearchId() {
        return searchId;
    }

    @JsonProperty("search_id")
    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
