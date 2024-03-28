package com.adepuu.exercises.session8;
import java.util.*;

public class TodoList {
    public static ArrayList<String> tasks;
    private Scanner scanner;

    public TodoList() {
        tasks = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }

    public void addTask() {
        System.out.print("Enter task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added successfully!");
        displayMenu();
    }

    public void deleteTask() {

    }

    public void viewTasks() {
        if (tasks.size() == 0) {
            System.out.println("No tasks added yet.");
            System.out.println("press 'q' to back main menu : ");
            if(scanner.nextLine().equals("q")) {
                displayMenu();
            }
        } else {
            System.out.println("Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }

            System.out.println("press 'q' to back main menu : ");
            if(scanner.nextLine().equals("q")) {
                displayMenu();
            }
        }
    }
}
