package com.adepuu.exercises.session8;

import java.util.Objects;
import java.util.Scanner;

public class Menu {
  private Scanner scanner;

  public Menu(Scanner scanner) {
    this.scanner = scanner;
  }

  User user = new User();
  TodoList todoList = new TodoList();

  public void openApp() {
    System.out.println("""
                        
            ----- Welcome to Todo app -----\s
                        
            Before using this app, please sign up or sign in.
            Select authentication option below:
            1. Sign up
            2. Sign in
            """);

    System.out.print("Choose option: ");
    String input = scanner.next();

    switch (input) {
      case "1" -> signUp();
      case "2" -> signIn();
      default -> {
        System.out.println("----- Input invalid -----");
        openApp();
      }
    }
  }

  public void mainMenu() {
    while (user.getIsLogin()) {
      System.out.println("""
                          
              ----- Todo Menu -----\s
                          
              Select menu option below:
              1. Show my todo list
              2. Create new todo
              3. Edit todo
              4. Delete todo
              5. Profile
              6. Logout
              """);
      System.out.print("Choose option: ");
      String input = scanner.next();

      switch (input) {
        case "1" -> todoList.getListOfTodos();
        case "2" -> todoList.setListOfTodos();
        case "3" -> todoList.editTodo();
        case "4" -> todoList.deleteTodo();
        case "5" -> user.getUser();
        case "6" -> user.logout();
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
        mainMenu();
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
      if (user.login(username, password)) {
        mainMenu();
      }
    } catch (Exception e) {
      System.out.println("Ups something error: " + e);
    }
  }



}
