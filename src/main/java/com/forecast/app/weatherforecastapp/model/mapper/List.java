package com.forecast.app.weatherforecastapp.model.mapper;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "dt",
        "main",
        "weather",
        "clouds",
        "wind",
        "visibility",
        "pop",
        "rain",
        "sys",
        "dt_txt"
})
public class List {

    @JsonProperty("dt")
    public Integer dt;
    @JsonProperty("main")
    public Main main;
    @JsonProperty("weather")
    public java.util.List<Weather> weather = null;
    @JsonProperty("clouds")
    public Clouds clouds;
    @JsonProperty("wind")
    public Wind wind;
    @JsonProperty("visibility")
    public Integer visibility;
    @JsonProperty("pop")
    public Integer pop;
    @JsonProperty("rain")
    public Rain rain;
    @JsonProperty("sys")
    public Sys sys;
    @JsonProperty("dt_txt")
    public String dtTxt;
}
