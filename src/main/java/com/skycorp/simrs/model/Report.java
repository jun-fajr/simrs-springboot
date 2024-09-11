package com.skycorp.simrs.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Report {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String reportType;
  private LocalDateTime generatedAt;
  private String content;

  // Getters and Setters
}
