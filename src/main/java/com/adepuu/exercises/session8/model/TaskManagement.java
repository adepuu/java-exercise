package com.adepuu.exercises.session8.model;

import java.util.ArrayList;

public class TaskManagement {
    private String taskId;
    private User userId;
    private String taskName;
    private boolean isCompleted;
    private static ArrayList<TaskManagement> taskList = new ArrayList<TaskManagement>();
    private static ArrayList<TaskManagement> taskListDone = new ArrayList<TaskManagement>();

    public TaskManagement(String taskName, User user){
        this.taskName = taskName;
        this.isCompleted = false;
        this.taskId = "";
        this.userId = user;
    }

    public String getTaskName(){
        return this.taskName;
    }

    public static void isDone(TaskManagement task){
        taskList.remove(task);
        taskListDone.add(task);
    }

    public static void removeTask(TaskManagement task){
        taskList.remove(task);
    }

    public static ArrayList<TaskManagement> getAllTask(User user){
        ArrayList<TaskManagement> userTask = new ArrayList<TaskManagement>();
        for (TaskManagement task : taskList) {
            if(task.userId == user){
                userTask.add(task);
            }
        }
        return userTask;
    }

    public static void createTask(TaskManagement newTask){
        taskList.add(newTask);
    }

    public static ArrayList<TaskManagement> getFinishedTask(User user){
        ArrayList<TaskManagement> userTask = new ArrayList<TaskManagement>();
        for (TaskManagement task : taskListDone) {
            if(task.userId == user){
                userTask.add(task);
            }
        }
        return userTask;
    }
}
