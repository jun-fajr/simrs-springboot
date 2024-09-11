package com.skycorp.simrs.service;

import com.skycorp.simrs.model.OnlineRegistration;
import com.skycorp.simrs.repository.OnlineRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OnlineRegistrationService {
  @Autowired
  private OnlineRegistrationRepository onlineRegistrationRepository;

  public OnlineRegistration saveRegistration(OnlineRegistration registration) {
    return onlineRegistrationRepository.save(registration);
  }

  public OnlineRegistration findById(Long id) {
    return onlineRegistrationRepository.findById(id).orElse(null);
  }
}
