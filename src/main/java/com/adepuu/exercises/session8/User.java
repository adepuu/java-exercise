package com.adepuu.exercises.session8;

public class User {
    private String username;
    private String password;
    private ToDoLists toDoLists;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.toDoLists = new ToDoLists();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public ToDoLists getToDoLists() {
        return toDoLists;
    }
}