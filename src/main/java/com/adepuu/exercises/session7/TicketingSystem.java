package com.adepuu.exercises.session7;

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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // creating tickets
        Ticket ticket1 = new Ticket("QW12345",1000000.00);
        Ticket ticket2 = new Ticket("QW67891",1300000.00);
        Ticket ticket3 = new Ticket("QW11123",1500000.00);
        Ticket ticket4 = new Ticket("ST12345",1800000.00);
        Ticket ticket5 = new Ticket("ST67891",2000000.00);

        // creating events and adding tickets
        Event event1 = new Event("Quran Week");
        event1.addTicket(ticket1);
        event1.addTicket(ticket2);
        event1.addTicket(ticket3);

        Event event2 = new Event("Story Night");
        event2.addTicket(ticket4);
        event2.addTicket(ticket5);

        // welcoming the user
        System.out.println("Welcome to the Bayyinah ticketing system!");

        // creating user account
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        User user = new User(userName);

        // displaying events
        System.out.println("Upcoming Events: ");
        System.out.println("1. " + event1.getEvent());
        System.out.println("2. " + event2.getEvent());

        // asking the user to choose an event
        System.out.print("Choose an event (1 or 2): ");
        int eventNumber = scanner.nextInt();
        scanner.nextLine();

        Event chosenEvent = (eventNumber == 1) ? event1 : event2;


        // displaying available tickets for the chosen event
        System.out.println("Available tickets for " + chosenEvent.getEvent() + " :");
        for (Ticket ticket : chosenEvent.getTickets()) {
            if (ticket.isAvailable()) {
                System.out.println("Ticket ID: " + ticket.getTicketId() + "\t Price: Rp" + ticket.getPrice());
            }
        }

        // asking the user to book a ticket
        System.out.print("Enter the ticket ID to book: ");
        String ticketId = scanner.next();

        Ticket chosenTicket = null;
        for (Ticket ticket : chosenEvent.getTickets()) {
            if (ticket.getTicketId().equals(ticketId) && ticket.isAvailable()) {
                chosenTicket = ticket;
                break;
            }
        }

        // confirming the ticket availability
        if (chosenTicket != null) {
            System.out.print("The ticket is available to buy. Do you want to proceed? (y/n): ");
            String confirmation = scanner.next();
            if (confirmation.equalsIgnoreCase("y")) {
                chosenTicket.setAvailability(false);
                user.addBoughtTicket(chosenTicket);
                System.out.println("Ticket purchased successfully!");
            } else {
                System.out.println("Ticket booking canceled.");
            }
        } else {
            System.out.println("The ticket you chose is unavailable.");
        }

        // displaying bought ticket to the user
        System.out.println("Tickets bought by " + user.getUserName() + ":");
        for (Ticket ticket : user.getBoughtTickets()) {
            System.out.println("Ticket ID: " + ticket.getTicketId() + "\t Price: Rp" + ticket.getPrice());
        }

    }

}
