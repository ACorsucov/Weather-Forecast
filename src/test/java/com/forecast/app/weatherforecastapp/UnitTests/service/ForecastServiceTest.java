package com.forecast.app.weatherforecastapp.UnitTests.service;

import com.forecast.app.weatherforecastapp.model.mapper.Forecast;
import lombok.val;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.web.client.RestTemplate;

import static com.forecast.app.weatherforecastapp.UnitTests.utils.Prerequisites.getForecast;
import static com.forecast.app.weatherforecastapp.UnitTests.utils.TestConstants.CITY_NAME;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
public class ForecastServiceTest {

    @InjectMocks
    private ForecastService forecastService;
    @Mock
    private RestTemplate restTemplate;

    @BeforeEach
    public void setUp() {
        ReflectionTestUtils.setField(forecastService, "API_PATH_PREFIX", "prefix");
        ReflectionTestUtils.setField(forecastService, "API_PATH_SUFFIX", "suffix");
        ReflectionTestUtils.setField(forecastService, "API_KEY", "key");
    }

    @Test
    public void testGetForecast() {
        val forecast = getForecast();

        doReturn(forecast).when(restTemplate).getForObject(any(String.class), eq(Forecast.class));

        val response = forecastService.getForecast(CITY_NAME);
        assertEquals(forecast, response);
    }
}
