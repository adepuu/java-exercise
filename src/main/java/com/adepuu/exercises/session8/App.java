package com.adepuu.exercises.session8;

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
     * </ul>
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME TO THE TO DO");
        System.out.println("-----------------------------------------");

        boolean exit = false;
        while (!exit){
            System.out.println("------Choose an option------");
            System.out.println("1. Sign In");
            System.out.println("2. Sign Up");
            System.out.println("3. Exit");
            System.out.print("Enter option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    //call login function
                    LoginManager.login(scanner);
                    taskManagementMenu(scanner);
                    break;
                case 2:
                    RegisterManager.register(scanner);
                    //call register function
                    break;
                case 3:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please enter number 1, 2, or 3");

            }

        }
        scanner.close();
        // Create menu functionalities
        // Split classes
        // Make methods
        // Connect all the functionalities with the related menu ;)
        // GL HF! ;)
    }

    public static void taskManagementMenu (Scanner scanner) {
        boolean exit = false;
        while (!exit) {
            System.out.println("--------------------------------------");
            System.out.println("Hello... Welcome to Task Management");
            System.out.println("-----------------Menu-----------------");
            System.out.println("1. Add Task");
            System.out.println("2. View Task");
            System.out.println("3. Delete Task");
            System.out.println("4. Log Out");
            System.out.print("What do you want to do..Enter menu number: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    TaskManager.addTask(scanner);
                    break;
                case 2:
                    TaskManager.viewTask();
                    break;
                case 3:
                    TaskManager.deleteTask(scanner);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Logging out....");
                default:
                    System.out.println("Invalid choice, please enter the menu number only");

            }
        }

    }
}
