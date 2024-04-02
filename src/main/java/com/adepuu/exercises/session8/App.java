package src.main.java.com.adepuu.exercises.session8;

import java.util.HashMap;
import java.util.Scanner;

public class App {
    private static HashMap<String, String> userList = new HashMap<>();
    private static User currentUser = null;
    private static ListActivity listActivity = new ListActivity();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the To-Do List App!");

        while (running) {
            System.out.println("Choose an option:");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Your choice: ");
            int choice = input.nextInt();
            input.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    registerUser(input);
                    break;
                case 2:
                    login(input);
                    break;
                case 3:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void registerUser(Scanner input) {
        System.out.println("\n===== Registration =====");
        System.out.print("Enter username: ");
        String username = input.nextLine();
        System.out.print("Enter password: ");
        String password = input.nextLine();

        User newUser = new User(username, password);
        userList.put(username, password);
        System.out.println("Registration successful!\n");
    }

    private static void login(Scanner input) {
        System.out.println("\n===== Login =====");
        System.out.print("Enter username: ");
        String username = input.nextLine();
        System.out.print("Enter password: ");
        String password = input.nextLine();

        if (userList.containsKey(username) && userList.get(username).equals(password)) {
            System.out.println("Login successful!\n");
            currentUser = new User(username, password);
            taskInterface(input);
        } else {
            System.out.println("Invalid username or password. Please try again.\n");
        }
    }

    private static void taskInterface(Scanner input) {
        boolean loggedIn = true;
        while (loggedIn) {
            System.out.println("===== Task Management =====");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Logout");

            System.out.print("Your choice: ");
            int choice = input.nextInt();
            input.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addTask(input);
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    deleteTask(input);
                    break;
                case 4:
                    System.out.println("Logging out...\n");
                    loggedIn = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addTask(Scanner input) {
        System.out.print("Enter task description: ");
        String taskDesc = input.nextLine();
        listActivity.storeTask(taskDesc);
        System.out.println("Task added successfully!\n");
    }

    private static void viewTasks() {
        System.out.println("\n===== Your Tasks =====");
        listActivity.viewTask();
        System.out.println();
    }

    private static void deleteTask(Scanner input) {
        System.out.print("Enter task description to delete: ");
        String taskDesc = input.nextLine();
        listActivity.deleteTask(taskDesc);
    }
}
