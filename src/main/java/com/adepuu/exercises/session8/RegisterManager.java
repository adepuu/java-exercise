package com.adepuu.exercises.session8;

import java.util.Scanner;

public class RegisterManager {
    public static void register(Scanner scanner){
        System.out.println("-----------------Sign Up-----------------");

        System.out.print("Enter Username: ");
        String username = scanner.next();

        System.out.print("Enter Password: ");
        String password = scanner.next();

        boolean success = UserDatabase.addUser(username, password);
        if (success) {
            System.out.println("Registration Successfully");
            LoginManager.login(scanner);
        } else {
            System.out.println("Username already exist, please enter different username");
        }
    }
}
