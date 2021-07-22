package com.forecast.app.weatherforecastapp.controller;

import com.forecast.app.weatherforecastapp.model.mapper.Forecast;
import com.forecast.app.weatherforecastapp.service.ForecastService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/forecast")
public class WeatherForecastController {

    private final ForecastService forecastService;

    /**
     * Gets the forecast for a given city
     *
     * @param cityName The name of the city
     * @return The forcast
     */

    @GetMapping("/{cityName}")
    public Forecast getForecast(@PathVariable String cityName) {
        return forecastService.getForecast(cityName);
    }


}
