package com.adepuu.exercises.session10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Auth {
    private String activeUser;
    private List<User> userList = new ArrayList<>();

    public String getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(String activeUser) {
        this.activeUser = activeUser;
    }

    public Auth() {}

    public boolean registerUser(String username, String password){
        for(User list:userList){
            if(list.getUsername().equals(username)){
                System.err.println("Username sudah dimiliki oleh orang lain, silahkan input username lain!!!");
                return false;
            }
        }
        User newUser = new User(username,password);
        userList.add(newUser);
        activeUser = username;
        System.out.println("Account has been registered !!");
        return true;
    }
    public boolean userLogin(String username, String password){
        if(username.isEmpty() || password.isEmpty()){
            System.err.println("Please input the username and password correctly !!");
        }
        for(User list:userList){
            if(list.getUsername().equals(username) && list.getPassword().equals(password)){
                this.activeUser = list.getUsername();
                return true;
            }
        }
        System.err.println("Username / password is wrong!!");
        return false;
    }

    public void logout(){
        this.activeUser = "";
    }
    public String userDetail(){
        return activeUser;
    }
}
