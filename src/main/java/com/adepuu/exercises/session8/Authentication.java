package com.adepuu.exercises.session8;

import java.util.HashMap;
import java.util.Scanner;

public class Authentication {

  private HashMap<String, String> userPair;
  private User currentUser;

  // Scanner to prompt user input
  Scanner scan = new Scanner(System.in);

  public Authentication(HashMap<String, String> userPair) {
    this.userPair = userPair;
    // initialize currentUser to null to set that no one is logged in
    this.currentUser = null;
  }

  // login method
  public void login() {
    while (this.currentUser == null) {
      // Prompt user
      System.out.println("Enter your credentials. Please be mindful of uppercase and/or lowercase!");
      System.out.print("Username: ");
      String username = scan.nextLine();
      System.out.print("Password: ");
      String password = scan.nextLine();

      // find the input in the userPair hash map to see if there's a match
      User user = new User(username, password);
      HashMap<String, String> existingUsers = user.getUserPair();

      // Use try catch method to handle errors
      try {
        // Check if user exists and if password is valid
        if (existingUsers.containsKey(username) && existingUsers.get(username).equals(password)) {
          this.currentUser = user;
          System.out.println("Welcome, " + user + "!");
        } else {
          throw new Exception();
        }
      } catch (Exception eLogin) {
        if (!existingUsers.containsKey(username)) {
          System.out.println("Username doesn't exist! Please try again");
        } else {
          System.out.println("Incorrect password! Please try again");
        }
      }
    }
  }

  // register method
  public void registerUser() {
    // initialized boolean for registered
    boolean isRegistered = false;

    while (!isRegistered) {
      // Prompt user
      System.out.println("Enter your credentials. Please be mindful of uppercase and/or lowercase!");
      System.out.print("New Username: ");
      String username = scan.nextLine();
      System.out.print("New Password: ");
      String password = scan.nextLine();

      try {
        // Check if username exists
        if (!userPair.containsKey(username)) {
          // Create a new User object
          User newUser = new User(username, password);
          userPair.put(username, password);
          isRegistered = true;
          System.out.println("Register successful! Please sign in.");
          // when using this method later, please redirect it to the login screen
        } else {
          throw new Exception();
        }
      } catch (Exception eReg) {
        System.out.println("Username already exists! Please try again.");
      }
    }
  }

  // logout method
  public void logout() {
    this.currentUser = null;
    System.out.println("You have been logged out!");
  }
}
