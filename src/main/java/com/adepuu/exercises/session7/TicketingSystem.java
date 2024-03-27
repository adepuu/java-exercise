package com.adepuu.exercises.session7;

import java.util.ArrayList;
import java.util.Scanner;

public class TicketingSystem {
    /**
     * Write a Java Program using OOP about simple ticketing system for an event.
     * <p>
     * Feature Acceptance Criteria:
     * - Ticket Creation: The system should allow for the creation of a new ticket with a unique identifier, event name, and price.
     * - Ticket Booking: Users should be able to book a ticket by selecting an event and providing their details.
     * - Ticket Validation: The system should check if the ticket is still available for booking.
     * - Ticket Confirmation: After booking, the system should issue a confirmation ticket to the user.
     * <p>
     * OOP Concept-wise Acceptance Criteria:
     * - Classes and Objects: The system should define a Ticket class that serves as a blueprint for creating ticket objects. Each ticket object should represent a unique ticket for an event.
     * - Encapsulation: The Ticket class should encapsulate the ticket details (e.g., ticket ID, event name, price) by making them private and providing public getter and setter methods to access and modify these details.
     * - Static Keyword: The Ticket class should use a static field to keep track of the total number of tickets sold, demonstrating the use of static variables.
     * - Interface Implementation (Optional): Ticket class could implement an interface (e.g., Ticketable) that defines methods for printing ticket details, ensuring that all ticket types adhere to a common contract.
     * <p>
     * Start your project from the main method below ;) have fun!
     */
    private String ticketID;
    private String eventName;
    private double price;

    private static ArrayList<User> userList = new ArrayList<User>();
    private static ArrayList<Event> eventList = new ArrayList<Event>();
    private static ArrayList<Ticket> ticketList = new ArrayList<Ticket>();

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to Event Ticketing System!");
        String userChoice = "";

        do {
            System.out.println("What do you want to do?");
            System.out.println("Press '1' to create user");
            System.out.println("Press '2' to create event");
            System.out.println("Press '3' to check event quota");
            System.out.println("Press '4' to check all user");
            System.out.println("Press '5' to buy ticket");
            System.out.println("Press '6' to check purchased ticket");
            System.out.println("Press anything to quit");    
            System.out.println(" ");    
            System.out.print("My choice : ");    
            userChoice = myScanner.nextLine();
            System.out.println(" ");    
            switch (userChoice) {
                case "1":
                    createUser(myScanner);
                    System.out.println(" ");
                break;
                case "2":
                    createEvent(myScanner);
                    System.out.println(" ");
                break;
                case "3":
                    checkQuota();
                    System.out.println(" ");
                break;
                case "4":
                    checkMember();
                    System.out.println(" ");
                break;
                case "5":
                    createTicket(myScanner);
                    System.out.println(" ");
                break;
                case "6":
                    purchasedTicket();
                    System.out.println(" ");
                break;
                default:
                    break;
            }
        } while (userChoice.equals("1") || userChoice.equals("2") || userChoice.equals("3") || userChoice.equals("4") || userChoice.equals("5") || userChoice.equals("6"));
        
    }

    public static void createUser(Scanner myScanner){
        System.out.println("Create User ");
        System.out.print("Input user name : ");
        
        User newUser= new User(myScanner.nextLine());
        System.out.println("Hello, user " + newUser.getUserName() + " created!");
        userList.add(newUser);
         
        System.out.print("Create another User? (press y to continue) : ");
        if(myScanner.nextLine().equals("y")){
            createUser(myScanner);
        }
    }

    public static void createEvent(Scanner myScanner){
        System.out.println("Create Event ");
        System.out.print("Input event name : ");
        String eventName = myScanner.nextLine();
        System.out.print("How much quota? : ");
        int eventQuota = myScanner.nextInt();
        myScanner.nextLine();
        Event newEvent = new Event(eventName, eventQuota);

        System.out.println("Event " + newEvent.getEventName() + " with " + newEvent.getEventQuota() + " quota created!");
        eventList.add(newEvent);

        System.out.print("Create another Event? (press y to continue) : ");
        if(myScanner.nextLine().equals("y")){
            createEvent(myScanner);
        }
    }

    public static void checkQuota(){
        int eventId = 0;
        for (Event event : eventList) {
            eventId += 1;
            System.out.println(eventId + ". " + event.getEventName()+ " have "+event.getEventQuota()+" quota left");
        }
    }

    public static void checkMember(){
        int userId = 0;
        for (User user : userList) {
            userId += 1;
            System.out.println(userId + ". " + user.getUserName());
        }
    }

    public static void purchasedTicket(){
        int ticketId = 0;
        for (Ticket ticket : ticketList) {
            ticketId += 1;
            System.out.println(ticketId + ". " + ticket.getTicketUser().getUserName() + " buy a ticket for " + ticket.getTicketEvent().getEventName());
        }
    }

    public static void createTicket(Scanner myScanner){
        System.out.println("Buy Ticket ");
        
        System.out.println("Who this ticket for ?");
        checkMember();
        System.out.println(" ");
        System.out.print("Type the user number to choose : ");
        int userId = myScanner.nextInt()-1;
        System.out.println(" ");
        
        System.out.println("Which event ?");

        int eventId = 0;
        do {
            checkQuota();
            System.out.println(" ");
            System.out.print("Type the event number to choose : ");
            eventId = myScanner.nextInt()-1;
            if(eventList.get(eventId).getEventQuota() == 0){
                System.out.println("The event has no more quota, choose another event");
                System.out.println(" ");
            }
        } while (eventList.get(eventId).getEventQuota() == 0);
        

        Ticket newTicket = new Ticket(eventList.get(eventId), userList.get(userId));
        ticketList.add(newTicket);

        myScanner.nextLine();
        System.out.println(" ");
        System.out.println(newTicket.getTicketUser().getUserName() + " buy a ticket for "+ newTicket.getTicketEvent().getEventName());
        System.out.print("Buy another ticket? (press y to continue) : ");
        if(myScanner.nextLine().equals("y")){
            createTicket(myScanner);
        }
    }

}
