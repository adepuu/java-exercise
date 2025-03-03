package com.adepuu.exercises.session10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class User {
  private String userId;

  private String username;

  private String password;

  private boolean isLogin;

  private List<HashMap<String, String>> users = new ArrayList<>();

  public User() {
    this.userId = UUID.randomUUID().toString();
    this.isLogin = false;
  }

  public String getUserId() {
    return userId;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return getPassword();
  }

  public boolean getIsLogin() {
    return isLogin;
  }

  public void setIsLogin(boolean val) {
    isLogin = val;
  }

  public void setUserName(String newUsername) {
    username = newUsername;
  }

  public void setPassword(String newPassword) {
    password = newPassword;
  }

  public boolean isUsernameAvailable(String username) {
    for (HashMap<String, String> map : users) {
      if (map.get("username").equals(username)) {
        return false;
      }
    }
    return true;
  }

  public boolean register(String username, String password) {
    try {
      if (isUsernameAvailable(username)) {
        HashMap<String, String> user = new HashMap<>();
        user.put("userId", userId);
        user.put("username", username);
        user.put("password", password);
        users.add(user);
        System.out.println("----- Signup success -----");
        setIsLogin(true);
        return true;
      } else {
        System.out.println("----- Username " + username + " isn't available -----");
      }
    } catch (Exception e) {
      System.out.println("Ups Something Error");
    }
    return false;
  }

  public boolean login(String username, String password) {
    try {
      for (HashMap<String, String> map : users) {
        if (map.get("username").equals(username) && map.get("password").equals(password)) {
          System.out.println("----- Login success -----");
          setIsLogin(true);
          return true;
        }
      }
    } catch (Exception e) {
      System.out.println("Ups Something Error");
    }
    System.out.println("----- username or password incorrect -----");
    return false;
  }

  public void getUser() {
    try {
      System.out.println("------Detail User-------");
      for (HashMap<String, String> map : users) {
        System.out.println("userId: " + map.get("userId"));
        System.out.println("username: " + map.get("username"));
        System.out.println("--------------------------------");
      }
    } catch (Exception e) {
      System.out.println("Ups Something Error");
    }


  }
}
