package com.adepuu.exercises.session8;

import java.util.HashMap;

public class Authentication {

  private HashMap<String,String> userPair;
  private User currentUser;

  public Authentication(HashMap<String, String> userPair) {
    this.userPair = userPair;
    // initialize currentUser to null to set that no one is logged in
    this.currentUser = null;
  }

  // login method
  public String login(String username, String password) {
    // find the input in the userPair hash map to see if there's a match
    User user = new User(username, password);
    HashMap<String, String> existingUsers = user.getUserPair();

    // Check if user exists and if password is valid
    if (existingUsers.containsKey(username) && existingUsers.get(username).equals(password)) {
      // set the current user
      this.currentUser = user;
      return "Login succesful!";
    } else if (!existingUsers.containsKey(username)) {
      return "Username doesn't exist!";
    } else {
      return "Wrong password!";
    }
  }

  // register method
  public String registerUser(String username, String password) {
    // Check if username exists
    if (userPair.containsKey(username)) {
      return "Username already exists!";
    }

    // Create a new User object
    User newUser = new User(username, password);
    userPair.put(username, password);

    return "Register successful! Please sign in.";
  }

  // logout method
  public String logout() {
    this.currentUser = null;
    return "You have been logged out!";
  }

}
