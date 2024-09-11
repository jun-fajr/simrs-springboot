package com.skycorp.simrs.repository;

import com.skycorp.simrs.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
