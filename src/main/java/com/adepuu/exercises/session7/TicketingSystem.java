package com.adepuu.exercises.session7;

import java.util.ArrayList;
import java.util.List;
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
        Scanner input = new Scanner(System.in);
        BookingSystem bookingSystem = new BookingSystem();

        // Event creation
        bookingSystem.createEvent("TI 2024", 50,20.0);
        bookingSystem.createEvent("Java Jazz 2024", 40, 25.0);
        bookingSystem.createEvent("WC Final 2024", 50, 30.0);

        List<String> events = bookingSystem.getEventList();

        System.out.println("Welcome to our booking system!");
        System.out.print("Please enter your name: ");

        String username = input.nextLine();

        System.out.println("Events list");
        System.out.println("====================");
        for (int i = 0; i < events.size(); i++) {
            System.out.println((i + 1) + " " + events.get(i));
        }
        System.out.println("====================");
        System.out.println("Which event you want to attend? Please enter the event name");

        String userEvent = input.nextLine();

        System.out.println("====================");
        System.out.println("Please enter the amount you paid: ");
        double amountPaid = input.nextDouble();
        input.nextLine();

        // Booking ticket
        bookingSystem.bookTicket(userEvent, amountPaid, username);

        // Get booking confirmation
        System.out.println("================");
        System.out.println("So you want to print your booking confirmation? (y/n)");
        String choice = input.nextLine();
        if (choice.equals("y")) {
            System.out.println("================");
            System.out.println("Here is your booking confirmation");
            bookingSystem.bookedTicketStatus(username);
            System.out.println("Thank you and have a nice day!");
        } else {
            System.out.println("Thank you and have a nice day!");
        }
        input.close();
    }
}

