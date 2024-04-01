package com.adepuu.oop.inheritance;

public class SuperKeyword {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.printAge();
    }
}

class Person {
    protected int age = 10;
    Person() {
        System.out.println("Person is created");
    }
}

class Employee extends Person {
    Employee() {
        super(); // Calls Person's constructor
        System.out.println("Employee is created");
    }

    public void printAge() {
        System.out.println(super.age);
    }
}
