package com.adepuu.exercises.session8;

import java.util.ArrayList;
import java.util.UUID;

public class User {

    String user = "";
    String password = "";
    UUID userID = UUID.randomUUID();
    static ArrayList<User> dataUser = new ArrayList<User>();

    public User(String user, String password) {
        this.user = user;
        this.password = password;

    }

    public String getUserName() {
        return this.user;
    }

    public String getPassword() {
        return this.password;
    }

    public static void dataUser(User dataBase) {
        dataUser.add(dataBase);
    }

    public static User dataLogin(String username, String password) {
        for (User dataNewUser : dataUser) {
            if (dataNewUser.getUserName().equals(username) && dataNewUser.getPassword().equals(password)) {
                return dataNewUser;
            } else {
                return null;

            }
        }
        return null;
    }
}




