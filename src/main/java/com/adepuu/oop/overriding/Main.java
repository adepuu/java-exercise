package com.adepuu.oop.overriding;

public class Main {
    public static void main(String[] args) {
        Lobster lobster = new Lobster();
        lobster.eat();


        // Use eat() method from the Animal class since
        // Chiken class doesn't extend Animal
        Chiken chick = new Chiken();
        chick.basicEatingSound();
    }
}
