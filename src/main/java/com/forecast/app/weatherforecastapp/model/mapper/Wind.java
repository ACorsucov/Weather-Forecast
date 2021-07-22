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
        "speed",
        "deg",
        "gust"
})
public class Wind {

    @JsonProperty("speed")
    public Double speed;
    @JsonProperty("deg")
    public Integer deg;
    @JsonProperty("gust")
    public Double gust;

}
