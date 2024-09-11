package com.skycorp.simrs.service;

import com.skycorp.simrs.model.Billing;
import com.skycorp.simrs.repository.BillingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillingService {
  @Autowired
  private BillingRepository billingRepository;

  public Billing saveBilling(Billing billing) {
    return billingRepository.save(billing);
  }

  public Billing findById(Long id) {
    return billingRepository.findById(id).orElse(null);
  }
}
