package com.adepuu.exercises.session8;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.UUID;
import java.io.File;
import java.io.FileInputStream;



public class Auth {

    public static String[] createUser() {
        String[] result = new String[2];
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            String id = UUID.randomUUID().toString();
            String todoId = UUID.randomUUID().toString();
            String userString = "<user>\n" +
                    "    <id>" + id + "</id>\n" +
                    "    <username>" + username + "</username>\n" +
                    "    <password>" + password + "</password>\n" +
                    "    <todoID>" + todoId + "</todoID>\n" +
                    "</user>";

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("user.xml", true))) {
                writer.write(userString);
                writer.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            result[0] = id;
            result[1] = todoId;
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    public static String login(String username, String password) {
        File file = new File("/Users/kurniawanmuhammadrizki/IdeaProjects/java-exercise-main/user.xml");
        try (Scanner scanner = new Scanner(new FileInputStream(file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (line.startsWith("<user>")) {
                    StringBuilder userXml = new StringBuilder(line);
                    while (!line.endsWith("</user>")) {
                        line = scanner.nextLine().trim();
                        userXml.append("\n").append(line);
                    }
                    String xmlUsername = getValue(userXml.toString(), "username");
                    String xmlPassword = getValue(userXml.toString(), "password");
                    if (username.equals(xmlUsername) && password.equals(xmlPassword)) {
                        return getValue(userXml.toString(), "id");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getValue(String line, String tagName) {
        int start = line.indexOf("<" + tagName + ">") + tagName.length() + 2;
        int end = line.indexOf("</" + tagName + ">");
        if (start >= 0 && end >= 0) {
            return line.substring(start, end);
        } else {
            return null;
        }
    }

    public static User getUserByUserId(String userID) {
        File file = new File("user.xml");
        try (Scanner scanner = new Scanner(new FileInputStream(file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (line.startsWith("<user>")) {
                    StringBuilder userXml = new StringBuilder(line);
                    while (!line.endsWith("</user>")) {
                        line = scanner.nextLine().trim();
                        userXml.append("\n").append(line);
                    }
                    String xmlUserID = getValue(userXml.toString(), "id");
                    if (userID.equals(xmlUserID)) {
                        String username = getValue(userXml.toString(), "username");
                        String todoID = getValue(userXml.toString(), "todoID");
                        return new User(userID, username, todoID);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

     public static void main(String[] args) {
        String username = "iki";
         String password = "ikipass";
        String[] userData = createUser();
        Todo.createTodo(userData[1], userData[0]);
    }
}
