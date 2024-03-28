package com.adepuu.exercises.session8;

import java.util.HashMap;
import java.util.UUID;

public class Todo {
  private  String todoId;
  private String title;

  private String description;

  private String userId;

  public Todo(String title, String description, String userId) {
    this.todoId = UUID.randomUUID().toString();
    this.title = title;
    this.description = description;
    this.userId = userId;
  }

  public String getTodoId() {
    return todoId;
  }

  public String getTitle() {
    return title;
  }

  public String getDescription() {
    return description;
  }

  public String getUserId() {
    return userId;
  }

  public void setTitle(String s) {
    title = s;
  }

  public void setDescription(String s) {
    description = s;
  }
}
