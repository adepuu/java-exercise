package com.adepuu.oop.polymorphism.car;

// Implement ElectricCar class
public class ElectricCar implements Car {
    @Override
    public void startEngine() {
        System.out.println("Starting electric engine...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping electric engine...");
    }

    @Override
    public void move() {
        System.out.println("Moving with electric engine...");
    }

    @Override
    public void reverse() {
        System.out.println("Reversing with electric engine...");
    }
}
