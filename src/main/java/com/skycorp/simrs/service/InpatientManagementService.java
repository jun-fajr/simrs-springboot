package com.skycorp.simrs.service;

import com.skycorp.simrs.model.InpatientManagement;
import com.skycorp.simrs.repository.InpatientManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InpatientManagementService {
  @Autowired
  private InpatientManagementRepository inpatientManagementRepository;

  public InpatientManagement saveInpatient(InpatientManagement inpatient) {
    return inpatientManagementRepository.save(inpatient);
  }

  public InpatientManagement findById(Long id) {
    return inpatientManagementRepository.findById(id).orElse(null);
  }
}
