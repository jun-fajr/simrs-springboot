package com.skycorp.simrs.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Queue {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "patient_id")
  private Patient patient;

  private Integer queueNumber;
  private LocalDateTime appointmentTime;
  private String estimatedWaitTime;
  private String status;

  // Getters and Setters
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Patient getPatient() {
    return patient;
  }

  public void setPatient(Patient patient) {
    this.patient = patient;
  }

  public Integer getQueueNumber() {
    return queueNumber;
  }

  public void setQueueNumber(Integer queueNumber) {
    this.queueNumber = queueNumber;
  }

  public LocalDateTime getAppointmentTime() {
    return appointmentTime;
  }

  public void setAppointmentTime(LocalDateTime appointmentTime) {
    this.appointmentTime = appointmentTime;
  }

  public String getEstimatedWaitTime() {
    return estimatedWaitTime;
  }

  public void setEstimatedWaitTime(String estimatedWaitTime) {
    this.estimatedWaitTime = estimatedWaitTime;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
