package com.forecast.app.weatherforecastapp.persistence.entity;

import com.forecast.app.weatherforecastapp.persistence.enums.IssueTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "report")
public class IssueReportEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @Enumerated(EnumType.STRING)
    private IssueTypeEnum issueType;

    @Column
    private String description;

    @Column
    private String email;

    @Column
    private LocalDateTime reportDate;
}
