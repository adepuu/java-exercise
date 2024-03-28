package com.adepuu.exercises.session8;

public class MenuHelper {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
