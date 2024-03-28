package com.adepuu.exercises.session8;

import java.util.Scanner;

public class LoginManager {

    public static void login(Scanner scanner) {
        System.out.println("-----------------Sign In-----------------");

        System.out.print("Enter username: ");
        String username = scanner.next();

        System.out.print("Enter password: ");
        String password = scanner.next();

        boolean authentication = UserDatabase.authenticateUser(username, password);
        if (authentication) {
            System.out.println("Login successful!");
            App.taskManagementMenu(scanner);
            // Add code to navigate to task management menu
        } else {
            System.out.println("Invalid username or password. Please try again.");
            System.out.println("1. Re-enter username & Password");
            System.out.println("2. Register new account");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    login(scanner);
                    break;
                case 2:
                    RegisterManager.register(scanner);
                    break;
                default:
                    System.out.println("Invalid Choice Input");
            }

        }
    }
}
