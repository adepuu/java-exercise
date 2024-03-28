package com.adepuu.exercises.session8;

import java.util.HashMap;

public class User {

  // private variables
  private String username;
  private String password;
  private HashMap<String, String> userPair = new HashMap<String, String>();

  // constructor
  public User (String username, String password) {
    this.username = username;
    this.password = password;
    userPair.put(username, password); // store data in hash map
  }

  // getter
  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public HashMap<String, String> getUserPair() {
    return this.userPair;
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
