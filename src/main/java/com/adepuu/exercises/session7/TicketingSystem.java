package com.adepuu.exercises.session7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicketingSystem{
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


    public static void ticketUI(){
        System.out.println("============Welcome to our ticketing website============");
        System.out.println("1. Create New Ticket");
        System.out.println("2. Booking Ticket");
        System.out.println("3. Ticket that have been bought");
        System.out.println("4. Exit Program");

        System.out.print("Choice = ");
    }

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        Event tickets = new Event();
        tickets.createTicket("Avatar The Last Airbender", 2000000);
        tickets.createTicket("Hendry The Best", 2000000);
        boolean loop = false;
        while (!loop) {
            ticketUI();
            int choice = myInput.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    myInput.nextLine();
                    System.out.println("============Inserting new ticket============");
                    System.out.print("Ticket Name = ");
                    String name = myInput.nextLine();
                    System.out.print("Ticket Price = ");
                    int price = myInput.nextInt();
                    tickets.createTicket(name, price);
                    break;
                case 2:
                    System.out.println("============Booking Ticket============");
                    tickets.displayTicket();
                    myInput.nextLine();
                    System.out.print("Choice = ");
                    String buyTicket = myInput.nextLine();
                    tickets.ticketValidation(buyTicket);
                    break;
                case 3:
                    System.out.println("============Hold Ticket============");
                    tickets.getUserTicket();
                    break;
                case 4:
                    myInput.close();
                    loop = true;
                    break;
                default:
                    System.err.println("Please input correctly");
                    System.out.println();
                    System.out.println();
                    break;
            }
        }
    }
}