package com.forecast.app.weatherforecastapp.persistence.repository;

import com.forecast.app.weatherforecastapp.persistence.entity.IssueReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueReportRepository extends JpaRepository<IssueReportEntity, Long> {
}
