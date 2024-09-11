package com.skycorp.simrs.repository;

import com.skycorp.simrs.model.OnlineRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OnlineRegistrationRepository extends JpaRepository<OnlineRegistration, Long> {
}
