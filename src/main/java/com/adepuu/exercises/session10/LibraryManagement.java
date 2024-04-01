package com.adepuu.exercises.session10;

import java.util.HashMap;
import java.util.Map;

public class LibraryManagement {
    /**
     * Acceptance Criteria:
     * - Each material should have an availability count, and the program should check if the material is still available for borrowing.
     * - The program should demonstrate polymorphism by allowing operations (borrow, return) to be performed on any type of library material through a single method.
     * - The program should include methods to borrow and return materials.
     * - The program should keep track of the available and borrowed materials.
     * - The program should print out the status of materials (available, borrowed) and the actions performed (borrow, return).
     *
     * Notes:
     * - The program doesn't require a menu system; focus should be on Object-Oriented Programming (OOP) and inheritance implementation.
     * - Make sure to implement Inheritance and Polymorphism properly
     */
    private Map<String, Shelf> shelfMap;
    private Map<String, Member> members;

    LibraryManagement(){
        shelfMap = new HashMap<>();
        members = new HashMap<>();
    }

    private void addShelfItem(String title, Shelf item){
        shelfMap.put(title, item);
    }
    private void addMember (String name, Member member){
        members.put(name, member);
    }
    protected Member getMember(String name) {
        return members.get(name);
    }
    protected Shelf getShelfItem(String name){
        return shelfMap.get(name);
    }
    public void printStock() {
        System.out.println("Welcome to Kuki Library choose item below:");
        for (Map.Entry<String, Shelf> entry : shelfMap.entrySet()) {
            Shelf shelf = entry.getValue();
            System.out.println("- " + shelf.getTitle() + ": " + shelf.getStockAvability() + " available");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        LibraryManagement library = new LibraryManagement();
        library.addShelfItem("How to get rich without effort", new Book("How to get rich without effort", 2));
        library.addShelfItem("The opera van java: A Journal of Nonsense and Fun", new Journal("The opera van java: A Journal of Nonsense and Fun", 5));

        library.addMember("Kurniawan", new PremiumMember("Kurniawan"));
        library.addMember("RegulerPerson", new RegularMember("RegularPerson", "regularMemberId"));

        library.printStock();

        Member kurniawan = library.getMember("Kurniawan");
        Member siRegular = library.getMember("RegulerPerson");

        kurniawan.borrowItem(library.getShelfItem("The opera van java: A Journal of Nonsense and Fun"));
        siRegular.borrowItem(library.getShelfItem("How to get rich without effort"));
        library.printStock();

        kurniawan.returnItem(library.getShelfItem("The opera van java: A Journal of Nonsense and Fun"));
        library.printStock();
    }
}
