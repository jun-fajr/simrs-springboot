package com.skycorp.simrs.service;

import com.skycorp.simrs.model.Patient;
import com.skycorp.simrs.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
  @Autowired
  private PatientRepository patientRepository;

  public Patient savePatient(Patient patient) {
    return patientRepository.save(patient);
  }

  public Patient findById(Long id) {
    return patientRepository.findById(id).orElse(null);
  }
}
