package com.forecast.app.weatherforecastapp.model.mapper;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "cod",
        "message",
        "cnt",
        "list",
        "city"
})
public class Forecast {

    @JsonProperty("cod")
    public String cod;
    @JsonProperty("message")
    public Integer message;
    @JsonProperty("cnt")
    public Integer cnt;
    @JsonProperty("list")
    public java.util.List<List> list = null;
    @JsonProperty("city")
    public City city;
}
