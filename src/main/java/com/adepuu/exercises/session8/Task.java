package com.adepuu.exercises.session8;

import java.util.ArrayList;
import java.util.UUID;

public class Task {
    String task;
    UUID taskId = UUID.randomUUID();
    User taskUser;
    static ArrayList<Task> taskName = new ArrayList<Task>();

    public Task(String task, User taskUser){
        this.task = task;
        this.taskUser = taskUser;
    }

    public static void listTask(Task listedTask){
        taskName.add(listedTask);

    }

}

