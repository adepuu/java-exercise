package com.adepuu.exercises.session8;

import java.util.HashMap;

public class User {

  // private variables
  private String username;
  private String password;

  // tie user to todo
  private ToDo toDos;

  // constructor
  public User (String username, String password) {
    this.username = username;
    this.password = password;
    this.toDos = new ToDo("def");
  }

  // getter
  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public ToDo getToDos(String todoName) {
    return toDos;
  }

// ! public ToDo getAll()

  // setter
  public void setUsername() {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public boolean passwordValid(String password) {
    return this.password.equals(password);
  }

//  public void addTodo(String todoName) {
//    toDos.put(todoName, new ToDo(todoName));
//  }
//
//  public void deleteTodo(String todoName) {
//    toDos.remove(todoName);
//  }
}
