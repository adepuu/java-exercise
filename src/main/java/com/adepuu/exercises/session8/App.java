package com.adepuu.exercises.session8;

import java.util.List;
import java.util.Scanner;

public class App {
    /**
     * Manages user registration, login, and task management for the To-Do List application.
     * <p>
     * This function enables users to register, log in, and manage their tasks through the console.
     * It provides a clear and concise menu with options to add a task, view tasks, delete a task, or log out.
     * The system handles user input errors gracefully, providing clear feedback and prompting for correct input.
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

    private static final Auth auth = new Auth();
    private static User currentUser = null;
    private static ToDoList userList = null;
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        do {
            displayMenu();
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\n===Register Page===");
                    System.out.print("Enter your username: ");
                    String newUsername = input.nextLine();
                    System.out.print("Enter your email: ");
                    String newEmail = input.nextLine();
                    System.out.print("Enter your password: ");
                    String newPassword = input.nextLine();
                    register(newUsername, newEmail, newPassword);
                    break;
                case 2:
                    try {
                        System.out.println("\n===Login Page===");
                        System.out.print("Enter your username: ");
                        String username = input.nextLine();
                        System.out.print("Enter your password: ");
                        String password = input.nextLine();
                        login(username, password);
                    } catch (Exception e) {
                        System.out.println("\nLogin failed. Please try again");
                    }
                    break;
                case 3:
                    if (currentUser == null) {
                        System.out.println("\nPlease log in to your account");
                    } else {
                        System.out.println("\n===Add to-do list===");
                        System.out.println("Please enter your new list: ");
                        String newList = input.nextLine();
                        addToDoList(newList);
                    }
                    break;
                case 4:
                    if (currentUser == null) {
                        System.out.println("\nPlease log in to your account");
                    } else {
                        viewToDoList();
                    }
                    break;
                case 5:
                    if (currentUser == null) {
                        System.out.println("\nPlease log in to your account");
                    } else if (userList.getTask().isEmpty()) {
                        System.out.println("Your list is empty");
                    } else {
                        System.out.println("\nRemove to-do list");
                        viewToDoList();
                        System.out.println("Select task you want to delete: ");
                        int removeList = input.nextInt();
                        removeToDoList(removeList);
                    }
                    break;
                case 6:
                    if (currentUser == null) {
                        System.out.println("\nPlease log in to your account");
                    } else {
                        getUserProfile();
                    }
                    break;
                case 7:
                    logout();
                    System.out.println("\nLog out success");
                    break;
                case 8:
                    System.out.println("\nExiting application...");
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nInvalid choice, please try again");
            }
        } while (true);

    }

    //Auth function
    public static void register(String username, String email, String password) {
        try {
            if (currentUser != null) {
                throw new Exception("\nYou have logged in to the app.");
            }
            auth.register(username, email, password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void login(String username, String password) {
        try {
            if (auth.login(username, password) == null) {
                throw new Exception("\nPlease enter your username or password");
            }
            if (currentUser != null) {
                throw new Exception("\nYou have logged in to the app");
            }
            currentUser = auth.login(username, password);
            userList = currentUser.getUserTasks();

            System.out.println("\nLogin success");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void logout() {
        currentUser = null;
        userList = null;
    }

    public static void getUserProfile() {
        currentUser.getUserProfile();
    }

    // To-Do List function
    public static void viewToDoList() {
        List<String> userList = currentUser.getUserTasks().getTask();
        try {
            if (userList.isEmpty()) {
                throw new Exception("Your list is empty");
            }
            System.out.println("\nYour to-do list");
            for (int i = 0; i < userList.size(); i++) {
                System.out.println((i + 1) + ". " + userList.get(i));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addToDoList(String task) {
        try {
            if (task.isEmpty()) {
                throw new Exception("Please write something to add to-do list");
            }
            userList.addTask(task);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void removeToDoList(int task) {
        List<String> currentList = currentUser.getUserTasks().getTask();

        try {
            if (currentList.isEmpty()) {
                throw new Exception("Your list is empty");
            }
            userList.removeTask(task);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public static void displayMenu() {
        System.out.println("\n===== To-Do List Application =====");
        System.out.println("1. Register");
        System.out.println("2. Log In");
        System.out.println("3. Add Task");
        System.out.println("4. View Tasks");
        System.out.println("5. Delete Task");
        System.out.println("6. User profile");
        System.out.println("7. Log Out");
        System.out.println("8. Exit");
        System.out.print("Enter your choice: ");
    }

}
