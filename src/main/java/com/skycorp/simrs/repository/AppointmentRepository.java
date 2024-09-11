package com.skycorp.simrs.repository;

import com.skycorp.simrs.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
