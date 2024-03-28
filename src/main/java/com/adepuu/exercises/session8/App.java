package com.adepuu.exercises.session8;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}
public class App {
    private Map<String, User> accounts;
    private Scanner scanner;

    public App() {
        accounts = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    public void welcome() {
        System.out.println("--- Welcome to ToDo-List App! ---");
    }

    public void register() {
        System.out.println("--- Register ---");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        accounts.put(username, new User(username, password));
        System.out.println("Account created successfully!");
    }

    public void login() {
        System.out.println("--- Log In ---");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        User user = accounts.get(username);
        if (user != null && user.getPassword().equals(password)) {
            System.out.println("Login successful!");
            showFeatures();
        } else {
            System.out.println("Invalid username or password. Please register or try again.");
        }
    }


    public void toDoList() {
        String currentUser = accounts.keySet().toString();
        ToDo userToDo = new ToDo(currentUser);

        // show list of activities retrieved from the ToDo List
        userToDo.getToDoList();

        while (true) {
            System.out.println("--------------------------------------");
            System.out.println("| add (1) | delete (2) | logout (3) |");
            System.out.print("Enter a number: ");
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.print("Add ToDo: ");
                        String addToDo = scanner.nextLine();
                        userToDo.addToDo(addToDo);
                        userToDo.getToDoList();
                        break;
                    case 2:
                        System.out.print("Delete ToDo: ");
                        String deleteToDo = scanner.nextLine();
                        userToDo.deleteToDo(deleteToDo);
                        userToDo.getToDoList();
                        break;
                    case 3:
                        System.out.println("Logged out.");
                        start();
                        break;
                    default:
                        throw new InvalidInputException("Invalid choice.");
                }
            } catch (NumberFormatException | InvalidInputException e) {
                System.out.println("Invalid input. Please try again.");
            }

        }

    }

    public void showFeatures() {
        String currentUser = accounts.keySet().toString();

        System.out.println("--- Hi " + currentUser + "!---");
        System.out.println("Choose an option:");
        System.out.println("1. ToDo List");
        System.out.println("2. Logout");
        while (true) {
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        toDoList();
                        break;
                    case 2:
                        System.out.println("Logged out.");
                        start();
                        break;
                    default:
                        throw new InvalidInputException("Invalid choice.");
                }
            } catch (NumberFormatException | InvalidInputException e) {
                System.out.println("Invalid input. Please try again.");
            }
        }

    }

    public void start() {
        welcome();
        while (true) {
            System.out.println("Menu: ");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.print("Enter a number: ");
            try {
                int option = Integer.parseInt(scanner.nextLine());

                switch (option) {
                    case 1:
                        register();
                        break;
                    case 2:
                        login();
                        break;
                    default:
                        throw new InvalidInputException("Invalid option.");
                }
            } catch (NumberFormatException | InvalidInputException e) {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }
}
