package com.adepuu.exercises.session10;

import java.util.Objects;
import java.util.Scanner;

public class Menu {
  private Scanner scanner;

  private boolean isOpen;

  public Menu(Scanner scanner) {
    this.scanner = scanner;
    this.isOpen = true;
  }

  User user = new User();
  Library library = new Library();

  public boolean getIsOpen() {
    return isOpen;
  }

  public void setIsOpen() {
    isOpen = false;
  }

  public void openApp() {
    while (getIsOpen()) {
      try{
      System.out.println("""
                          
              ----- Library App -----\s
              Before using this app, please sign up or sign in.
              Select authentication option below:
              1. Sign up
              2. Sign in
              3. Close app
              """);

      System.out.print("Choose option:");
      String input = scanner.next();

      switch (input) {
        case "1" -> signUp();
        case "2" -> signIn();
        case "3" -> setIsOpen();
        default -> System.out.println("----- Input invalid -----");
      }
      }catch (Exception e) {
        System.out.println("----- App Stopped");
      }
    }
  }

  public void userMenu() {
    while (user.getIsLogin()) {
      System.out.println("""
                          
              ----- Library Menu -----\s
                          
              Select menu option below:
              1. Show list of Materials
              2. Borrow Material
              3. Return Material
              4. Logout
              5. Close app
              """);
      System.out.print("Choose option: ");
      String input = scanner.next();

      switch (input) {
        case "1" -> library.getMaterials();
        case "2" -> library.borrowMaterial();
        case "3" -> library.returnMaterial();
        case "4" -> {
          user.setIsLogin(false);
          openApp();
        }
        case "5" -> {
          setIsOpen();
          user.setIsLogin(false);
        }
        default -> {
          System.out.println("----- Input invalid -----");
          openApp();
        }
      }
    }
  }

  public void adminMenu() {
    while (user.getIsLogin()) {
      System.out.println("""
                          
              ----- Library Menu -----\s
                          
              Select menu option below:
              1. Get list of Materials
              2. Create Material
              3. Logout
              4. Close app
              """);
      System.out.print("Choose option: ");
      String input = scanner.next();

      switch (input) {
        case "1" -> library.getMaterials();
        case "2" -> library.addMaterial();
        case "3" -> {
          user.setIsLogin(false);
          openApp();
        }
        case "4" -> {
          setIsOpen();
          user.setIsLogin(false);
        }
        default -> {
          System.out.println("----- Input invalid -----");
          openApp();
        }
      }
    }
  }

  public void signUp() {
    System.out.println("""
                        
            ----- Sign up -----\s
            """);
    System.out.print("Username: ");
    String username = scanner.next();

    System.out.print("Password: ");
    String password = scanner.next();

    try {
      if (user.register(username, password)) {
        userMenu();
      }
    } catch (Exception e) {
      System.out.println("Ups something error: " + e);
    }
  }

  public void signIn() {
    System.out.println("""
                        
            ----- Sign in -----\s
            """);
    System.out.print("Username: ");
    String username = scanner.next();

    System.out.print("Password: ");
    String password = scanner.next();

    try {
      if (Objects.equals(username, "admin") && Objects.equals(password, "123")) {
        user.setIsLogin(true);
        adminMenu();
        System.out.println("admin login");
      }
      if (user.login(username, password)) {
        userMenu();
      }
    } catch (Exception e) {
      System.out.println("Ups something error: " + e);
    }
  }
}