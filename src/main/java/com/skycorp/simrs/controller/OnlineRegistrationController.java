package com.skycorp.simrs.controller;

import com.skycorp.simrs.model.OnlineRegistration;
import com.skycorp.simrs.service.OnlineRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/registrations")
public class OnlineRegistrationController {
  @Autowired
  private OnlineRegistrationService registrationService;

  @PostMapping
  public OnlineRegistration createRegistration(@RequestBody OnlineRegistration registration) {
    return registrationService.saveRegistration(registration);
  }

  @GetMapping("/{id}")
  public OnlineRegistration getRegistration(@PathVariable Long id) {
    return registrationService.findById(id);
  }
}
