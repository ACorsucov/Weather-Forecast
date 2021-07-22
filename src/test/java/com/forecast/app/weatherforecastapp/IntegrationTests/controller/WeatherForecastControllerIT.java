package com.forecast.app.weatherforecastapp.IntegrationTests.controller;

import com.forecast.app.weatherforecastapp.WeatherForecastAppApplication;
import com.forecast.app.weatherforecastapp.controller.WeatherForecastController;
import com.forecast.app.weatherforecastapp.model.mapper.Forecast;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static com.forecast.app.weatherforecastapp.IntegrationTests.utils.ITConstants.FORECAST_URI;
import static com.forecast.app.weatherforecastapp.IntegrationTests.utils.ITConstants.LOCAL_HOST;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = WeatherForecastAppApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WeatherForecastControllerIT {

    @LocalServerPort
    private int port;

    @Autowired
    private WeatherForecastController weatherForecastController;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testGetForecastSuccess() {
        val response = restTemplate.getForObject(LOCAL_HOST + port + FORECAST_URI, Forecast.class);

        assertNotNull(response.getCod());
        assertEquals("200", response.getCod());

    }
}
