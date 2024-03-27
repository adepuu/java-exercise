package com.adepuu.exercises.session7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ticket {
    private String eventName;
    private String ticketId;

    private double price;
    private static int stock;
    private boolean isBooked;
    private static final int ID_LENGTH = 5;
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public Ticket(String ticketId, String eventName, double price, boolean isBooked) {
        this.ticketId = ticketId;
        this.eventName = eventName;
        this.price = price;
        this.isBooked = false;
    }

    public static int getTicketStock(){
        return stock;
    }

    public double getTicketPrice(){
        return this.price;
    }

    static String getUniqueId() {
        Random random = new Random();
        StringBuilder uniqueId = new StringBuilder();
        for (int i = 0; i < ID_LENGTH; i++) {
            int index = random.nextInt(CHARACTERS.length());
            uniqueId.append(CHARACTERS.charAt(index));
        }
        return uniqueId.toString();
    }
    public static List<Ticket> createTickets(String eventName, double price, int stock) {
        List<Ticket> tickets = new ArrayList<>();
        for (int i = 0; i < stock; i++) {
            tickets.add(new Ticket( getUniqueId(), eventName, price, false ));
        }
        return tickets;
    }



    public String printDetails() {
        return "Ticket : " + eventName + "Price : " + price;
    }


    public String getTicketId() {
        return ticketId;
    }
}
