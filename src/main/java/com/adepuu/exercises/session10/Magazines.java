package com.adepuu.exercises.session10;

public class Magazines extends Reading{
    private String printDate;

    public Magazines(int stock, String title, int pages, String printDate) {
        super(stock, title, pages);
        this.printDate = printDate;
    }

    @Override
    public void printStatus(){
        System.out.printf("This %s magazine was first printed at %s\n", this.title, this.printDate);
        super.printStatus();
    }
}
