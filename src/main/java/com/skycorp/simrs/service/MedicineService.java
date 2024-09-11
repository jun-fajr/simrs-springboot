package com.skycorp.simrs.service;

import com.skycorp.simrs.model.Medicine;
import com.skycorp.simrs.repository.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicineService {
  @Autowired
  private MedicineRepository medicineRepository;

  public Medicine saveMedicine(Medicine medicine) {
    return medicineRepository.save(medicine);
  }

  public Medicine findById(Long id) {
    return medicineRepository.findById(id).orElse(null);
  }
}
