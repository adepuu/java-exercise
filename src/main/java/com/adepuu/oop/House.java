package com.adepuu.oop;

public class House {
    // Instance variables
    private String address;
    private final int numberOfRooms;
    private boolean hasGarage = true;

    // Constructor to initialize the instance variables
    public House(String address, int numberOfRooms, boolean hasGarage) {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.hasGarage = hasGarage;
    }

    public House(String address, int numberOfRooms) {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
    }

    // Instance method to print house details
    public void printDetails() {
        System.out.println("Address: " + address);
        System.out.println("Number of Rooms: " + numberOfRooms);
        System.out.println("Has Garage: " + (hasGarage ? "Yes" : "No"));
    }


    // Setter method
    public boolean updateAddress(String newAddress) {
        if (newAddress.isEmpty()) return false;

        this.address = newAddress;
        return true;
    }

    // Getter method
    public String getHouseAddress() {
        return this.address;
    }
}
