package com.adepuu.exercises.session8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Todo {
    private static HashMap<String, ArrayList<String>> taskUsers = new HashMap<>();

    public void displayTask(String username){
        if (taskUsers.containsKey(username)){
            ArrayList<String> task = taskUsers.get(username);

            System.out.println("Task for user: " + username);
            for (int i = 0; i < task.size(); i++){
                System.out.println(i + 1 + ". " + task.get(i));
            }
            System.out.println("\n");
        } else {
            System.out.println("No task found for user " + username);
        }
    }

    public void addTask(String task, String username){
        if (!taskUsers.containsKey(username)){
            taskUsers.put(username, new ArrayList<>());
        }
        taskUsers.get(username).add(task);
        System.out.println("Task added for " + username + "\n");
    }

    public void removeTask(int idx, String username){
        taskUsers.get(username).remove(idx - 1);
        System.out.println("The task successfully deleted");
    }

    public void todoPrompt(Scanner scanner, Auth auth, Todo todoUser){
        boolean isRunning = true;
        while(isRunning && auth.isLoggedIn()){
            todoUser.displayTask(auth.getCurrentUser());
            System.out.println("1. Add task");
            System.out.println("2. Remove task");
            System.out.println("3. Logout");
            System.out.print("Select feature you want: ");
            scanner.nextLine();
            String feature = scanner.next();


            switch (feature) {
                case "1":
                    System.out.print("\n");
                    String newTask = auth.inputScanner(scanner, "Task: ");
                    todoUser.addTask(newTask, auth.getCurrentUser());
//                    todoUser.displayTask(auth.getCurrentUser());
//                    isRunning = false;
                    break;
                case "2":
                    todoUser.displayTask(auth.getCurrentUser());
                    System.out.print("Choose the task you want to remove: ");
                    int removeIdx = scanner.nextInt();
                    todoUser.removeTask(removeIdx, auth.getCurrentUser());
//                    todoUser.displayTask(auth.getCurrentUser());
//                    isRunning = false;
                    break;
                case "3":
                    auth.logout();
//                    isRunning = false;
                    break;
                case "q":
                    isRunning = false;
                    break;
            }
        }
    }



}
