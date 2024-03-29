package com.adepuu.exercises.session7;

import java.util.Objects;
import java.util.Scanner;

public class Menu {
  private final Scanner scanner;

  private boolean isOpen;

  public Menu(Scanner scanner) {
    this.scanner = scanner;
    this.isOpen = true;
  }

  User user = new User();
  Event event = new Event();

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
                          
              ----- Ticket App -----\s
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
                          
              ----- Ticket Menu -----\s
                          
              Select menu option below:
              1. Show list of tickets
              2. Booking ticket
              3. View Booked tickets
              4. Logout
              5. Close app
              """);
      System.out.print("Choose option: ");
      String input = scanner.next();

      switch (input) {
        case "1" -> event.getTickets();
        case "2" -> event.bookingTicket();
        case "3" -> event.getTicketByUserId();
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
                          
              ----- Ticket Menu -----\s
                          
              Select menu option below:
              1. Get list of tickets
              2. Create Ticket
              3. Edit ticket
              4. Delete ticket
              5. Logout
              6. Close app
              """);
      System.out.print("Choose option: ");
      String input = scanner.next();

      switch (input) {
        case "1" -> event.getTickets();
        case "2" -> event.create();
        case "3" -> event.editTicket();
        case "4" -> event.deleteTicket();
        case "5" -> {
          user.setIsLogin(false);
          openApp();
        }
        case "6" -> {
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
