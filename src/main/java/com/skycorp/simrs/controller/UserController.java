package com.skycorp.simrs.controller;

import com.skycorp.simrs.model.User;
import com.skycorp.simrs.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

  private final UserService userService;

  // Constructor-based dependency injection
  public UserController(UserService userService) {
    this.userService = userService;
  }

  // Create a new user
  @PostMapping
  public ResponseEntity<User> createUser(@RequestBody User user) {
    User createdUser = userService.saveUser(user);
    return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
  }

  // Get a user by ID
  @GetMapping("/{id}")
  public ResponseEntity<User> getUser(@PathVariable Long id) {
    return userService.findById(id)
        .map(user -> new ResponseEntity<>(user, HttpStatus.OK))
        .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND)); // Return 404 if user not found
  }
}
