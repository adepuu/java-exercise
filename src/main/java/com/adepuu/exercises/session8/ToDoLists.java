package com.adepuu.exercises.session8;

import java.util.HashMap;

public class ToDoLists {
    private HashMap<Integer, String> tasks;
    private int taskNum;

    public ToDoLists() {
        tasks = new HashMap<>();
        taskNum = 1;
    }

    public void addTask(String task) {
        tasks.put(taskNum++, task);
    }

    public void removeTask(Integer taskID) {
        if (!tasks.containsKey(taskID)) {
            System.out.println("Task with ID " + taskID + " is not found.");
        } else {
            System.out.println("Task \"" + tasks.get(taskID) + "\" completed. Removed.");
            tasks.remove(taskID);
        }
    }
    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("You have either completed all of your tasks, or you haven't made one yet.");
        } else {
            System.out.println("Your tasks:");
            for (HashMap.Entry<Integer, String> n : tasks.entrySet() ) {
                System.out.println(n.getKey() + ". " + n.getValue());
            }
        }
    }
}
