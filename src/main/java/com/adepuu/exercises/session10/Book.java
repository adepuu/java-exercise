package com.adepuu.exercises.session10;

public class Book extends Shelf{
    Book(String title, int stockAvability) {
        super(title, stockAvability);
    }

    @Override
    public String getItemType() {
        return "Book ";
    }

}
