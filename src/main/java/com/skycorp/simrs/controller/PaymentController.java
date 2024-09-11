package com.skycorp.simrs.controller;

import com.skycorp.simrs.model.Payment;
import com.skycorp.simrs.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {
  @Autowired
  private PaymentService paymentService;

  @PostMapping
  public Payment createPayment(@RequestBody Payment payment) {
    return paymentService.savePayment(payment);
  }

  @GetMapping("/{id}")
  public Payment getPayment(@PathVariable Long id) {
    return paymentService.findById(id);
  }
}
