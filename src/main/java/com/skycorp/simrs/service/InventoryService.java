package com.skycorp.simrs.service;

import com.skycorp.simrs.model.Inventory;
import com.skycorp.simrs.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {
  @Autowired
  private InventoryRepository inventoryRepository;

  public Inventory saveInventory(Inventory inventory) {
    return inventoryRepository.save(inventory);
  }

  public Inventory findById(Long id) {
    return inventoryRepository.findById(id).orElse(null);
  }
}
