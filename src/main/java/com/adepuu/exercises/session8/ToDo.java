package com.adepuu.exercises.session8;
import java.util.List;
import java.util.ArrayList;
public class ToDo {
    private String user;
    private List<String> toDoList;

    public ToDo(String user) {
        this.user = user;
        this.toDoList = new ArrayList<>();
    }

    public String getUser() {
        return user;
    }

    public void getToDoList() {
        System.out.println("--------------------------------------");
        System.out.println("Your ToDo List: ");
        if (!toDoList.isEmpty()) {
            for (String i : toDoList) {
                System.out.println("* " + i);
            }
        } else {
            System.out.println("Your ToDo list is empty!");
        }
    }

    public void addToDo(String toDo) {
        toDoList.add(toDo);
    }

    public void deleteToDo(String toDo) {
        if (!toDoList.isEmpty()) {
            for (int i = 0; i < toDoList.size(); i++) {
                if (toDoList.get(i).equals(toDo)) {
                    // mark toDo as "done"
                    toDoList.set(i, "-");
                }
            }
        } else {
            System.out.println("Failed to delete!");
        }

    }
}
