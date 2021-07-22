package com.forecast.app.weatherforecastapp.service;

import com.forecast.app.weatherforecastapp.persistence.entity.IssueReportEntity;
import com.forecast.app.weatherforecastapp.persistence.repository.IssueReportRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class IssueReportService {

    private final IssueReportRepository issueReportRepository;

    public Long saveReport(IssueReportEntity reportEntity) {
        val savedEntity = issueReportRepository.save(reportEntity);
        log.info(String.format("saving report with id: %s", savedEntity.getId()));
        return savedEntity.getId();
    }
}
