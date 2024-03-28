package com.adepuu.exercises.session7;

import com.github.javafaker.Faker;

public class StringUtil {

    public static String generateName() {
        Faker faker = new Faker();
        return faker.name().fullName();
    }
}
