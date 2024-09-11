package com.skycorp.simrs.controller;

import com.skycorp.simrs.model.Inventory;
import com.skycorp.simrs.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventories")
public class InventoryController {
  @Autowired
  private InventoryService inventoryService;

  @PostMapping
  public Inventory createInventory(@RequestBody Inventory inventory) {
    return inventoryService.saveInventory(inventory);
  }

  @GetMapping("/{id}")
  public Inventory getInventory(@PathVariable Long id) {
    return inventoryService.findById(id);
  }
}
