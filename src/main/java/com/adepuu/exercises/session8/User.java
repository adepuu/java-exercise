package com.adepuu.exercises.session8;

import java.util.UUID;

public class User {

    private final String ID;
    private final String username;
    private String password ="";
    private final String todoID;

     User(String username, String password) {
        UUID uuid = UUID.randomUUID();
        this.ID = uuid.toString();
        this.username = username;
        this.password = password;
        this.todoID = uuid.toString();
    }
    User(String userID, String username, String todoID) {

        this.ID = userID;
        this.username = username;
        this.todoID = todoID;
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
