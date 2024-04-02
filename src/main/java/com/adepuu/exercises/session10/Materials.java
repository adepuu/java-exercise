package com.adepuu.exercises.session10;

import java.util.Date;

abstract class Materials {
    protected String title;
    protected String type;
    protected String user;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    protected int stock;

    public Materials(){}

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Materials(String title, int stock) {
        this.title = title;
        this.stock = stock;
        this.user = "";
    }

    public String getTitle() {
        return title;
    }


    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    abstract boolean borrowMaterial();

    abstract void borrowMaterial(String activeUser);

    abstract void returnMaterial();

}
