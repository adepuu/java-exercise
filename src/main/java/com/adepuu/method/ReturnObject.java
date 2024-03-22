package com.adepuu.method;

class Result {
    public int sum;
    public int product;
    public String name;

    public Result(int sum, int product, String name) {
        this.sum = sum;
        this.product = product;
        this.name = name;
    }
}

public class ReturnObject {
    public static Result calculate(int a, int b) {
        int sum = a + b;
        int product = a * b;
        return new Result(sum, product, "XYZ");
    }

    public static void main(String[] args) {
        Result result = calculate(5, 3);
        System.out.println("Sum: " + result.sum); // Output: Sum: 8
        System.out.println("Product: " + result.product); // Output: Product: 15
    }
}