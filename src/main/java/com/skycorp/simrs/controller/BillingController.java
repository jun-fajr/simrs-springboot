package com.skycorp.simrs.controller;

import com.skycorp.simrs.model.Billing;
import com.skycorp.simrs.service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/billings")
public class BillingController {
  @Autowired
  private BillingService billingService;

  @PostMapping
  public Billing createBilling(@RequestBody Billing billing) {
    return billingService.saveBilling(billing);
  }

  @GetMapping("/{id}")
  public Billing getBilling(@PathVariable Long id) {
    return billingService.findById(id);
  }
}
