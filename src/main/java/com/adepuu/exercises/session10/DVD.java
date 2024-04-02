package com.adepuu.exercises.session10;

import java.util.Date;

public class DVD extends Materials {



    public DVD(){}
    public DVD(String title,int stock){
        super(title,stock);
        this.type = "DVD";
    }

    @Override
    boolean borrowMaterial() {
        return false;
    }

    @Override
    void borrowMaterial(String activeUser) {
        if(getStock() > 0){
            setStock(getStock()-1);
            setUser(activeUser);
            System.out.println(getType() + " borrow Succesfully!!!");
            return;
        }
        System.err.println(getTitle() + " Out of stock!!");
        return;
    }

    @Override
    void returnMaterial() {
        setStock(getStock()+1);
        setUser("");
        System.out.println(getType() + " return Succesfully!!!");
    }

}
