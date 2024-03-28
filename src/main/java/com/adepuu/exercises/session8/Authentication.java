package com.adepuu.exercises.session8;

import java.util.HashMap;
import java.util.Scanner;

public class Authentication {

  private HashMap<String, String> userPair = new HashMap<>();
  private HashMap<String, User> userPassPair = new HashMap<>();
  private User currentUser;

  // Scanner to prompt user input
  private Scanner scan;
  private App app; // need to be looked at again

  public Authentication() {
    // initialize currentUser to null to set that no one is logged in
    this.currentUser = null;
    this.scan = new Scanner(System.in);
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
      String loginKey = username + password;

      // Use try catch method to handle errors
      try {
        // Check if user exists and if password is valid
        if (userPassPair == null) {
          System.out.println("No registered user, please register first.");
          return;
        } else if (userPassPair.containsKey(loginKey) && userPair.get(username).equals(password)) {
          this.currentUser = new User(username, password);
          System.out.println("Welcome, " + username + "!");
        } else {
          throw new Exception();
        }
      } catch (Exception eLogin) {
        if (!userPassPair.containsKey(username)) {
          System.out.println("Username doesn't exist! Please try again");
        } else {
          System.out.println("Incorrect password! Please try again");
        }
      }
    }
    scan.close();
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
      String loginKey = username + password;

      try {
        // Check if username exists
        if (!this.userPair.containsKey(username)) {
          // Create a new User object
          User newUser = new User(username, password);
          this.userPassPair.put(loginKey, newUser);
          this.userPair.put(username, password);
          isRegistered = true;
          System.out.println("Register successful! Please sign in.");
          // when using this method later, please redirect it to the login screen
          app.loginMenu(); // use callback to login method
          // this still doesn't work
        } else {
          throw new Exception();
        }
      } catch (Exception eReg) {
        System.out.println("Username already exists! Please try again.");
      }
    }
    scan.close();
  }

  // logout method
  public void logout() {
    this.currentUser = null;
    System.out.println("You have been logged out!");
  }
}
