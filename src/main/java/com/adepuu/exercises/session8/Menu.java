package com.adepuu.exercises.session8;

import java.util.List;
import java.util.Scanner;

public class Menu {
    public  void mainMenu(){
        System.out.println("Welcome ToDo-List App");
        System.out.println(" ");
        System.out.println("=================================");
        System.out.println("Choose number below : ");
        System.out.println("1. Create Task");
        System.out.println("2. List Task");
        System.out.println("3. Delete Task");
    }

    public static String isContinue(){
        try (Scanner input = new Scanner(System.in)) {
            System.out.println(" ");
            System.out.println("=================================");
            System.out.println("Press y to main menu");
            System.out.println("Press any to exit");
            System.out.print("Your input : ");
            return input.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public static String[] loginMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome ToDo-List App");
        System.out.println("Login Menu");
        System.out.print("Username : ");
        String username = scanner.next();

        System.out.print("Password : ");
        String password = scanner.next();

        String[] result = new String[2];
        result[0] = username;
        result[1] = password;
        return result;
    }

    public  String createTaskMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Create Task");
        System.out.print("Task : ");
        return scanner.next();
    }
}
