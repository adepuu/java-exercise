package com.adepuu.oop.polymorphism.car;

// Main class to demonstrate polymorphism
public class Main {
    public static void main(String[] args) {
        Car gasolineCar = new GasolineCar();
        Car electricCar = new ElectricCar();

        // Demonstrate polymorphism by treating objects of different types as Car
        gasolineCar.startEngine();
        gasolineCar.move();
        gasolineCar.stopEngine();
        gasolineCar.reverse();

        System.out.println();

        electricCar.startEngine();
        electricCar.move();
        electricCar.stopEngine();
        electricCar.reverse();
    }
}
