package com.forecast.app.weatherforecastapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IssueReportRequest {

    private String issueType;
    private String description;
    private String email;
}

