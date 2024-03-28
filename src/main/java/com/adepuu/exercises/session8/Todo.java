package com.adepuu.exercises.session8;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class Todo {

    private final String ID;
    private final List<String> taskId;
    private final String userId;

    public Todo(String todoId, String taskId, String userId) {
        this.ID = todoId;
        this.taskId = Collections.singletonList(taskId);
        this.userId = userId;
    }

    public String getID() {
        return ID;
    }

    public String getUserId() {
        return userId;
    }

    public List<String> getTaskId() {
        return taskId;
    }

    public void setTaskId(String newTaskId) {
        if (!newTaskId.isEmpty()){
            this.taskId.add(newTaskId);
        }
    }
}
