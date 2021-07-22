package com.forecast.app.weatherforecastapp.UnitTests.utils;

import com.forecast.app.weatherforecastapp.model.mapper.Forecast;
import com.forecast.app.weatherforecastapp.persistence.entity.IssueReportEntity;
import com.forecast.app.weatherforecastapp.persistence.enums.IssueTypeEnum;

import java.util.Collections;

import static com.forecast.app.weatherforecastapp.UnitTests.utils.TestConstants.*;

public class Prerequisites {

    public static IssueReportEntity getIssueReportEntity() {
        return IssueReportEntity.builder()
                .id(ISSUE_ID)
                .issueType(IssueTypeEnum.OTHER)
                .description(ISSUE_DESCRIPTION)
                .email(ISSUE_EMAIL)
                .reportDate(ISSUE_DATE_TIME)
                .build();
    }

    public static Forecast getForecast() {
        return Forecast.builder()
                .cnt(FORECAST_CTN)
                .cod(FORECAST_COD)
                .list(Collections.emptyList())
                .message(FORECAST_MESSAGE)
                .build();
    }
}
