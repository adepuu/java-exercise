package com.adepuu.exercises.session7;

import java.util.*;

import static com.adepuu.exercises.session7.Ticket.getUniqueId;

public class TicketingSystem {
    private static Map<String, List<Ticket>> ticketMap = new HashMap<>();
    private static User costumer = new User();
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
    private static void mainMenu(){
        System.out.println("Welcome to Kuki Ticketing System");
        System.out.println(" ");
        System.out.println("=================================");
        System.out.println("Choose number below : ");
        System.out.println("1. Create Ticket");
        System.out.println("2. List Ticket");
        System.out.println("3. Order Ticket");
        System.out.println("4. My Ticket");
    }

    private static String isContinue(){
        Scanner input = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("=================================");
        System.out.println("Press y to main menu");
        System.out.println("Press any to exit");
        System.out.print("Your input : ");
        return input.nextLine();
    }

    private static int chooseMenu(){
        int index = 1;
        for (Map.Entry<String, List<Ticket>> ticket : ticketMap.entrySet()) {
            System.out.println(index + ". Event Name: " + ticket.getKey());
            List<Ticket> eventTickets = ticket.getValue();
            System.out.println(" Price: " + eventTickets.getFirst().getTicketPrice());
            index++;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose an event (1-" + (index - 1) + "): ");
        int selectedEventIndex = scanner.nextInt();

        if (selectedEventIndex >= 1 && selectedEventIndex < index) {
            String selectedEventName = null;
            int i = 1;
            for (Map.Entry<String, List<Ticket>> ticket : ticketMap.entrySet()) {
                if (i == selectedEventIndex) {
                    selectedEventName = ticket.getKey();
                    break;
                }
                i++;
            }

            if (selectedEventName != null) {
                System.out.println("You selected event: " + selectedEventName);
            } else {
                System.out.println("Invalid selection.");
            }
        } else {
            System.out.println("Invalid selection.");
        }
        return selectedEventIndex;
    }

    private static Ticket selectAndRemoveTicket(int selectedEventIndex) {
        int index = 1;
        String selectedEventName = null;
        Ticket selectedTicket = null;

        for (Map.Entry<String, List<Ticket>> ticket : ticketMap.entrySet()) {
            if (index == selectedEventIndex) {
                selectedEventName = ticket.getKey();
                break;
            }
            index++;
        }

        if (selectedEventName != null) {
            List<Ticket> eventTickets = ticketMap.get(selectedEventName);
            if (!eventTickets.isEmpty()) {

                selectedTicket = eventTickets.removeLast();
                System.out.println("You selected event: " + selectedEventName);
                System.out.println("Your ticket ID: " + selectedTicket.getTicketId());
            } else {
                System.out.println("No tickets available for the selected event.");
            }
        } else {
            System.out.println("Invalid selection.");
        }
        return selectedTicket;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        do{
            mainMenu();
            System.out.print("Your input : ");

            int choose = input.nextInt();
            input.nextLine();
            System.out.println("=================================");

            switch (choose){
                case 1:
                    System.out.println("Create Ticket");
                    System.out.print("Please input event name : ");
                    String eventNameInput = input.nextLine();
                    System.out.print("Please input price : ");
                    double priceInput = Double.parseDouble(input.nextLine());
                    System.out.print("Please input stock : ");
                    int stockInput = input.nextInt();
                    List<Ticket> tickets = Ticket.createTickets(eventNameInput, priceInput, stockInput);
                    ticketMap.put(eventNameInput, tickets);
                    System.out.println("Tickets created successfully for event: " + eventNameInput);
                    break;
                case 2:
                    System.out.println("List Ticket" );
                    for (Map.Entry<String, List<Ticket>> ticket : ticketMap.entrySet()) {
                        System.out.print("Event Name: " + ticket.getKey());
                        List<Ticket> eventTickets = ticket.getValue();
                        System.out.print("  Price: " + eventTickets.getFirst().getTicketPrice());
                        System.out.print("  Stock: " + eventTickets.size());
                        System.out.println(" ");
                    }

                    break;
                case 3:
                    System.out.println("Order Ticket" );
                    System.out.print("Please input your name : ");
                    String userNameInput = input.nextLine();
                    System.out.print("Please input your email : ");
                    String userEmailInput = input.nextLine();
                    costumer.setName(userNameInput);
                    costumer.setEmail(userEmailInput);
                    int selectEvent = chooseMenu();
                    Ticket selectedTicket = selectAndRemoveTicket(selectEvent);
                    costumer.setTicketId(selectedTicket.getTicketId());
                    System.out.println("Thank you");
                    break;
                case 4:
                    System.out.println("Check Order" );
                    costumer.printUserDetails();
                    break;

                default:
                    System.out.println("INVALID INPUT");
            }
        }while(isContinue().equalsIgnoreCase("y"));

        input.close();
    }

}

