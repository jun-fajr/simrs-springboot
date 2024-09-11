package com.skycorp.simrs.service;

import com.skycorp.simrs.model.Bed;
import com.skycorp.simrs.repository.BedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BedService {
  @Autowired
  private BedRepository bedRepository;

  public Bed saveBed(Bed bed) {
    return bedRepository.save(bed);
  }

  public Bed findById(Long id) {
    return bedRepository.findById(id).orElse(null);
  }
}
