package com.adepuu.exercises.session10.Book.Category;
import com.adepuu.exercises.session10.Book.Book;

public class Tabloid extends Book{

    private double price;

    public Tabloid(int availability, String name, double price) {
        super(availability, name);
        this.price = price;

        System.out.println("Added Tabloid " + super.getName()+ " can be borrowed or purchase for " + this.getPrice() + " for " + super.getAvailability() + " pcs");
    }

    public double getPrice() {
        return price;
    }

    public void buy(String buyer){
        super.setAvailability(super.getAvailability() - 1);
        System.out.println(buyer + " buying Tabloid " + super.getName() + " for " + this.getPrice() + ". '" +this.getName() + "' stock now is " + this.getAvailability() + " and " + ((this.isAvailability()) ? "still can be borrowed or purchased" : "can't be borrowed or purchased anymore"));
    }
}