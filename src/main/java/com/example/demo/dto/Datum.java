
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
    "quality",
    "flyTo",
    "deep_link",
    "mapIdto",
    "nightsInDest",
    "airlines",
    "pnr_count",
    "fly_duration",
    "baglimit",
    "has_airport_change",
    "distance",
    "type_flights",
    "bags_price",
    "flyFrom",
    "dTimeUTC",
    "p2",
    "p3",
    "p1",
    "dTime",
    "found_on",
    "booking_token",
    "cityFrom",
    "mapIdfrom",
    "duration",
    "id",
    "conversion",
    "countryTo",
    "aTimeUTC",
    "price",
    "routes",
    "cityTo",
    "transfers",
    "route",
    "facilitated_booking_available",
    "aTime",
    "countryFrom"
})
public class Datum {

    @JsonProperty("quality")
    private Double quality;
    @JsonProperty("flyTo")
    private String flyTo;
    @JsonProperty("deep_link")
    private String deepLink;
    @JsonProperty("mapIdto")
    private String mapIdto;
    @JsonProperty("nightsInDest")
    private Object nightsInDest;
    @JsonProperty("airlines")
    private List<String> airlines = null;
    @JsonProperty("pnr_count")
    private Integer pnrCount;
    @JsonProperty("fly_duration")
    private String flyDuration;
    @JsonProperty("baglimit")
    private Baglimit baglimit;
    @JsonProperty("has_airport_change")
    private Boolean hasAirportChange;
    @JsonProperty("distance")
    private Double distance;
    @JsonProperty("type_flights")
    private List<String> typeFlights = null;
    @JsonProperty("bags_price")
    private BagsPrice bagsPrice;
    @JsonProperty("flyFrom")
    private String flyFrom;
    @JsonProperty("dTimeUTC")
    private Integer dTimeUTC;
    @JsonProperty("p2")
    private Integer p2;
    @JsonProperty("p3")
    private Integer p3;
    @JsonProperty("p1")
    private Integer p1;
    @JsonProperty("dTime")
    private Integer dTime;
    @JsonProperty("found_on")
    private List<String> foundOn = null;
    @JsonProperty("booking_token")
    private String bookingToken;
    @JsonProperty("cityFrom")
    private String cityFrom;
    @JsonProperty("mapIdfrom")
    private String mapIdfrom;
    @JsonProperty("duration")
    private Duration duration;
    @JsonProperty("id")
    private String id;
    @JsonProperty("conversion")
    private Conversion conversion;
    @JsonProperty("countryTo")
    private CountryTo countryTo;
    @JsonProperty("aTimeUTC")
    private Integer aTimeUTC;
    @JsonProperty("price")
    private Integer price;
    @JsonProperty("routes")
    private List<List<String>> routes = null;
    @JsonProperty("cityTo")
    private String cityTo;
    @JsonProperty("transfers")
    private List<Object> transfers = null;
    @JsonProperty("route")
    private List<Route> route = null;
    @JsonProperty("facilitated_booking_available")
    private Boolean facilitatedBookingAvailable;
    @JsonProperty("aTime")
    private Integer aTime;
    @JsonProperty("countryFrom")
    private CountryFrom countryFrom;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("quality")
    public Double getQuality() {
        return quality;
    }

    @JsonProperty("quality")
    public void setQuality(Double quality) {
        this.quality = quality;
    }

    @JsonProperty("flyTo")
    public String getFlyTo() {
        return flyTo;
    }

    @JsonProperty("flyTo")
    public void setFlyTo(String flyTo) {
        this.flyTo = flyTo;
    }

    @JsonProperty("deep_link")
    public String getDeepLink() {
        return deepLink;
    }

    @JsonProperty("deep_link")
    public void setDeepLink(String deepLink) {
        this.deepLink = deepLink;
    }

    @JsonProperty("mapIdto")
    public String getMapIdto() {
        return mapIdto;
    }

    @JsonProperty("mapIdto")
    public void setMapIdto(String mapIdto) {
        this.mapIdto = mapIdto;
    }

    @JsonProperty("nightsInDest")
    public Object getNightsInDest() {
        return nightsInDest;
    }

    @JsonProperty("nightsInDest")
    public void setNightsInDest(Object nightsInDest) {
        this.nightsInDest = nightsInDest;
    }

    @JsonProperty("airlines")
    public List<String> getAirlines() {
        return airlines;
    }

    @JsonProperty("airlines")
    public void setAirlines(List<String> airlines) {
        this.airlines = airlines;
    }

    @JsonProperty("pnr_count")
    public Integer getPnrCount() {
        return pnrCount;
    }

    @JsonProperty("pnr_count")
    public void setPnrCount(Integer pnrCount) {
        this.pnrCount = pnrCount;
    }

    @JsonProperty("fly_duration")
    public String getFlyDuration() {
        return flyDuration;
    }

    @JsonProperty("fly_duration")
    public void setFlyDuration(String flyDuration) {
        this.flyDuration = flyDuration;
    }

    @JsonProperty("baglimit")
    public Baglimit getBaglimit() {
        return baglimit;
    }

    @JsonProperty("baglimit")
    public void setBaglimit(Baglimit baglimit) {
        this.baglimit = baglimit;
    }

    @JsonProperty("has_airport_change")
    public Boolean getHasAirportChange() {
        return hasAirportChange;
    }

    @JsonProperty("has_airport_change")
    public void setHasAirportChange(Boolean hasAirportChange) {
        this.hasAirportChange = hasAirportChange;
    }

