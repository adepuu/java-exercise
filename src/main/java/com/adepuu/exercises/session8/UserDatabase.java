package com.adepuu.exercises.session8;

import java.util.HashMap;
import java.util.Map;

public class UserDatabase {
    private Map<String, User> userData;
    private User currentUser;

    public UserDatabase() {
        userData = new HashMap<>();
        this.currentUser = null;
    }

    public void addNewUser(String username, String password) {
        userData.put(username, new User(username, password));
    }

    public User getUser(String username) {
        return userData.get(username);
    }

    public boolean isUserExist(String username) {
        return userData.containsKey(username);
    }

    public boolean isAuthenticate(String username, String password) {
        User user = userData.get(username);
        if (user != null && user.getPassword().equals(password)) {
            currentUser = user;
            return true;
        }
        return false;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void logout() {
        currentUser = null;
    }
}
