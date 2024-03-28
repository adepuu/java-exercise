package com.adepuu.exercises.session8;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Auth {
    private HashMap<String, String> credentials = new HashMap<>();
    private boolean isLoginFlag = false;
    private String currentUser = null;

    public void login(String username, String password){
        if (credentials.containsKey(username)){
            String storedPassword = credentials.get(username);

            if (Objects.equals(storedPassword, password)){
                isLoginFlag = true;
                currentUser = username;
                System.out.println("Login Successfull");
            } else {
                System.out.println("Incorrect Password");
            }
        } else {
            System.out.println("User is not existing!!!");
        }
    }

    public void registerAccount(String username, String pass){
        credentials.put(username, pass);
        isLoginFlag = true;
        currentUser = username;
        System.out.println("\n" + "Your new account has been created and you are now logged in.");
    }

    public boolean checkAccExist(String username) {
        return credentials.containsKey(username);
    }

    public void logout(){
        isLoginFlag = false;
        currentUser = null;
        System.out.println("Logout Successfully" + "\n");
    }

    public boolean isLoggedIn(){
        return isLoginFlag;
    }

    public String getCurrentUser(){
       return currentUser;
    }

    public String inputScanner (Scanner scanner, String msg){
        System.out.print("Input your " + msg);
        return scanner.next();
    }

    public <auth> void authPrompt(Scanner scanner, Auth auth){
        boolean isRunning = true;
        while (isRunning) {

            System.out.println("Todo List Application" + '\n');

            System.out.println("1. Login");
            System.out.println("2. Create Account");
            System.out.print("Select your features: ");

            String featurePick = scanner.next();

            switch (featurePick) {
                case "1": {

                    String username = auth.inputScanner(scanner, "Username: ");

                    if (auth.checkAccExist(username)) {
                        String pass = auth.inputScanner(scanner, "Password: ");

                        auth.login(username, pass);
                    } else {
                        System.out.println("\n");
                        System.out.println("You need to register an account");
                        String usernameRegister = auth.inputScanner(scanner, "Username: ");
                        String pass = auth.inputScanner(scanner, "Password: ");

                        auth.registerAccount(usernameRegister, pass);
                    }
                    isRunning = false;
                    break;
                }
                case "2": {
                    String username = auth.inputScanner(scanner, "Username: ");
                    String pass = auth.inputScanner(scanner, "Password: ");

                    auth.registerAccount(username, pass);
                    isRunning = false;
                    break;
                }
                case "q": {
                    System.out.println("Application stop!!!");
                    isRunning = false;
                    break;
                }
            }
        }
    }

}
