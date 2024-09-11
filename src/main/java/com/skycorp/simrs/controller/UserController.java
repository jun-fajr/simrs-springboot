package com.skycorp.simrs.controller;

import com.skycorp.simrs.model.User;
import com.skycorp.simrs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
  @Autowired
  private UserService userService;

  @PostMapping
  public User createUser(@RequestBody User user) {
    return userService.saveUser(user);
  }

  @GetMapping("/{id}")
  public User getUser(@PathVariable Long id) {
    return userService.findById(id);
  }
}
