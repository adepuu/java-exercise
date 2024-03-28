package com.adepuu.exercises.session8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ToDoList {
    public ArrayList<ToDo> toDos = new ArrayList<>();

    public void printToDos() {
        int displayNumber = 1;

        for (ToDo toDo : toDos) {
            String isDone = toDo.getIsdone() ? "Done" : "Not Done";
            System.out.println((displayNumber) + " -> " + toDo.getDescription() + "    Status: " + isDone);
            displayNumber++;
        }
    }

    public void addItemPrompt(Scanner scanner) {
        while (true) {
            System.out.println("Enter task to do (or type `b` to finish): ");
            String toDoDescription = scanner.nextLine();
            if (toDoDescription.isEmpty()) {
                System.out.println("Description can't be empty");
                continue;
            }

            if (toDoDescription.equalsIgnoreCase("b")) break;

            ToDo toDo = new ToDo(toDoDescription);
            toDos.add(toDo);
            System.out.println("New item added");
        }
    }

    public void finishToDoItem(Scanner scanner) {
        while (true) {
            if (toDos.isEmpty()) {
                System.out.println("Nothing todo!");
            }

            printToDos();
            var unfinishedToDos = toDos
                    .stream()
                    .filter(c -> !c.getIsdone())
                    .toList();

            System.out.println("Enter which task number to finish from 1 to " + unfinishedToDos.size() + " (or type `b` to finish) : ");
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("b")) break;

            try {
                int taskNumber = Integer.parseInt(userInput);
                if (taskNumber <= unfinishedToDos.size()) {
                    var indexToFinish = toDos.indexOf(unfinishedToDos.get(taskNumber-1));
                    toDos.get(indexToFinish).setDone();
                }
            } catch (NumberFormatException e) {
                System.out.println("Unknown input");
            }
        }
    }

    public void deleteToDoItem(Scanner scanner) {
        while (true) {
            if (toDos.isEmpty()) {
                System.out.println("Nothing todo!");
            }

            printToDos();
            System.out.println("Enter which task number to delete from 1 to " + toDos.size() + " (or type `b` to finish) : ");
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("b")) break;

            try {
                int taskNumber = Integer.parseInt(userInput);
                if (taskNumber <= toDos.size()) {
                    var indexToDelete = taskNumber - 1;
                    var removedItem = toDos.remove(indexToDelete);
                    System.out.println("Task " + removedItem.getDescription() +  " is finished");
                }
            } catch (NumberFormatException e) {
                System.out.println("Unknown input");
            }
        }
    }
}
