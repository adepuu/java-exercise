package com.adepuu.exercises.session8;

import java.util.ArrayList;
import java.util.HashMap;
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

    public boolean createNewUser(String username,String password){
        for(User list:userList){
            if(list.getUsername().equals(username)) {
                System.err.println("Username has already been taken, please input another username");
                System.out.println();
                System.out.println();
                return false;
            }
        }
        User newUser = new User(username,password);
        userList.add(newUser);
        System.out.println();
        System.out.println("Data has been registered!");
        System.out.println();
        return true;
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

    public boolean changePassword(String oldPassword, String newPassword){
        for (User user:userList){
            if(user.getUsername().equals(userDetail()) && user.getPassword().equals(oldPassword)){
                user.setPassword(newPassword);
                System.out.println();
                System.out.println("Your password successfully changed!!");
                System.out.println();
                return true;
            }
        }

        System.err.println("Your input password is wrong!!");
        System.out.println();
        return false;
    }
    public void logout(){
        this.activeUser = "";
    }
    public String userDetail(){
        return activeUser;
    }
}
