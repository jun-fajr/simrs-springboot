package com.skycorp.simrs.repository;

import com.skycorp.simrs.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}
