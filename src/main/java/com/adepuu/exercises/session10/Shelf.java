package com.adepuu.exercises.session10;

public class Shelf {
    private String title;
    private int stockAvability;

    Shelf(String title, int stockAvability){
        this.title = title;
        this.stockAvability = stockAvability;
    }

    protected int getStockAvability() {
        return stockAvability;
    }

    protected String getTitle() {
        return title;
    }

    protected void setStockAvability(int stockAvability) {
        this.stockAvability = stockAvability;
    }

    protected void setTitle(String title) {
        this.title = title;
    }
    protected void borrowItem() {
        setStockAvability(getStockAvability() - 1);
        System.out.println(getItemType() + " '" + getTitle() + "' borrowed successfully.");
    }
    protected void returnItem() {
        setStockAvability(getStockAvability() + 1);
        System.out.println(getItemType() + " '" + getTitle() + "' returned successfully.");
    }
    protected String getItemType() {
        return "Item ";
    }


}
