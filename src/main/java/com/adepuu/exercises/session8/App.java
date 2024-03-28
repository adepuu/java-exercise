package com.adepuu.exercises.session8;

import java.util.ArrayList;
import java.util.Scanner;

import com.adepuu.exercises.session8.controller.*;
import com.adepuu.exercises.session8.model.TaskManagement;
import com.adepuu.exercises.session8.model.User;

public class App {
    /**
     * Manages user registration, login, and task management for the To-Do List application.
     * <p>
     * This function enables users to register, log in, and manage their tasks through the console.
     * It provides a clear and concise menu with options to add a task, view tasks, delete a task, or log out.
     * The system handles user input errors gracefully, providing clear feedback and prompting for correct input.
     * </p>
     * <br/>
     * <h3>User Registration and Login:</h3>
     * <ul>
     *     <li>Given a new user, when they input their desired login and password through the console, then the system should create a new account and confirm successful account creation.</li>
     *     <li>Given an existing user, when they input their login and password through the console, then the system should authenticate the user and grant access to the to-do list.</li>
     * </ul>
     *
     * <h3>Task Management:</h3>
     * <ul>
     *     <li>Given a logged-in user, when they input a new task through the console, then the system should add the task to their to-do list and confirm the task has been added.</li>
     *     <li>Given a logged-in user, when they view their to-do list through the console, then the system should display all tasks currently in their list.</li>
     *     <li>Given a logged-in user, when they input a task to delete through the console, then the system should remove the task from their to-do list and confirm the task has been deleted.</li>
     * </ul>
     *
     * <h3>Other:</h3>
     * <ul>
     *     <li>When a user accesses the application, the interface should display a clear and concise menu with options to add a task, view tasks, delete a task, or log out, all accessible through the console.</li>
     *     <li>The system should handle user input errors gracefully, providing clear feedback and prompting for correct input through the console.</li>
     * </ul>
     *
     * <h3>Notes:</h3>
     * <ul>
     *     <li>No need to encrypt user password</li>
     *     <li>Start the program menu inside main function below</li>
     *     <li>Split each functionalities into its own classes</li>
     *     <li>Please Use UUID if there's ID needed <a href="https://www.baeldung.com/java-uuid">Java UUID Reference</a></li>
     *     <li>Data does not need to be stored in a File. Instead, store it inside a Map or List and let the data gone when program finished</li>
     * </ul>
     */
    public static void main(String[] args) {
        /*
         Create menu functionalities
         Split classes
         Make methods
         Connect all the functionalities with the related menu ;)
         GL HF! ;)
        */
        Scanner myScanner = new Scanner(System.in);
        startMenu(myScanner);
    }


    public static void startMenu(Scanner myScanner){
        System.out.println(" ");
        System.out.println("Welcome to Task Management System!");
        System.out.println("Do you want to sign in or sign up?");
        System.out.println(" Press '1' to Sign Up");
        System.out.println(" Press '2' to Sign In");
        System.out.println(" Press anything to Quit");
        System.out.println(" ");
        System.out.print("I want to : ");

        switch (myScanner.nextLine()) {
            case "1":
                System.out.println(" ");
                UserController.userSignUp(myScanner);
                System.out.println(" ");
                break;
                case "2":
                System.out.println(" ");
                System.out.println("User Sign In!");
                UserController.userSignIn(myScanner);
                break;
            default:
                System.exit(0);
                break;
        }
    }


    public static void mainMenu(Scanner myScanner, User user){
        System.out.println(" ");
        System.out.println(" ");
        ArrayList<TaskManagement> userTask = TaskManagement.getAllTask(user);
        if(userTask.size() > 0)
            System.out.println("Hello "+ user.getUserName() +", This is your to do!");
        else
            System.out.println("Hello "+ user.getUserName() +", You have no task today!");
        
        int taskNumber = 1;
        for (TaskManagement task : userTask) {
            System.out.println(taskNumber + ". " + task.getTaskName());
            taskNumber +=1;
        }

        System.out.println(" ");
        do {
            System.out.println("What do you want to do today?");
            System.out.println("Press '1' to Completing my task");
            System.out.println("Press '2' to Create a new task");
            System.out.println("Press '3' to Remove a task");
            System.out.println("Press '4' to Check my completed task");
            System.out.println("Press '5' to logout");
            System.out.println(" ");    
            System.out.print("I'm want to.. : ");    
            String userChoice = myScanner.nextLine();
            System.out.println(" ");    
            switch (userChoice) {
                case "1":
                    TaskController.completingTask(myScanner, user, userTask);
                    System.out.println(" ");
                break;
                case "2":
                    TaskController.createTask(myScanner, user);
                    System.out.println(" ");
                break;
                case "3":
                    TaskController.removeTask(myScanner, user, userTask);
                    System.out.println(" ");
                break;
                case "4":
                    TaskController.checkCompleted(myScanner, user);
                    System.out.println(" ");
                break;
                case "5":
                    System.out.println(" ");
                    System.out.println("Thanks for using our app! See you later!");
                    System.out.println(" ");
                    startMenu(myScanner);
                    
                break;
                default:
                    System.out.println("There is no "+ userChoice +" menu, please select another menu");
                    System.out.println(" ");
                    break;
            }
        } while (true);
    }
    
}