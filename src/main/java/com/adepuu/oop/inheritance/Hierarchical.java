package com.adepuu.oop.inheritance;

class Cat extends Animal {
    void purr() {
        System.out.println("purr");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Cat cat  = new Cat();
        cat.purr();
        cat.eat();

        Dog dog = new Dog();
        dog.bark();
        dog.eat();
    }
}
