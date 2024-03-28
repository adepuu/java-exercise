package com.adepuu.exercises.session8.controller;
import com.adepuu.exercises.session8.App;
import com.adepuu.exercises.session8.model.TaskManagement;
import com.adepuu.exercises.session8.model.User;

import java.util.ArrayList;
import java.util.Scanner;


public class TaskController {
    public static void completingTask(Scanner myScanner, User user, ArrayList<TaskManagement> taskTotal){
        System.out.println(" ");
        System.out.println("Great "+ user.getUserName() +"! Which task do you want to completing?");
        System.out.print("I want to completed : ");
        int userChoice = 0;
        String taskName = "";
        try {
            userChoice = Integer.parseInt(myScanner.nextLine())-1;
        } catch (Exception e) {
            System.out.println("Please input a number");
            completingTask(myScanner, user, taskTotal);
        }

        if(userChoice > taskTotal.size()){
            System.out.println("There is no task number "+userChoice);
            completingTask(myScanner, user, taskTotal);
        }
        else{
            TaskManagement doneTask = taskTotal.get(userChoice);
            taskName = doneTask.getTaskName();
            TaskManagement.isDone(doneTask);
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Task : " + taskName + " is Finished! Nice!");
        App.mainMenu(myScanner, user);
    }

    public static void createTask(Scanner myScanner, User user){
        System.out.println(" ");
        System.out.println("Okay, Enter your name task bellow!");
        System.out.print("Name of task : ");
        String taskName = myScanner.nextLine();
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Task : " + taskName + " is Created! Nice!");
        TaskManagement newTask = new TaskManagement(taskName, user);
        TaskManagement.createTask(newTask);

        App.mainMenu(myScanner, user);
    }

    public static void removeTask(Scanner myScanner, User user, ArrayList<TaskManagement> taskTotal){
        System.out.println(" ");
        System.out.println("Uh-oh, Which task do you want to remove?");
        System.out.print("Number of task : ");
        
        String taskName="";
        int userChoice = 0;
        try {
            userChoice = Integer.parseInt(myScanner.nextLine())-1;
        } catch (Exception e) {
            System.out.println("Please input a number");
            removeTask(myScanner, user, taskTotal);
        }

        if(userChoice > taskTotal.size()){
            System.out.println("There is no task number "+userChoice);
            removeTask(myScanner, user, taskTotal);
        }
        else{
            TaskManagement removedTask = taskTotal.get(userChoice);
            taskName = removedTask.getTaskName();
            TaskManagement.removeTask(removedTask);
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Task : " + taskName + " is removed!");
        App.mainMenu(myScanner, user);
    }

    public static void checkCompleted(Scanner myScanner, User user){
        System.out.println(" ");
        
        ArrayList<TaskManagement> userTask = TaskManagement.getFinishedTask(user);
        
        if(userTask.size() > 0)
            System.out.println("Sure, "+ user.getUserName() +"! This is your Finished Task!");
        else
            System.out.println("Hello "+ user.getUserName() +", You don't have any completed task");
        
        int taskNumber = 1;
        for (TaskManagement task : userTask) {
            System.out.println(taskNumber + ". " + task.getTaskName());
            taskNumber +=1;
        }
        App.mainMenu(myScanner, user);
    }
}
