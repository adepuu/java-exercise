package com.adepuu.oop.inheritance;

class Animal {
    void eat() {
        System.out.println("nom nom");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("woof!");
    }
}

public class Basic {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
    }
}