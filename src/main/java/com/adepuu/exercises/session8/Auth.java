package com.adepuu.exercises.session8;

import java.util.HashMap;

public class Auth {
    private final HashMap<String, User> userList;

    public Auth() {
        this.userList = new HashMap<>();
    }

    public void register(String username, String email, String password) {
        try {
            if (userList.containsKey(username)) {
                throw new Exception("\nUsername already exist");
            }
            User newUser = new User(username, email, password);
            userList.put(username, newUser);
            System.out.println("\nAccount created, please log in to create to-do list");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public User login(String username, String password) {
        User currentUser = null;
        try {
            if (!userList.containsKey(username)) {
                throw new Exception("\nIncorrect username or password. Please try again");
            }
            User user = userList.get(username);
            if (!password.equals(user.getPassword())) {
                throw new Exception("\nIncorrect username or password. Please try again");
            }
            currentUser = user;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return currentUser;
    }
}
