package com.adepuu.exercises.session8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManager {
    private static final List<String> tasks = new ArrayList<>();

    public static void addTask(Scanner scanner) {
        System.out.println("Enter task");
        String task = scanner.next();
        tasks.add(task);
        System.out.println("Task added successfully.");

    }

    public static void viewTask() {
        if(tasks.isEmpty()) {
            System.out.println("No task available.");
        } else {
            System.out.println("Task: ");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public static void deleteTask(Scanner scanner) {
        viewTask();
        System.out.println("Enter the task number to delete: ");
        int taskNumber = scanner.nextInt();
        if (taskNumber >= 1 && taskNumber <= tasks.size()) {
            tasks.remove(taskNumber - 1);
            System.out.println("Task delete successfully");
        } else {
            System.out.println("Invalid task number.");
        }
    }

}
