package com.adepuu.exercises.session10;

public class DVD extends Material implements Borrowable{
    private int duration;
    public DVD(String title, String author, int stock, int duration) {
        super(title, author, stock);
        this.duration = duration;
    }

    @Override
    public void borrowItem() {
        if(getStock() > 0) {
            System.out.println("DVD " + getTitle() + " has been borrowed");
            setStock(getStock() - 1);
        } else {
            System.out.println("DVD " + getTitle() + " out of stock");
        }
    }
}
