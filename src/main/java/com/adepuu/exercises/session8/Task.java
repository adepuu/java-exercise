package com.adepuu.exercises.session8;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.util.*;

public class Task {

    private final String ID;

    private final String description;

    public Task(String description) {
        UUID uuid = UUID.randomUUID();
        this.ID = uuid.toString();
        this.description = description;
    }

    public String getID() {
        return ID;
    }

    public String getDescription() {
        return description;
    }

    public static String createTask(String task) {
        try {
            String id = UUID.randomUUID().toString();
            String taskString = "<task>\n" +
                    "    <id>" + id + "</id>\n" +
                    "    <body>" + task + "</body>\n" +
                    "</task>";

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("task.xml", true))) {
                writer.write(taskString);
                writer.newLine();

            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Task Created!");
            return id;
        } catch (Exception e) {
            e.printStackTrace();
            return "Failed create task";
        }
    }

//    public static String createTask(String task) {
//        try {
//            String id = UUID.randomUUID().toString();
//            String taskString = "<task>\n" +
//                    "    <id>" + id + "</id>\n" +
//                    "    <body>" + task + "</body>\n" +
//                    "</task>";
//
//            File inputFile = new File("task.xml");
//            File tempFile = new File("temp.xml");
//
//            try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
//                 BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
//
//                String line;
//                boolean isInsideTaskTag = false;
//
//                while ((line = reader.readLine()) != null) {
//                    if (line.trim().startsWith("<task>")) {
//                        isInsideTaskTag = true;
//                    } else if (line.trim().startsWith("</task>")) {
//                        isInsideTaskTag = false;
//                    }
//
//                    writer.write(line + "\n");
//
//                    if (isInsideTaskTag && line.trim().endsWith("</task>")) {
//                        writer.write(taskString + "\n");
//                    }
//                }
//            }
//
//            if (!inputFile.delete()) {
//                System.out.println("Could not delete file");
//                return null;
//            }
//
//            if (!tempFile.renameTo(inputFile)) {
//                System.out.println("Could not rename file");
//                return null;
//            }
//
//            System.out.println("Task Created!");
//            return id;
//        } catch (IOException e) {
//            e.printStackTrace();
//            return "Failed create task";
//        }
//    }
    public static void printTasksByUserId(String userID) {
        List<String> taskIDs = Todo.getTaskIdsByUserId(userID);
        if (taskIDs != null && !taskIDs.isEmpty()) {
            for (int i = 0; i < taskIDs.size(); i++) {
                String taskId = taskIDs.get(i);
                String taskBody = getTaskBodyById(taskId);
                if (taskBody != null) {
                    System.out.println((i + 1) + ". " + taskBody);
                }
            }
        } else {
            System.out.println("No tasks found for user with ID: " + userID);
        }
    }

    private static String getTaskBodyById(String taskId) {
        File file = new File("task.xml");
        try (Scanner scanner = new Scanner(new FileInputStream(file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (line.startsWith("<task>")) {
                    StringBuilder taskXml = new StringBuilder(line);
                    while (!line.endsWith("</task>")) {
                        line = scanner.nextLine().trim();
                        taskXml.append("\n").append(line);
                    }
                    String xmlTaskID = Auth.getValue(taskXml.toString(), "id");
                    if (taskId.equals(xmlTaskID)) {
                        return Auth.getValue(taskXml.toString(), "body");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void deleteTaskByUserId(String userID) {
        List<String> taskIDs = Todo.getTaskIdsByUserId(userID);
        if (taskIDs != null && !taskIDs.isEmpty()) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Select a task to delete (enter the task number):");
            for (int i = 0; i < taskIDs.size(); i++) {
                String taskId = taskIDs.get(i);
                String taskBody = getTaskBodyById(taskId);
                System.out.println((i + 1) + ". " + taskBody);
            }

            System.out.print("Your input : ");
            int taskNumber = scanner.nextInt();
            scanner.nextLine();

            if (taskNumber > 0 && taskNumber <= taskIDs.size()) {
                String taskIdToDelete = taskIDs.get(taskNumber - 1);
                boolean success = deleteTaskById(taskIdToDelete);
                if (success) {
                    taskIDs.remove(taskIDs.get(taskNumber - 1));
                    System.out.println("Task deleted successfully.");
                } else {
                    System.out.println("Failed to delete task.");
                }
            } else {
                System.out.println("Invalid task number.");
            }
        } else {
            System.out.println("No tasks found for user with ID: " + userID);
        }
        Menu.isContinue();
    }

    public static boolean deleteTaskById(String taskId) {
        File file = new File("task.xml");
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("task");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Element taskElement = (Element) nodeList.item(i);
                String xmlTaskID = taskElement.getElementsByTagName("id").item(0).getTextContent();
                if (taskId.equals(xmlTaskID)) {
                    // Hapus elemen <task> dari XML
                    taskElement.getParentNode().removeChild(taskElement);

                    // Write the updated XML back to the file
                    TransformerFactory transformerFactory = TransformerFactory.newInstance();
                    Transformer transformer = transformerFactory.newTransformer();
                    transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                    transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2"); // Set indent amount to 2 spaces
                    DOMSource source = new DOMSource(doc);
                    StreamResult result = new StreamResult(new File("task.xml"));
                    transformer.transform(source, result);

                    System.out.println("Task deleted successfully.");
                    return true;
                }
            }
            System.out.println("Task not found.");
        } catch (ParserConfigurationException | SAXException | IOException | TransformerException e) {
            e.printStackTrace();
        }
        return false;
    }
}
