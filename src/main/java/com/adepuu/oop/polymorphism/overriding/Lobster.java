package com.adepuu.oop.polymorphism.overriding;

interface Animal {
    void eat();
}
public class Lobster implements Animal {
    @Override
    public void eat() {
        System.out.println("Slurp slurp");
    }

    public static void main(String[] args) {
        Lobster lobster = new Lobster();
        lobster.eat();
    }
}


