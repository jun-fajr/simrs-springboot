package com.skycorp.simrs.service;

import com.skycorp.simrs.model.Report;
import com.skycorp.simrs.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
  @Autowired
  private ReportRepository reportRepository;

  public Report saveReport(Report report) {
    return reportRepository.save(report);
  }

  public Report findById(Long id) {
    return reportRepository.findById(id).orElse(null);
  }
}
