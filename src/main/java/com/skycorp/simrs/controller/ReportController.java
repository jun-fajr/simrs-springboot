package com.skycorp.simrs.controller;

import com.skycorp.simrs.model.Report;
import com.skycorp.simrs.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reports")
public class ReportController {
  @Autowired
  private ReportService reportService;

  @PostMapping
  public Report createReport(@RequestBody Report report) {
    return reportService.saveReport(report);
  }

  @GetMapping("/{id}")
  public Report getReport(@PathVariable Long id) {
    return reportService.findById(id);
  }
}
