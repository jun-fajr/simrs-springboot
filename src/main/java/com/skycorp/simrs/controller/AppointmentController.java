package com.skycorp.simrs.controller;

import com.skycorp.simrs.model.Appointment;
import com.skycorp.simrs.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {
  @Autowired
  private AppointmentService appointmentService;

  @PostMapping
  public Appointment createAppointment(@RequestBody Appointment appointment) {
    return appointmentService.saveAppointment(appointment);
  }

  @GetMapping("/{id}")
  public Appointment getAppointment(@PathVariable Long id) {
    return appointmentService.findById(id);
  }
}
