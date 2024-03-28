package com.adepuu.exercises.session7;

import com.adepuu.exercises.session7.Event;
import com.adepuu.exercises.session7.User;
import com.adepuu.exercises.session7.Ticket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

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

        // Create an event
        System.out.println("Enter event name: ");
        String eventName = scanner.nextLine();
        System.out.println("Enter ticket quota: ");
        int ticketQuota = scanner.nextInt();
        Event event = new Event(ticketQuota);

        // Create users
        List<User> users = new ArrayList<>();
        System.out.println("Enter number of users: ");
        int numUsers = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        for (int i = 0; i < numUsers; i++) {
            System.out.println("Enter user name for user " + (i + 1) + ": ");
            String userName = scanner.nextLine();
            users.add(new User(UUID.randomUUID().toString(), userName));
        }

        // Buy tickets for each user
        for (User user : users) {
            int quantity;
            while (true) {
                System.out.println("Enter number of tickets to buy for user " + user.getUserName() + ": ");
                quantity = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
                if (quantity > event.getTicketAvailability()) {
                    System.out.println("The ticket only has " + event.getTicketAvailability() + ", please buy the ticket based on the current quota.");
                } else {
                    event.sellTicket(quantity);
                    for (int i = 0; i < quantity - 1; i++) {
                        event.sellTicket(quantity);
                    }
                    break;
                }
            }
            for (int i = 0; i < quantity; i++) {
                Ticket ticket = new Ticket(event.getEventId(), eventName);
                user.buyTicket(ticket, quantity);
            }
        }

        // Check ticket validity for each user
        for (User user : users) {
            System.out.println("Tickets bought by " + user.getUserName() + ":");
            for (Ticket ticket : user.getTicketsBought()) {
                System.out.println("Ticket ID: " + ticket.getTicketId() + ", Event: " + ticket.getEventName());
            }

            System.out.println("Do you want to check your ticket validity, " + user.getUserName() + "? (yes/no)");
            String checkTicketOption = scanner.nextLine();
            if (checkTicketOption.equalsIgnoreCase("yes")) {
                System.out.println("Enter ticket ID: ");
                String ticketId = scanner.nextLine();
                user.checkTicket(ticketId);
            }
        }

        scanner.close();
    }
}
