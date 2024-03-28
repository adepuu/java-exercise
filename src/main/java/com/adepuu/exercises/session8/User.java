package com.adepuu.exercises.session8;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    private final String userId;
    private final String username;
    private final String email;
    private final String password;
    private final ToDoList userTasks;

    public User(String username, String email, String password) {

        this.userId = UUID.randomUUID().toString();
        this.username = username;
        this.email = email;
        this.password = password;
        this.userTasks = new ToDoList();
    }

    public String getPassword() {
        return password;
    }

    public ToDoList getUserTasks() {
        return userTasks;
    }

    public void getUserProfile() {
        System.out.println("\n===User Profile===");
        System.out.println("Profile ID: " + userId);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
    }
}
