package com.adepuu.exercises.session8;

import java.util.UUID;

public class User {

    private final String ID;
    private final String username;
    private final String password;
    private final String todoID;

    public User(String username, String password) {
        UUID uuid = UUID.randomUUID();
        this.ID = uuid.toString();
        this.username = username;
        this.password = password;
        this.todoID = uuid.toString();
    }

    public String getID() {
        return ID;
    }
    public String getTodoId() {
        return todoID;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }

}
