package com.adepuu.oop.inheritance;

class Bird {
    void fly() {
        System.out.println("I am a Bird");
    }
}
// Inheriting class Bird
class Parrot extends Bird {
    void whatColourAmI() {
        System.out.println("I am green!");
    }
}
// Inheriting class Parrot
class SingingParrot extends Parrot {
    void whatCanISing() {
        System.out.println("I can sing Opera!");
    }
}
public class MultiLevel {
    public static void main(String args[]) {
        SingingParrot obj = new SingingParrot();
        obj.whatCanISing();
        obj.whatColourAmI();
        obj.fly();
    }
}