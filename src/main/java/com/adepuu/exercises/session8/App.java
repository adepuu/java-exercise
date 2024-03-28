package com.adepuu.exercises.session8;

import java.util.*;

public class App {
    public static Scanner scanner = new Scanner(System.in);
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
        Scanner input = new Scanner(System.in);
        /*
         Create menu functionalities
         Split classes
         Make methods
         Connect all the functionalities with the related menu ;)
         GL HF! ;)
        */
        String[] userLogin = Menu.loginMenu();
        if(Objects.equals(userLogin[0], "admin") && Objects.equals(userLogin[1], "admin")){
            String[] userData = Auth.createUser();
            Todo.createTodo(userData[1], userData[0]);
            return;
        }
        String userID = Auth.login(userLogin[0], userLogin[1]);
        //String userID = null;
        if(userID == null){
            System.out.println("Username or password not correct");
        } else {
            User user = Auth.getUserByUserId(userID);
            assert user != null;

            do {
                Menu menu = new Menu();
                menu.mainMenu();
                System.out.print("Your input : ");
                //input.nextLine();
                int choose = input.nextInt();
                System.out.println("=================================");

                switch (choose) {
                    case 1:
                        String taskBody = menu.createTaskMenu();
                        String taskId = Task.createTask(taskBody);
                        Todo todo = new Todo(user.getTodoId(), Collections.singletonList(taskId), user.getID());
                        Todo.addTaskTOtodoId(todo.getID(),todo.getLastTaskId());
                        System.out.println("taskBody" + taskBody);
                        System.out.println("taskId" + taskId);
                        break;
                    case 2:
                        System.out.println("List Task" );
                        Task.printTasksByUserId(user.getID());
                        break;
                    case 3:
                        System.out.println("Delete Task" );
                        Task.deleteTaskByUserId(user.getID());
                        break;
                    default:
                        System.out.println("INVALID INPUT");
                }
            } while (Menu.isContinue().equalsIgnoreCase("y"));

            input.close();
        }

    }

}
