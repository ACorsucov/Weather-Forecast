package com.forecast.app.weatherforecastapp.utils;

import com.forecast.app.weatherforecastapp.model.IssueReportRequest;
import com.forecast.app.weatherforecastapp.persistence.entity.IssueReportEntity;
import com.forecast.app.weatherforecastapp.persistence.enums.IssueTypeEnum;

import java.time.LocalDateTime;
import java.util.function.Function;

public class TransformerUtils {

    public static Function<IssueReportRequest, IssueReportEntity> convertToIssueReportEntity =
            reportRequest -> IssueReportEntity.builder()
                    .issueType(IssueTypeEnum.valueOf(reportRequest.getIssueType()))
                    .description(reportRequest.getDescription())
                    .email(reportRequest.getEmail())
                    .reportDate(LocalDateTime.now())
                    .build();
}
