package com.adepuu.exercises.session8;

import java.util.HashMap;

public class User {

  // private variables
  private String username;
  private String password;

  // constructor
  public User (String username, String password) {
    this.username = username;
    this.password = password;
  }

  // getter
  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  // setter
  public void setUsername() {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public boolean passwordValid(String password) {
    return this.password.equals(password);
  }
}
