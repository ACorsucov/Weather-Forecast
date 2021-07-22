package com.forecast.app.weatherforecastapp.controller;

import com.forecast.app.weatherforecastapp.model.IssueReportRequest;
import com.forecast.app.weatherforecastapp.UnitTests.service.IssueReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.forecast.app.weatherforecastapp.UnitTests.utils.TransformerUtils.convertToIssueReportEntity;

@RestController
@RequiredArgsConstructor
@RequestMapping("/issues")
public class IssueReportController {

    private final IssueReportService issueReportService;

    @PostMapping("/report")
    public Long reportIssue(@RequestBody IssueReportRequest reportRequest) {
        return issueReportService.saveReport(convertToIssueReportEntity.apply(reportRequest));
    }
}
