package com.adepuu.exercises.session8.model;

import java.util.ArrayList;
import java.util.UUID;

public class User {
    private static ArrayList<User> userList = new ArrayList<User>();
    private UUID userId;
    private String userName;
    private String password;

    public User(String userName, String password){
        this.userId = UUID.randomUUID();
        this.userName = userName;
        this.password = password;
    }

    public String getUserName(){
        return this.userName;
    }

    public String getPassword(){
        return this.password;
    }

    public static ArrayList<User> getUsers(){
        return userList;
    }

    public static User getUser(String username){
        for (User user : userList) {
            if(user.getUserName().equals(username)){
                return user;
            }
        }
        return null;
    }

    public static void createUser(User newUser){
        userList.add(newUser);
    }
}
