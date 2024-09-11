package com.skycorp.simrs.service;

import com.skycorp.simrs.model.Appointment;
import com.skycorp.simrs.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {
  @Autowired
  private AppointmentRepository appointmentRepository;

  public Appointment saveAppointment(Appointment appointment) {
    return appointmentRepository.save(appointment);
  }

  public Appointment findById(Long id) {
    return appointmentRepository.findById(id).orElse(null);
  }
}
