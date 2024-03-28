package com.adepuu.exercises.session8;

import java.util.ArrayList;
import java.util.List;

public class ToDo {
  private String todoName;
  private List<Task> tasks;

  // constructor
  public ToDo(String todoName) {
    this.todoName = todoName;
    this.tasks = new ArrayList<>();
  }

  // getter
  public String getTodoName() {
    return todoName;
  }

  // method to add tasks
  public void addTask(String description) {
    Task task = new Task(description);
    tasks.add(task);
  }

  // method to delete tasks
  public void deleteTask(int index) {
    // check if the index is within the array list size
    if (index < tasks.size()) {
      tasks.remove(index);
    }
  }

  // method to view tasks
  public void viewTasks() {
    // check if there's task in the todo
    if (tasks.size() == 0) {
      System.out.println("No tasks found!");
    } else {
      for (Task task : tasks) {
        int num = 1;
        String status = task.isCompleted() ? "[x]" : "[ ]";
        System.out.println(num + ". " + status + " " + task.getDescription());
        num++;
      }
    }
  }
}
