package com.skycorp.simrs.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class OnlineRegistration {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "patient_id")
  private Patient patient;

  private LocalDateTime registrationDate;
  private String status;
  private boolean confirmationEmailSent;

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

  public LocalDateTime getRegistrationDate() {
    return registrationDate;
  }

  public void setRegistrationDate(LocalDateTime registrationDate) {
    this.registrationDate = registrationDate;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public boolean isConfirmationEmailSent() {
    return confirmationEmailSent;
  }

  public void setConfirmationEmailSent(boolean confirmationEmailSent) {
    this.confirmationEmailSent = confirmationEmailSent;
  }
}
