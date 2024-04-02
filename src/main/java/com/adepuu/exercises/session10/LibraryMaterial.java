package com.adepuu.exercises.session10;

public class LibraryMaterial {
    private String tittle;
    private int qty;
    private int borrowedqty;
    private boolean availibility;

    public LibraryMaterial(String tittle, int qty){
        this.tittle = tittle;
        this.qty = qty;
        this.borrowedqty = 0;
        this.availibility = true;
    }

    public String getTittle(){
        return tittle;
    }

    public int getQty(){
        return qty;
    }

    public int getBorrowedqty(){
        return borrowedqty;
    }

    public void materialStock(){
        System.out.println("Available Stock "+tittle+" :" +qty);
        System.out.println("Borrowed qty "+tittle+" :" +borrowedqty);
        System.out.println("----------------------------------------");
    }

    public void borrow(){
        if(qty > 0){
            qty--;
            borrowedqty++;
        }
        materialStock();
    }

    public void returnMaterial(){
        if(borrowedqty> 0){
            qty++;
            borrowedqty--;
        }
        materialStock();
    }

    public boolean isAvailable() {
        return availibility;
    }

    public void setAvailable(boolean availibility) {
        this.availibility = availibility;
    }
}
