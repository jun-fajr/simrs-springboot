package com.skycorp.simrs.controller;

import com.skycorp.simrs.model.Medicine;
import com.skycorp.simrs.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicines")
public class MedicineController {
  @Autowired
  private MedicineService medicineService;

  @PostMapping
  public Medicine createMedicine(@RequestBody Medicine medicine) {
    return medicineService.saveMedicine(medicine);
  }

  @GetMapping("/{id}")
  public Medicine getMedicine(@PathVariable Long id) {
    return medicineService.findById(id);
  }
}
