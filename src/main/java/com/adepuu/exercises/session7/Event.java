package com.adepuu.exercises.session7;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Event {
    private Ticket storeTicket;
    private List<Ticket> ticketList;
    Event(){
        ticketList = new ArrayList<>();
    }

    public void ticketValidation(String id){
        int count = 0;
        for(Ticket map:ticketList){
            if(!map.getTicketID().equals(id)){
                count++;
            }
        }
        if(count == 0){
            System.err.println("Ticket does not exist!");
            System.out.println();
        }
        count = 0;
        if(ticketList.size()-1 == 0){
            return;
        }

        for(Ticket book:ticketList){
            if(book.getTicketID().equals(id)){
                setStoreTicket(book.getEventName(), book.getPrice());
                ticketList.remove(count);
                break;
            }
            count++;
        }
    }
    public void createTicket(String name, int price){
        Ticket newTicket = new Ticket(UUID.randomUUID().toString(),name,price);
        ticketList.add(newTicket);
    }
    public void displayTicket(){
        System.out.println("Avalible Tickets : ");
        for(Ticket ticket:ticketList){
            System.out.println("ID   \t: " + ticket.getTicketID());
            System.out.println("name \t: " + ticket.getEventName());
            System.out.println("Price \t: " + ticket.getPrice());
            System.out.println();
        }
    }

    public void getUserTicket(){
        if(storeTicket == null){
            System.out.println("You do not have any ticket");
            System.out.println();
            return;
        }
        System.out.println("Ticket have been Buyed : ");
        System.out.println("ID   \t: " + storeTicket.getTicketID());
        System.out.println("name \t: " + storeTicket.getEventName());
        System.out.println("Price \t: " + storeTicket.getPrice());
        System.out.println();

    }

    public void setStoreTicket(String name, int price){
        storeTicket = new Ticket(UUID.randomUUID().toString(),name,price);
    }
}
