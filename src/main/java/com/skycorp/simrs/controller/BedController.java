package com.skycorp.simrs.controller;

import com.skycorp.simrs.model.Bed;
import com.skycorp.simrs.service.BedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/beds")
public class BedController {
  @Autowired
  private BedService bedService;

  @PostMapping
  public Bed createBed(@RequestBody Bed bed) {
    return bedService.saveBed(bed);
  }

  @GetMapping("/{id}")
  public Bed getBed(@PathVariable Long id) {
    return bedService.findById(id);
  }
}
