package com.skycorp.simrs.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class InpatientManagement {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "patient_id")
  private Patient patient;

  @ManyToOne
  @JoinColumn(name = "bed_id")
  private Bed bed;

  private LocalDateTime admissionDate;
  private LocalDateTime dischargeDate;

  @ManyToOne
  @JoinColumn(name = "doctor_id")
  private User doctor;

  @ManyToOne
  @JoinColumn(name = "nurse_id")
  private User nurse;

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

  public Bed getBed() {
    return bed;
  }

  public void setBed(Bed bed) {
    this.bed = bed;
  }

  public LocalDateTime getAdmissionDate() {
    return admissionDate;
  }

  public void setAdmissionDate(LocalDateTime admissionDate) {
    this.admissionDate = admissionDate;
  }

  public LocalDateTime getDischargeDate() {
    return dischargeDate;
  }

  public void setDischargeDate(LocalDateTime dischargeDate) {
    this.dischargeDate = dischargeDate;
  }

  public User getDoctor() {
    return doctor;
  }

  public void setDoctor(User doctor) {
    this.doctor = doctor;
  }

  public User getNurse() {
    return nurse;
  }

  public void setNurse(User nurse) {
    this.nurse = nurse;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
