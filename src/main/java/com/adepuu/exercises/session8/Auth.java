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

    public static void createUser() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            String id = UUID.randomUUID().toString();
            String userString = "<user>\n" +
                    "    <id>" + id + "</id>\n" +
                    "    <username>" + username + "</username>\n" +
                    "    <password>" + password + "</password>\n" +
                    "    <todoID>" + id + "</todoID>\n" +
                    "</user>";

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("user.xml", true))) {
                writer.write(userString);
                writer.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("User berhasil ditambahkan.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String login(String username, String password) {
        File file = new File("user.xml");
        try (Scanner scanner = new Scanner(new FileInputStream(file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (line.startsWith("<user>")) {
                    String xmlUsername = getValue(line, "username");
                    String xmlPassword = getValue(line, "password");
                    if (username.equals(xmlUsername) && password.equals(xmlPassword)) {
                        return getValue(line, "id");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String getValue(String line, String tagName) {
        int start = line.indexOf("<" + tagName + ">") + tagName.length() + 2;
        int end = line.indexOf("</" + tagName + ">");
        return line.substring(start, end);
    }
}
