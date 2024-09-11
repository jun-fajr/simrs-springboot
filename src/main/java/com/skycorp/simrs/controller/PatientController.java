package com.skycorp.simrs.controller;

import com.skycorp.simrs.model.Patient;
import com.skycorp.simrs.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patients")
public class PatientController {
  @Autowired
  private PatientService patientService;

  @PostMapping
  public Patient createPatient(@RequestBody Patient patient) {
    return patientService.savePatient(patient);
  }

  @GetMapping("/{id}")
  public Patient getPatient(@PathVariable Long id) {
    return patientService.findById(id);
  }
}
