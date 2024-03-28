package com.adepuu.exercises.session8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class TodoList {
  private List<Todo> listOfTodos = new ArrayList<>();

  private Scanner scanner;

  public TodoList() {
    this.scanner = new Scanner(System.in);
  }

  public void getListOfTodos() {
    try {
      System.out.println(listOfTodos);
      System.out.println("""
                        
            ----- My Todos -----\s
            """);

      if (listOfTodos.isEmpty()) {
        System.out.println("You don't have any todo");
      }

      for (Todo map : listOfTodos) {
        System.out.println("TodoId: " + map.getTodoId());
        System.out.println("Title: " + map.getTitle());
        System.out.println("Description: " + map.getDescription());
        System.out.println("UserId: " + map.getUserId());
        System.out.println("--------------------------------");
      }


    } catch (Exception e) {
      System.out.println("Upss Something Error");
    }
  }

  public void setListOfTodos() {
    System.out.println("""
                        
            ----- Create Todo -----\s
            """);
    System.out.print("Title: ");
    String title = scanner.nextLine();

    System.out.print("Description: ");
    String description = scanner.nextLine();

    try {
      User user = new User();
      Todo todo = new Todo(title, description, user.getUserId());
      listOfTodos.add(todo);
      System.out.println("----- Todo have saved -----");
    } catch (Exception e) {
      System.out.println("Ups something error");
    }
  }

  public boolean editTodo() {
    System.out.println("""
                        
            ----- Edit Todo -----\s
            """);
    getListOfTodos();

    System.out.print("Insert TodoId: ");
    String todoId = scanner.next();

    System.out.print("Title(Optional): ");
    String title = scanner.next();

    System.out.print("Description(Optional): ");
    String description = scanner.next();

    if (Objects.equals(todoId, "")) {
      System.out.println("TodoId cannot empty");
      return false;
    }

    try {
      for (Todo map : listOfTodos) {
        if (map.getTodoId().equals(todoId)) {
          map.setTitle(Objects.equals(title, "") ? map.getTitle() : title);
          map.setDescription(Objects.equals(description, "") ? map.getDescription() : description);
        }
      }
      System.out.println("Edit todo success");
      return true;
    } catch (Exception e) {
      System.out.println("Ups something error");
    }
    return false;
  }

  public boolean deleteTodo() {
    System.out.println("""
                        
            ----- Delete Todo -----\s
            """);
    getListOfTodos();

    System.out.print("Insert TodoId:");
    String todoId = scanner.next();

    if (Objects.equals(todoId, "")) {
      System.out.print("TodoId cannot empty");
      return false;
    }
    try {
      for (int i = 0; i < listOfTodos.size(); i++) {
        if (listOfTodos.get(i).getTodoId().equals(todoId)) {
          listOfTodos.remove(i);
        }
      }
      System.out.println("Delete todo success");
      return true;
    } catch (Exception e) {
      System.out.println("Ups something error");
    }
    return false;
  }
}
