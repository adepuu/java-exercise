package com.adepuu.exercises.session8;
import java.util.*;
//import com.adepuu.exercises.session7.User;

public class Users {
    private boolean isLogin;
    private ArrayList<String> usernames;
    private ArrayList<String> passwords;

    public Users() {
        this.usernames = new ArrayList<>();
        this.passwords = new ArrayList<>();
    }

    public void signUp(String username, String password) {
        // Check if the username already exists
        if (usernames.contains(username)) {
            System.out.println("Username already exists. Please create another one.");
            return;
        }

        // // Add the new user
        usernames.add(username);
        passwords.add(password);
        System.out.println("Sign up successful!");
    }

    public boolean logIn(String username, String password) {
        // Check if the username exists
        int index = usernames.indexOf(username);
        if (index != -1 && passwords.get(index).equals(password)) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid username or password.");
            return false;
        }
    }

    // Method to check if a username exists
    public boolean usernameExists(String username) {
        return usernames.contains(username);
    }
}
