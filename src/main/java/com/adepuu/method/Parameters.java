package com.adepuu.method;

public class Parameters {
    public static void main(String[] args) {
//        int number = 1;
//        increment(number);
//        System.out.println(number);

        // Pass by reference
        Person person = new Person("Tom");
        changeObject(person);
        System.out.println(person.getName()); // Outputs "Jerry"
    }
    // Method to add two numbers
//    static void increment(int number) {
//        number++;
//        System.out.println(number);
//    }
    static void changeObject(Person person) {
        person.setName("Jerry");
    }
}
