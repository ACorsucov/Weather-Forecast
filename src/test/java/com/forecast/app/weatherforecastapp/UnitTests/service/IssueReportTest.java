package com.forecast.app.weatherforecastapp.UnitTests.service;

import com.forecast.app.weatherforecastapp.persistence.repository.IssueReportRepository;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.forecast.app.weatherforecastapp.UnitTests.utils.Prerequisites.getIssueReportEntity;
import static com.forecast.app.weatherforecastapp.UnitTests.utils.TestConstants.ISSUE_ID;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
public class IssueReportTest {

    @InjectMocks
    private IssueReportService reportService;
    @Mock
    private IssueReportRepository reportRepository;

    @Test
    public void testSaveReport() {
        val entityToSave = getIssueReportEntity();

        doReturn(entityToSave).when(reportRepository).save(entityToSave);
        val returnedId = reportService.saveReport(entityToSave);

        assertEquals(ISSUE_ID, returnedId);
    }
}
