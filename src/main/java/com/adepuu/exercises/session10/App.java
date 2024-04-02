package com.adepuu.exercises.session10;

public class App {

    public static void main(String[] args) {
        LibraryManagement book = LibraryManagement.createBook(3, "Cara bikin jersey Timnas", 900);
        LibraryManagement magazine = LibraryManagement.createMagazine(0, "Erspo kocak", 90);

        book.getStatus();
        book.isBorrow();
        book.returnMaterial();
        book.getStatus();

        magazine.getStatus();
        magazine.isBorrow();
        magazine.returnMaterial();
        magazine.getStatus();
    }
}
