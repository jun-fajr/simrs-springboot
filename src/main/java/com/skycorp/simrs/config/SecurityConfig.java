package com.skycorp.simrs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.beans.factory.annotation.Autowired;

@Configuration
public class SecurityConfig {

  @Autowired
  private UserDetailsService userDetailsService;

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http
        .authorizeHttpRequests(authorize -> authorize
            .requestMatchers("/admin/**").hasRole("ADMIN")
            .requestMatchers("/doctor/**").hasRole("DOCTOR")
            .requestMatchers("/nurse/**").hasRole("NURSE")
            .requestMatchers("/front-office/**").hasRole("FRONT_OFFICE")
            .requestMatchers("/pharmacy/**").hasRole("PHARMACY")
            .requestMatchers("/finance/**").hasRole("FINANCE")
            .requestMatchers("/patient/**").hasRole("PATIENT")
            .requestMatchers("/**").permitAll())
        .formLogin(form -> form
            .loginPage("/login")
            .permitAll())
        .logout(logout -> logout.permitAll());

    return http.build();
  }

  @Autowired
  public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
    auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }
}
