package com.skycorp.simrs.repository;

import com.skycorp.simrs.model.Billing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingRepository extends JpaRepository<Billing, Long> {
}
