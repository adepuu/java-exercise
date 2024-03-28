package com.adepuu.exercises.session8;

public class Task {
    private String taskName;
    private String userID;
    private String taskID;

    public Task(String userID, String taskName,String ticketID) {
        this.userID = userID;
        this.taskName = taskName;
        this.taskID = ticketID;
    }

    public String getTaskID() {
        return taskID;
    }

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
}
