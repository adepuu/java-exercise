package com.adepuu.exercises.session4;

import java.util.stream.IntStream;

public class Exercise4Stream {
    public static void main(String[] args) {
        int limit = 100; // Define the limit for the FizzBuzz

        IntStream.rangeClosed(1, limit)
                .mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : i))
                .forEach(System.out::println);
    }
}
