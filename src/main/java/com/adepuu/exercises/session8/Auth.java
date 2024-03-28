package com.adepuu.exercises.session8;

import java.util.HashMap;

public class Auth {
    private HashMap<String, User> registeredUsers = new HashMap<>();
    private String activeUserName;

    public boolean registerUser(User newUser) {
        if (registeredUsers.containsKey(newUser.getUsername())) {
            System.out.println("Username already exist, choose other username!");
            return false;
        }
        registeredUsers.put(newUser.getUsername(), newUser);
        activeUserName = newUser.getUsername();
        return true;
    }

    public String getActiveUserID() {
        return activeUserName;
    }

    public boolean logout() {
        if (this.activeUserName.isEmpty()) {
            System.out.println("Session empty");
            return false;
        }

        this.activeUserName = "";
        System.out.println("Logged Out");
        return true;
    }

    public boolean login(String username, String password) {
        if (username.isEmpty() || password.isEmpty()) return false;

        if (!registeredUsers.containsKey(username)) {
            User newUser = new User(username, password);
            if (registerUser(newUser)) {
                System.out.println("New user registered, logged in");
                this.activeUserName = newUser.getUsername();
                return true;
            }
            System.out.println("Something wrong :(");
            return false;
        }
        var currentUser = registeredUsers.get(username);
        if (currentUser.checkCredentials(username, password)) {
            System.out.println("Logged in, welcome " + currentUser.getUsername());
            this.activeUserName = currentUser.getUsername();
            return true;
        }
        System.out.println("Wrong credentials!");
        return false;
    }

    public User getCurrentUserDetails() {
        return registeredUsers.get(activeUserName);
    }
}
