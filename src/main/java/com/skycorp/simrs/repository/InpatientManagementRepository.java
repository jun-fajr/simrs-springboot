package com.skycorp.simrs.repository;

import com.skycorp.simrs.model.InpatientManagement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InpatientManagementRepository extends JpaRepository<InpatientManagement, Long> {
}
