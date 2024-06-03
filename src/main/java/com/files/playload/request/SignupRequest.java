package com.files.playload.request;

import java.util.Set;

import jakarta.persistence.Column;

public class SignupRequest {
  
  @Column(nullable = false,length = 200)
  private String username;

  @Column(nullable = false,length = 200)
  private String email;

  private Set<String> role;

  @Column(nullable = false,length = 500)
  private String password;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Set<String> getRole() {
    return this.role;
  }

  public void setRole(Set<String> role) {
    this.role = role;
  }
}
