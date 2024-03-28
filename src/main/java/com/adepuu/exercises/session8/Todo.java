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

public class Todo {

    private final String ID;
    private final List<String> taskId;
    private final String userId;

    public Todo(String todoId, List<String> taskIds, String userId) {
        this.ID = todoId;
        this.taskId = taskIds;
        this.userId = userId;
    }


    public String getID() {
        return ID;
    }

    public String getUserId() {
        return userId;
    }

    public List<String> getTaskIds() {
        return taskId;
    }
    public String getLastTaskId() {
        if (!taskId.isEmpty()) {
            return taskId.getLast();
        }
        return null;
    }

    public void addTaskId(String taskId) {
        this.taskId.add(taskId);
    }

    public static String createTodo(String todoId, String userId) {
        try {
            String id = UUID.randomUUID().toString();
            String todoString = "<todo>\n" +
                    "    <id>" + todoId + "</id>\n" +
                    "    <userId>" + userId + "</userId>\n" +
                    "</todo>";

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("todo.xml", true))) {
                writer.write(todoString);
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
    public static void addTaskTOtodoId(String todoId, String taskId) {
        File file = new File("todo.xml");
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("todo");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Element todoElement = (Element) nodeList.item(i);
                String xmlTodoID = todoElement.getElementsByTagName("id").item(0).getTextContent();
                if (todoId.equals(xmlTodoID)) {
                    Element taskIdElement = doc.createElement("taskId");
                    taskIdElement.setTextContent(taskId);
                    todoElement.appendChild(taskIdElement);

                    // Check if taskIdElement is not the last element in todoElement
                    if (i != nodeList.getLength() - 1) {
                        // Add a new line after the <taskId> tag
                        todoElement.appendChild(doc.createTextNode("\n"));
                    }
                    break; // Stop loop after adding taskId to the correct todo
                }
            }

            // Write the updated XML back to the file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2"); // Set indent amount to 2 spaces
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("todo.xml"));
            transformer.transform(source, result);

        } catch (ParserConfigurationException | SAXException | IOException | TransformerException e) {
            e.printStackTrace();
        }
    }

    public static List<String> getTaskIdsByUserId(String userID) {
        List<String> taskIds = new ArrayList<>();
        File file = new File("todo.xml");
        try (Scanner scanner = new Scanner(new FileInputStream(file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (line.startsWith("<todo>")) {
                    StringBuilder todoXml = new StringBuilder(line);
                    while (!line.endsWith("</todo>")) {
                        line = scanner.nextLine().trim();
                        todoXml.append("\n").append(line);
                    }
                    String xmlUserID = Auth.getValue(todoXml.toString(), "userId");
                    if (userID.equals(xmlUserID)) {
                        NodeList taskIdNodes = getXmlNodes(todoXml.toString(), "taskId");
                        for (int i = 0; i < taskIdNodes.getLength(); i++) {
                            Node taskIdNode = taskIdNodes.item(i);
                            if (taskIdNode.getNodeType() == Node.ELEMENT_NODE) {
                                Element taskIdElement = (Element) taskIdNode;
                                String taskId = taskIdElement.getTextContent();
                                taskIds.add(taskId);
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return taskIds;
    }

    private static NodeList getXmlNodes(String xmlString, String tagName) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            InputSource is = new InputSource(new StringReader(xmlString));
            Document doc = builder.parse(is);
            return doc.getElementsByTagName(tagName);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
