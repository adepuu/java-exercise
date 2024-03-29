package com.adepuu.exercises.session8;

import java.util.HashMap;
import java.util.Scanner;

public class App {

  /**
   * Manages user registration, login, and task management for the To-Do List application.
   * <p>
   * This function enables users to register, log in, and manage their tasks through the console. It provides a clear
   * and concise menu with options to add a task, view tasks, delete a task, or log out. The system handles user input
   * errors gracefully, providing clear feedback and prompting for correct input.
   * </p>
   * <br/>
   * <h3>User Registration and Login:</h3>
   * <ul>
   *     <li>Given a new user, when they input their desired login and password through the console, then the system should create a new account and confirm successful account creation.</li>
   *     <li>Given an existing user, when they input their login and password through the console, then the system should authenticate the user and grant access to the to-do list.</li>
   * </ul>
   *
   * <h3>Task Management:</h3>
   * <ul>
   *     <li>Given a logged-in user, when they input a new task through the console, then the system should add the task to their to-do list and confirm the task has been added.</li>
   *     <li>Given a logged-in user, when they view their to-do list through the console, then the system should display all tasks currently in their list.</li>
   *     <li>Given a logged-in user, when they input a task to delete through the console, then the system should remove the task from their to-do list and confirm the task has been deleted.</li>
   * </ul>
   *
   * <h3>Other:</h3>
   * <ul>
   *     <li>When a user accesses the application, the interface should display a clear and concise menu with options to add a task, view tasks, delete a task, or log out, all accessible through the console.</li>
   *     <li>The system should handle user input errors gracefully, providing clear feedback and prompting for correct input through the console.</li>
   * </ul>
   *
   * <h3>Notes:</h3>
   * <ul>
   *     <li>No need to encrypt user password</li>
   *     <li>Start the program menu inside main function below</li>
   *     <li>Split each functionalities into its own classes</li>
   *     <li>Please Use UUID if there's ID needed <a href="https://www.baeldung.com/java-uuid">Java UUID Reference</a></li>
   *     <li>Data does not need to be stored in a File. Instead, store it inside a Map or List and let the data gone when program finished</li>
   * </ul>
   */

  private static User user;
  private static HashMap<String, String> userPair;
  private static final Authentication auth = new Authentication();
  private static ToDo toDos;
  private static Task tasks;
  private static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
        /*
         Create menu functionalities
         Split classes
         Make methods
         Connect all the functionalities with the related menu ;)
         GL HF! ;)
        */
    // initiate login sequence
    loginMenu();
    System.out.println(auth.getCurrentUser().getPassword());
    // ? note: [currentUser] doesn't seem to store dta after log in :(

    // if user is logged, show tasks menu
    if (auth.getCurrentUser() != null) {
      tasksMenu();
    }

    scan.close();
  }

  public static void loginMenu() {
    Scanner scan = new Scanner(System.in);
    while (auth.getCurrentUser() == null) {
      System.out.println("Welcome to iToDo!");
      System.out.println("Please log in or register as a user.");
      System.out.println("1. Log In");
      System.out.println("2. Register");
      System.out.println("3. Exit");

      System.out.print("Enter input: ");
      int choice = scan.nextInt();
      scan.nextLine();

      switch (choice) {
        case 1:
          auth.login();
          break;
        case 2:
          auth.registerUser();
          break;
        case 3:
          auth.logout();
          return;
        default:
          System.out.println("Invalid choice :(");
      }
    }
    System.out.println();
  }

  public static void tasksMenu() {
    // loops through this menu till user logs out
    while (true) {
      // assign to user's todo
      ToDo currentTodo = auth.getCurrentUser().getToDos("def");
      // Show existing tasks
      currentTodo.viewTasks();

      System.out.println("What would you like to do today?");
      System.out.println("1. Add Tasks");
      System.out.println("2. Mark Tasks");
      System.out.println("3. Delete Tasks");
      System.out.println("4. Log Out and Exit");

      System.out.print("Enter input: ");
      int choice = scan.nextInt();
      scan.nextLine();

      switch (choice) {
        case 1:
          System.out.println("Input task:");
          String description = scan.nextLine();
          currentTodo.addTask(description);
          break;
        case 2:
          System.out.print("Which task item do you want to mark? ");
          int indexTask = scan.nextInt() - 1; // because list starts at index 0
          System.out.println("What would you like to mark it as?");
          System.out.println("1. Mark as complete");
          System.out.println("2. Mark as pending");
          int choiceTask = scan.nextInt();
          editTasks(indexTask, choiceTask);
          break;
        case 3:
          System.out.print("Which task item to delete? ");
          int indexDel = scan.nextInt() - 1; // bc 0
          scan.nextLine();
          currentTodo.deleteTask(indexDel);
          break;
        case 4:
          auth.logout();
          return;
        default:
          System.out.println("Invalid choice >:(");
      }
    }
  }

  public static void editTasks(int indexTask, int choiceTask) {
    Task taskItem = auth.getCurrentUser().getToDos("def").markTasks(indexTask);
    switch (choiceTask) {
      case 1:
        if (!taskItem.isCompleted()) {
          taskItem.markAsCompleted();
          System.out.println("Congratulations! You have completed task item number " + indexTask);
        } else {
          System.out.println("You have already completed that task!");
        }
        break;
      case 2:
        if (taskItem.isCompleted()) {
          taskItem.markAsPending();
          System.out.println("You have marked task item number " + indexTask + " as pending");
        } else {
          System.out.println("It hasn't been marked completed!");
        }
        break;
      default:
        System.out.println("Invalid choice :(");
    }
  }
}
