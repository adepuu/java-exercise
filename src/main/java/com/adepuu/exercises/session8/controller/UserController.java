package com.adepuu.exercises.session8.controller;
import com.adepuu.exercises.session8.model.User;
import com.adepuu.exercises.session8.App;
import java.util.Scanner;

public class UserController {
    public static void userSignUp(Scanner myScanner){
        System.out.println(" ");
        System.out.println("User Sign Up");
        System.out.print("Input your name or type 'quit' to go back : ");
        String userName = myScanner.nextLine();
        if(userName.equals("quit"))
            App.startMenu(myScanner);

        User loginUser = User.getUser(userName);
        if(loginUser != null){
            System.out.println(userName + " already registered! Try login or choose another name");
            userSignUp(myScanner);
        }
        
        String password = "";
        do {
            System.out.print("Input your password or type 'quit' to go back : ");
            password = myScanner.nextLine();
            if(password.equals("quit")){
                App.startMenu(myScanner);
            }
            else if(password.length()<5){
                System.out.println("Sorry, you need atleast 6 character for password");
            }
        } while (password.length()<5);
        
        System.out.println("User " + userName + " created! Welcome!");
        System.out.println(" ");
        User newUser = new User(userName, password);
        User.createUser(newUser);
        App.startMenu(myScanner);
    }

    public static void userSignIn(Scanner myScanner){
        System.out.println(" ");
        System.out.println("User Sign In");
        System.out.print("Input your name or type 'quit' to go back : ");
        String userName = myScanner.nextLine();
        if(userName.equals("quit"))
            App.startMenu(myScanner);

        User loginUser = User.getUser(userName);
        if(loginUser == null){
            System.out.println("Sorry, user with name " + userName + " is not found! Try another User");
            userSignIn(myScanner);
        }
        String password = "";
        do {
            System.out.print("Input your password or type 'quit' to go back : ");
            password = myScanner.nextLine();
            if(loginUser.getPassword().equals(password)){
                App.mainMenu(myScanner, loginUser);
            }else if(password.equals("quit")){
                App.startMenu(myScanner);
            }else{
                System.out.println("Sorry, your password is incorrect!");
            }    
        } while (!loginUser.getPassword().equals(password));
    }
}
