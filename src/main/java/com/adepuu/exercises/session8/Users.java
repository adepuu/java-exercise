package com.adepuu.exercises.session8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class Users {
    private String id;
    private String username;
    private String password;
    private ArrayList<String> listUsername = new ArrayList<>();

    public Users(String username){
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
        this.username = username;
        listUsername.add(username);
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    //    public void isAccountAvailable()

}
