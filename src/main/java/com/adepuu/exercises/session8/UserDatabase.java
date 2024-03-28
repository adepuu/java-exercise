package com.adepuu.exercises.session8;

import java.util.HashMap;
import java.util.Map;

public class UserDatabase {
    private static final Map<String, String> userCredential = new HashMap<>();

    public static boolean addUser(String username, String password) {
        if (userCredential.containsKey(username)) {
            return false;
        }
        userCredential.put(username, password);
        return true;
    }

    public static boolean authenticateUser(String username, String password) {
        return userCredential.containsKey(username) && userCredential.get(username).equals(password);
    }

}
