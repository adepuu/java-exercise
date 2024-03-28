package com.adepuu.exercises.session8;

import java.util.Scanner;

public class App {

    public static void initMenu(UserDatabase userDatabase, Scanner sc) {
        while (true) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Login");
            System.out.println("2. Sign-Up");
            System.out.println("3. Exit");

            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    loginMenu(userDatabase, sc);
                    break;
                case "2":
                    signUpMenu(userDatabase, sc);
                    break;
                case "3":
                    System.out.println("Bye, then! Have a great day!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please only input the number provided.");
            }
        }

    }
    public static void loginMenu(UserDatabase userDatabase, Scanner sc) {
        System.out.println("Login");
        System.out.println("Enter username:");
        String username = sc.nextLine();
        System.out.println("Enter password:");
        String password = sc.nextLine();

        if (userDatabase.isAuthenticate(username, password)) {
            System.out.println("Login successful. Welcome, " + username + "!");
            mainMenu(userDatabase, sc);
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    public static void signUpMenu(UserDatabase userDatabase, Scanner sc) {
        System.out.println("Sign up, create a new user.");
        System.out.println("Enter username:");
        String username = sc.nextLine();
        if (userDatabase.isUserExist(username)) {
            System.out.println("The username has been used. Please choose a different username.");
            return;
        }
        System.out.println("Enter password:");
        String password = sc.nextLine();
        userDatabase.addNewUser(username, password);
        System.out.println("Sign up successful.");

        initMenu(userDatabase, sc);
    }

    public static void mainMenu(UserDatabase userDatabase, Scanner sc) {
        while (true) {
            System.out.println("\nTo-Do List Menu:");
            System.out.println("1. View my to-do list");
            System.out.println("2. Add a new task");
            System.out.println("3. Complete a task");
            System.out.println("4. Logout");

            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    userDatabase.getCurrentUser().getToDoLists().viewTasks();
                    break;
                case "2":
                    System.out.println("Add your task below: ");
                    String taskInput = sc.nextLine();
                    userDatabase.getCurrentUser().getToDoLists().addTask(taskInput);
                    break;
                case "3":
                    System.out.println("Which task number do you want to remove?");
                    try {
                        int taskRemove = sc.nextInt();
                        sc.nextLine();
                        userDatabase.getCurrentUser().getToDoLists().removeTask(taskRemove);
                    } catch (NumberFormatException e) {
                        System.out.println("You didn't input an integer");
                        sc.nextLine();
                    }
                    break;
                case "4":
                    System.out.println("Logging out");
                    userDatabase.logout();
                    return;
                default:
                    System.out.println("Invalid choice, please only input the number provided.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserDatabase userDatabase = new UserDatabase();

        System.out.println("Welcome to the Check Your List App!");
        initMenu(userDatabase, sc);
    }
}
