package com.adepuu.exercises.session7;

public class User {
    private String userID;
    private String userName;
    private static int numUser = 0;

    public User (String userName) {
        numUser += 1;
        this.userName = userName;
        this.userID = "USN-"+ numUser;
    }

    public String getUserName() {
        return this.userName;
    }

}
