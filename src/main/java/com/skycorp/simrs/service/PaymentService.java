package com.skycorp.simrs.service;

import com.skycorp.simrs.model.Payment;
import com.skycorp.simrs.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
  @Autowired
  private PaymentRepository paymentRepository;

  public Payment savePayment(Payment payment) {
    return paymentRepository.save(payment);
  }

  public Payment findById(Long id) {
    return paymentRepository.findById(id).orElse(null);
  }
}
