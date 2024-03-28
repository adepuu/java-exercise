package com.adepuu.exercises.session7;

public class User {
    private String userID;
    private String userName;
    private static int numUser = 0;

    public User(String userName) {
        numUser ++;
        this.userName = userName;
        this.userID = "user_id-" + numUser;
    }

    public String getUserName() {
        return this.userName;
    }
}
