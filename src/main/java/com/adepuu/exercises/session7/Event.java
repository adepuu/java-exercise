package com.adepuu.exercises.session7;

public class Event {
    private String eventName;
    private int stock;
    private double price;
    private boolean isAvailable;

    public Event(String eventName, int stock, double price) {
        this.eventName = eventName;
        this.stock = stock;
        this.price = price;
        this.isAvailable = true;
    }

    public String getEventName() {
        return eventName;
    }

    public int getStock() {
        return stock;
    }

    public void stockAfterBooked() {
        this.stock -= 1;
    }

    public double getPrice() {
        return price;
    }
    public void setAvailable(int stock) {
        if (stock == 0) {
            this.isAvailable = false;
        }
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
