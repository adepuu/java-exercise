package com.adepuu.exercises.session10;

public class Journal extends Shelf{
    Journal(String title, int stockAvability) {
        super(title, stockAvability);
    }

    @Override
    public String getItemType() {
        return "Journal ";
    }
}
