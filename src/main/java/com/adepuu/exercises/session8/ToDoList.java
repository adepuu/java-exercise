package com.adepuu.exercises.session8;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private final List<String> tasks;

    public ToDoList() {
        this.tasks = new ArrayList<>();
    }

    public List<String> getTask() {
        return tasks;
    }

    public void addTask(String task) {
        this.tasks.add(task);
    }

    public void removeTask(int task) {
        for (int i = 0; i < tasks.size(); i++) {
            if (i == task) {
                tasks.remove(i - 1);
            }
        }
    }
}
