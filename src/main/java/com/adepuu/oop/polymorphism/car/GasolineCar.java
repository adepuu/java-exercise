package com.adepuu.oop.polymorphism.car;

// Implement GasolineCar class
public class GasolineCar implements Car {
    @Override
    public void startEngine() {
        System.out.println("Starting gasoline engine...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping gasoline engine...");
    }

    @Override
    public void move() {
        System.out.println("Moving with gasoline engine...");
    }

    @Override
    public void reverse() {
        System.out.println("Reversing with gasoline engine...");
    }
}
