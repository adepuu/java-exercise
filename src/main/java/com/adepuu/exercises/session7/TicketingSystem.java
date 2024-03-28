package com.adepuu.exercises.session7;
import java.util.*;

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
    /*
<<<<<<< HEAD
        private static ArrayList<User> userList = new ArrayList<>();
        private static ArrayList<Event> eventList = new ArrayList<>();
        private static ArrayList<Ticket> ticketList = new ArrayList<>();
=======
     */
    public static void main(String[] args) {
        int maxTicket = 10;

        // User book ticket for an event
        Event event = new Event(maxTicket);

        for (int i = 0; i < 15; i++) {
            User user = new User(StringUtil.generateName());

            // User book ticket for an event
            var bookingStatus = event.bookTicket(user.getID());
            if (bookingStatus) {
                var confirmedTicket = event.confirmTicket(user.getID());
                if (confirmedTicket != null) {
                    user.saveTicket(confirmedTicket);
                }
            }

            var accuiredTicket = user.getTicket();
            if (accuiredTicket != null) {
                System.out.println(user.getName() + "   Ticket ID: " + accuiredTicket.getID() + "   Event ID: " + accuiredTicket.getEventID());
            }
        }

        /*
>>>>>>> main

        public static void main(String[] args) {
            System.out.println("Welcome to Event Ticketing System!");

            User user1 = new User("Alice");
            User user2 = new User("Bob");
            userList.add(user1);
            userList.add(user2);

            Event event1 = new Event("Concert", 2);
            Event event2 = new Event("Theater Show", 1);
            eventList.add(event1);
            eventList.add(event2);

            bookTicket(user1, event1);
            bookTicket(user2, event2);

            checkQuota();
        }

        public static void bookTicket(User user, Event event) {
            if (event.getEventQuota() > 0) {
                Ticket newTicket = new Ticket(event, user);
                ticketList.add(newTicket);
                event.someoneBuy();
                System.out.println(user.getUserName() + " bought a ticket for " + event.getEventName());
            } else {
                System.out.println("No more quota available for event: " + event.getEventName());
            }
        }

        public static void checkQuota() {
            System.out.println("Current Event Quotas:");
            for (Event event : eventList) {
                System.out.println(event.getEventName() + " has " + event.getEventQuota() + " quota left");
            }
         */

    }
}

