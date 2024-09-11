package com.skycorp.simrs.repository;

import com.skycorp.simrs.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
