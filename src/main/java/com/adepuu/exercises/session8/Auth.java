package com.adepuu.exercises.session8;
import java.util.Scanner;

class ToDoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User currentUser = null;
        Task taskManager = new Task();

        while (true) {
            System.out.println("1. Register\n2. Login\n3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.print("Enter username: ");
                String username = scanner.nextLine();
                System.out.print("Enter password: ");
                String password = scanner.nextLine();
                currentUser = new User(username, password);
                System.out.println("Account created successfully.");
            } else if (choice == 2) {
                if (currentUser == null) {
                    System.out.println("No user registered.");
                    continue;
                }
                System.out.print("Enter username: ");
                String username = scanner.nextLine();
                System.out.print("Enter password: ");
                String password = scanner.nextLine();
                if (currentUser.authenticate(username, password)) {
                    System.out.println("Login successful.");
                    while (true) {
                        System.out.println("1. Add Task\n2. View Tasks\n3. Delete Task\n4. Logout");
                        System.out.print("Enter your choice: ");
                        int innerChoice = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        if (innerChoice == 1) {
                            System.out.print("Enter task description: ");
                            String task = scanner.nextLine();
                            taskManager.addTask(task);
                            System.out.println("Task added successfully.");
                        } else if (innerChoice == 2) {
                            taskManager.displayTasks();
                        } else if (innerChoice == 3) {
                            System.out.print("Enter task index to delete: ");
                            int index = scanner.nextInt();
                            scanner.nextLine(); // Consume newline
                            taskManager.deleteTask(index - 1);
                        } else if (innerChoice == 4) {
                            System.out.println("Logged out.");
                            break;
                        } else {
                            System.out.println("Invalid choice.");
                        }
                    }
                } else {
                    System.out.println("Invalid username or password.");
                }
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }
}