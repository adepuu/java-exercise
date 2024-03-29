package com.adepuu.exercises.session8;

import java.io.Console;
import java.util.InputMismatchException;
import java.util.Scanner;

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
     * </ul>
     */
    public static int toDoListScreen(){
        int choice = 0;
        Scanner myInput = new Scanner(System.in);
        while (true) {
            System.out.println("----------------To-Do List APP----------------");
            System.out.println("1. Add New Task ");
            System.out.println("2. Display Task ");
            System.out.println("3. Delete Task  ");
            System.out.println("4. Change Password  ");
            System.out.println("5. Log Out  ");
            System.out.println();
            System.out.print("Choice : ");
            try{
                choice = myInput.nextInt();
            }catch (InputMismatchException e){
                System.err.println("Please input the right value");
            }finally {
                return choice;
            }
        }
    }
    public static int LoginScreen(){
        Scanner myInput = new Scanner(System.in);
        int input = 0;
        System.out.println();
        while (true){
            System.out.println("----------------To-Do List APP----------------");
            System.out.println("1. Login");
            System.out.println("2. Register (For a new user)");
            System.out.println("3. Exit");
            System.out.print("Choice : ");
            try{
                input= myInput.nextInt();
            }catch (InputMismatchException e){
                System.err.println("Please input the right value");
            }finally {
                return input;
            }
        }
    }
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        Auth auth = new Auth();
        Todo task = new Todo();
        boolean loop = false;
        // Create menu functionalities
        // Split classes
        // Make methods
        // Connect all the functionalities with the related menu ;)
        // GL HF! ;)
        while (!loop){
            int input = LoginScreen();
            switch (input){
                case 1 :
                    System.out.println("----------------Login----------------");
                    System.out.print("Username \t : ");
                    String usernameLogin = myInput.nextLine();
                    System.out.print("Password \t : ");
                    String passwordLogin = myInput.nextLine();
                    auth.userLogin(usernameLogin,passwordLogin);
                        while (!auth.userDetail().isEmpty()){
                            int choice = toDoListScreen();
                            switch (choice){
                                case 1 :
                                    System.out.println("----------------Add New Task----------------");
                                    System.out.print("Task Name :  ");
                                    String name = myInput.nextLine();
                                    task.createNewTask(auth.userDetail(),name);
                                    break;
                                case 2 :
                                    System.out.println("----------------Task----------------");
                                    task.displayAllTask(auth.userDetail());
                                    System.out.println();
                                    break;
                                case 3:
                                    System.out.println("-----------------Delete Task-----------------");
                                    task.displayDeleteTask(auth.userDetail());
                                    System.out.print("Choose task to delete : ");

                                    String delete = myInput.nextLine();
                                    task.deleteTask(delete);
                                    break;
                                case 4:
                                    boolean isValid = false;
                                    while (!isValid){
                                        System.out.println("-----------------Change Password-----------------");
                                        System.out.print("Input old password : ");
                                        String oldPassword = myInput.nextLine();
                                        System.out.print("Input new password : ");
                                        String newPassword = myInput.nextLine();
                                        isValid = auth.changePassword(oldPassword,newPassword);
                                    }
                                    break;


                                case 5: auth.logout();
                                         break;

                            }
                        }
                    break;
                case 2:
                    boolean register = true;
                    String username,password;
                    while (register){
                        System.out.println("----------------Register----------------");
                        System.out.print("Username \t : ");
                        username = myInput.nextLine();
                        System.out.print("Password \t : ");
                        password = myInput.nextLine();
                        if(username.isEmpty() || password.isEmpty()) {
                            System.out.println();
                            System.out.println("Username / password can not be empty");
                            continue;
                        }
                        boolean isRegistered = auth.createNewUser(username, password);
                        if(isRegistered == true){
                            register = false;
                        }
                    }
                    break;
                case 3:loop = true;
                      break;
            }
        }
    }
}
