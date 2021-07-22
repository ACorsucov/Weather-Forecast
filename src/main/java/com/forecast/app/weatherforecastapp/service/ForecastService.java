package com.forecast.app.weatherforecastapp.service;

import com.forecast.app.weatherforecastapp.model.mapper.Forecast;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
@RequiredArgsConstructor
public class ForecastService {

    @Value("${weather.forecast.api.prefix}")
    private String API_PATH_PREFIX;
    @Value("${weather.forecast.api.suffix}")
    private String API_PATH_SUFFIX;
    @Value("${weather.forecast.api.key}")
    private String API_KEY;

    private final RestTemplate restTemplate;

    public Forecast getForecast(String cityName) {
        val responseEntity = restTemplate.getForObject(getPath(cityName), Forecast.class);
        log.info(String.format("Received forecast for %s: %s", cityName, responseEntity));
        return responseEntity;
    }

    public String getPath(String cityName) {
        return API_PATH_PREFIX + cityName + API_PATH_SUFFIX + API_KEY;
    }
}

