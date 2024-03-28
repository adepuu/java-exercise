package com.adepuu.exercises.session8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class User {

  private String id;

  private String username;

  private String password;

  private List<HashMap<String, String>> users = new ArrayList<>();

  public User() {
    this.id = UUID.randomUUID().toString();
  }

  public boolean isUsernameAvailable(String username) {
    for (HashMap<String, String> map : users) {
      if (map.get("username").equals(username)) {
        return false;
      }
    }
    return true;
  }

  public void register(String username, String password) {
    try {
      if (isUsernameAvailable(username)) {
        HashMap<String, String> user = new HashMap<>();
        user.put("id", id);
        user.put("username", username);
        user.put("password", password);
        users.add(user);
        System.out.println("Signup success");
      } else {
        System.out.println("Username " + username + " is not available");
      }
    } catch (Exception e) {
      System.out.println("Upss Something Error");
    }
  }

  public boolean login(String username, String password) {
    try{
      for (HashMap<String, String> map : users) {
        if (map.get("username").equals(username) && map.get("password").equals(password)) {
          System.out.println("login success");
          return true;
        }
      }
    } catch (Exception e){
      System.out.println("Upss Something Error");
      return false;
    }
    System.out.println("username or password incorrect");
    return false;
  }

  public void getUsers() {
    try{
      System.out.println("------List of Users-------");
      for (HashMap<String, String> map : users){
        System.out.println("id: " + map.get("id"));
        System.out.println("username: " + map.get("username"));
        System.out.println("--------------------------------");
      }
    } catch (Exception e) {
      System.out.println("Upss Something Error");
    }


  }

}
