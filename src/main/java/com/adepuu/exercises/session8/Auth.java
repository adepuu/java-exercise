package com.adepuu.exercises.session8;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Auth {
    private String activeUser;
    private List<User> userList;

    public String getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(String activeUser) {
        this.activeUser = activeUser;
    }

    public Auth() {
        userList = new ArrayList<>();
    }

    public void createNewUser(String username,String password){
        User newUser = new User(username,password);
        userList.add(newUser);
        System.out.println();
        System.out.println("Data has been registered!");
        System.out.println();
    }
    public void userLogin(String username, String password){
        for(User list:userList){
            if(list.getUsername().equals(username
            ) && list.getPassword().equals(password)){
                activeUser = list.getUsername();
                break;
            }
        }
    }
    public void logout(){
        this.activeUser = "";
    }
    public String userDetail(){
        return activeUser;
    }



}
