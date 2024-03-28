package com.adepuu.exercises.session8;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
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
     *     <li>Please Use UUID if there's ID needed <a href="https://www.baeldung.com/java-uuid">Java UUID Reference</a></li>
     *     <li>Data does not need to be stored in a File. Instead, store it inside a Map or List and let the data gone when program finished</li>
     * </ul>
     */

    static User logginUser = null;




    public static void main(String[] args) {
        /*
         Create menu functionalities
         Split classes
         Make methods
         Connect all the functionalities with the related menu ;)
         GL HF! ;)
        */


//        Step 1: Buat menu login
//        Step 2: Register



        dataRegister();




    }

    public static void userLogin(){
        String userName = " ";
        String password = " ";

        Scanner input = new Scanner(System.in);
        System.out.println("Input your name or q to menu = ");
        userName = input.nextLine();
        if(userName.equals("q"))
            dataRegister();
        System.out.println("Input your password or q to menu = ");
        password = input.nextLine();
        if(password.equals("q"))
            dataRegister();

        try {
            User dataMasuk = User.dataLogin(userName, password);
            if(dataMasuk != null){
                System.out.println("You logged");
                logginUser = dataMasuk;
                menu();
            } else {
                System.out.println("Enter your correct username or Password");
                userLogin();

            }

        }
        catch (Exception e){
            System.out.println("Enter your correct username or Password");
            userLogin();

        }


    }

    public static void menu(){
        System.out.println("Pick menu");
        System.out.println("1: Create task");
        System.out.println("2: View task");
        System.out.println("3: Remove task");
        System.out.println("4: Log off");

        Scanner input = new Scanner(System.in);
        String menu = input.nextLine();

        if(menu.equals("1")){
            System.out.println("What is your task?");
            createTask();
        } else if (menu.equals("2")) {
            System.out.println(" Your tasks");

        } else if (menu.equals("3")) {
            System.out.println("Your tasks want to remove");

        } else if (menu.equals("4")) {
            System.out.println("You logged off");
            dataRegister();

        } else{
            System.out.println("Choose menu");
            menu();
        }

    }

    public static void register(){
        System.out.println("Enter your username or q to back menu");
        Scanner input = new Scanner(System.in);
        String register1 = input.nextLine();
        if(register1.equals("q")){
            dataRegister();
        }
        System.out.println("Enter numers as password or q to back menu");
        String password1 = input.nextLine();
        if(password1.equals("q")){
            dataRegister();
        }
        User dataUser = new User(register1, password1);
        User.dataUser(dataUser);
        dataRegister();


    }

    public static void dataRegister(){
        System.out.println("Choose menu");
        System.out.println("1: Register");
        System.out.println("2: Login");
        System.out.println("3: Exit ");

        Scanner input = new Scanner(System.in);
        String inputan = input.nextLine();

        if(inputan.equals("1"))
            register();
        else if (inputan.equals("2")) {
            userLogin();

        } else if (inputan.equals("3")) {
            System.exit(0);

        } else {
            System.out.println("Choose the right menu");
            dataRegister();

        }


    }

    public static void createTask(){
        System.out.println("Input your task");
        Scanner scanner = new Scanner(System.in);
        String task = scanner.nextLine();

        Task inputTask = new Task(task,logginUser);
        Task.listTask(inputTask);
        menu();


    }
}



