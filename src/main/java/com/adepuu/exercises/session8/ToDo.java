package com.adepuu.exercises.session8;

public class ToDo {
    private String description;
    private boolean isDone;
    public ToDo(String description) {
        this.description = description;
    }
    public String getDescription() {
        return this.description;
    }
    public boolean getIsdone() {
        return isDone;
    }
    public void setDone() {
        this.isDone = true;
    }
}
