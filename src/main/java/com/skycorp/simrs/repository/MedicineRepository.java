package com.skycorp.simrs.repository;

import com.skycorp.simrs.model.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicineRepository extends JpaRepository<Medicine, Long> {
}
