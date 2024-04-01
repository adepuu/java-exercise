package com.adepuu.oop.overriding;

public class Lobster extends Animal {
    @Override
    public void eat() {
        System.out.println("Slurp Slurp!");
    }

    @Override
    public void eat(String food) {
        System.out.println("Slurp Slurp!");
    }
}