    @JsonProperty("distance")
    public Double getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(Double distance) {
        this.distance = distance;
    }

    @JsonProperty("type_flights")
    public List<String> getTypeFlights() {
        return typeFlights;
    }

    @JsonProperty("type_flights")
    public void setTypeFlights(List<String> typeFlights) {
        this.typeFlights = typeFlights;
    }

    @JsonProperty("bags_price")
    public BagsPrice getBagsPrice() {
        return bagsPrice;
    }

    @JsonProperty("bags_price")
    public void setBagsPrice(BagsPrice bagsPrice) {
        this.bagsPrice = bagsPrice;
    }

    @JsonProperty("flyFrom")
    public String getFlyFrom() {
        return flyFrom;
    }

    @JsonProperty("flyFrom")
    public void setFlyFrom(String flyFrom) {
        this.flyFrom = flyFrom;
    }

    @JsonProperty("dTimeUTC")
    public Integer getDTimeUTC() {
        return dTimeUTC;
    }

    @JsonProperty("dTimeUTC")
    public void setDTimeUTC(Integer dTimeUTC) {
        this.dTimeUTC = dTimeUTC;
    }

    @JsonProperty("p2")
    public Integer getP2() {
        return p2;
    }

    @JsonProperty("p2")
    public void setP2(Integer p2) {
        this.p2 = p2;
    }

    @JsonProperty("p3")
    public Integer getP3() {
        return p3;
    }

    @JsonProperty("p3")
    public void setP3(Integer p3) {
        this.p3 = p3;
    }

    @JsonProperty("p1")
    public Integer getP1() {
        return p1;
    }

    @JsonProperty("p1")
    public void setP1(Integer p1) {
        this.p1 = p1;
    }

    @JsonProperty("dTime")
    public Integer getDTime() {
        return dTime;
    }

    @JsonProperty("dTime")
    public void setDTime(Integer dTime) {
        this.dTime = dTime;
    }

    @JsonProperty("found_on")
    public List<String> getFoundOn() {
        return foundOn;
    }

    @JsonProperty("found_on")
    public void setFoundOn(List<String> foundOn) {
        this.foundOn = foundOn;
    }

    @JsonProperty("booking_token")
    public String getBookingToken() {
        return bookingToken;
    }

    @JsonProperty("booking_token")
    public void setBookingToken(String bookingToken) {
        this.bookingToken = bookingToken;
    }

    @JsonProperty("cityFrom")
    public String getCityFrom() {
        return cityFrom;
    }

    @JsonProperty("cityFrom")
    public void setCityFrom(String cityFrom) {
        this.cityFrom = cityFrom;
    }

    @JsonProperty("mapIdfrom")
    public String getMapIdfrom() {
        return mapIdfrom;
    }

    @JsonProperty("mapIdfrom")
    public void setMapIdfrom(String mapIdfrom) {
        this.mapIdfrom = mapIdfrom;
    }

    @JsonProperty("duration")
    public Duration getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("conversion")
    public Conversion getConversion() {
        return conversion;
    }

    @JsonProperty("conversion")
    public void setConversion(Conversion conversion) {
        this.conversion = conversion;
    }

    @JsonProperty("countryTo")
    public CountryTo getCountryTo() {
        return countryTo;
    }

    @JsonProperty("countryTo")
    public void setCountryTo(CountryTo countryTo) {
        this.countryTo = countryTo;
    }

    @JsonProperty("aTimeUTC")
    public Integer getATimeUTC() {
        return aTimeUTC;
    }

    @JsonProperty("aTimeUTC")
    public void setATimeUTC(Integer aTimeUTC) {
        this.aTimeUTC = aTimeUTC;
    }

    @JsonProperty("price")
    public Integer getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Integer price) {
        this.price = price;
    }

    @JsonProperty("routes")
    public List<List<String>> getRoutes() {
        return routes;
    }

    @JsonProperty("routes")
    public void setRoutes(List<List<String>> routes) {
        this.routes = routes;
    }

    @JsonProperty("cityTo")
    public String getCityTo() {
        return cityTo;
    }

    @JsonProperty("cityTo")
    public void setCityTo(String cityTo) {
        this.cityTo = cityTo;
    }

    @JsonProperty("transfers")
    public List<Object> getTransfers() {
        return transfers;
    }

    @JsonProperty("transfers")
    public void setTransfers(List<Object> transfers) {
        this.transfers = transfers;
    }

    @JsonProperty("route")
    public List<Route> getRoute() {
        return route;
    }

    @JsonProperty("route")
    public void setRoute(List<Route> route) {
        this.route = route;
    }

    @JsonProperty("facilitated_booking_available")
    public Boolean getFacilitatedBookingAvailable() {
        return facilitatedBookingAvailable;
    }

    @JsonProperty("facilitated_booking_available")
    public void setFacilitatedBookingAvailable(Boolean facilitatedBookingAvailable) {
        this.facilitatedBookingAvailable = facilitatedBookingAvailable;
    }

    @JsonProperty("aTime")
    public Integer getATime() {
        return aTime;
    }

    @JsonProperty("aTime")
    public void setATime(Integer aTime) {
        this.aTime = aTime;
    }

    @JsonProperty("countryFrom")
    public CountryFrom getCountryFrom() {
        return countryFrom;
    }

    @JsonProperty("countryFrom")
    public void setCountryFrom(CountryFrom countryFrom) {
        this.countryFrom = countryFrom;
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
