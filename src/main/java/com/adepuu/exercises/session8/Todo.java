package com.adepuu.exercises.session8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
public class Todo {
    private List<Task> taskList;

    public Todo() {
        taskList = new ArrayList<>();
    }
    public void createNewTask(String userID, String taskName){
        Task newTask = new Task(userID,taskName, UUID.randomUUID().toString());
        taskList.add(newTask);
        System.out.println("Data has been succesfully added");
    }

    public void displayAllTask(String userID){
        Scanner myInput = new Scanner(System.in);
        for(Task task:taskList){
            if(task.getUserID().equals(userID)){
                System.out.println("Name : " + task.getTaskName());
                System.out.println("------------------------------------");
            }
        }
        System.out.print("Press any key to continue!!");
        myInput.nextLine();

    }

    public void displayDeleteTask(String userID){
        for(Task task:taskList){
            if(task.getUserID().equals(userID)) {
                System.out.println("ID \t\t: " + task.getTaskID());
                System.out.println("Name \t: " + task.getTaskName());
                System.out.println("---------------------------------------------");
            }
        }
    }
    public void deleteTask(String delete){
        int count = 0;
        for(Task task:taskList){
            if(task.getTaskID().equals(delete)){
                taskList.remove(count);
                System.out.println("Data has been successfully removed !");
                return;
            }
            count++;
        }
    }
}
