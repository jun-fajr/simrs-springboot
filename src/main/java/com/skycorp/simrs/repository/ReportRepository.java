package com.skycorp.simrs.repository;

import com.skycorp.simrs.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Report, Long> {
}
