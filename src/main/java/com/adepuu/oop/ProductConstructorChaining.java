package com.adepuu.oop;

public class ProductConstructorChaining {
    public static void main(String[] args) {
        // Creating objects using different constructors
        Product prod1 = new Product(); // Uses the default constructor
        Product prod2 = new Product("Laptop"); // Uses the constructor with one parameter
        Product prod3 = new Product("Smartphone", 500); // Uses the constructor with two parameters

        // Displaying product details
        System.out.println("Product 1: " + prod1.name + ", Price: " + prod1.price);
        System.out.println("Product 2: " + prod2.name + ", Price: " + prod2.price);
        System.out.println("Product 3: " + prod3.name + ", Price: " + prod3.price);
    }
}
class Product {
    String name;
    int price;

    // Default constructor
    Product() {
        this("Default Product"); // Calls the constructor with one parameter
    }

    // Constructor with one parameter
    Product(String name) {
        this(name, 0); // Calls the constructor with two parameters
    }

    // Constructor with two parameters
    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
