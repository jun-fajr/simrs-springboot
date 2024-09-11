package com.skycorp.simrs.controller;

import com.skycorp.simrs.model.InpatientManagement;
import com.skycorp.simrs.service.InpatientManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inpatients")
public class InpatientManagementController {
  @Autowired
  private InpatientManagementService inpatientService;

  @PostMapping
  public InpatientManagement createInpatient(@RequestBody InpatientManagement inpatient) {
    return inpatientService.saveInpatient(inpatient);
  }

  @GetMapping("/{id}")
  public InpatientManagement getInpatient(@PathVariable Long id) {
    return inpatientService.findById(id);
  }
}
