package com.adepuu.exercises.session10;

import java.util.UUID;

public class Member {
    private String name;
    private String memberId;

    Member(String name) {
        this.memberId = UUID.randomUUID().toString();
        this.name = name;
    }

    Member(String name, String memberId) {
        this.memberId = memberId;
        this.name = name;
    }

    protected String getName() {
        return name;
    }
    protected String getMemberId(){
        return memberId;
    }

    public void borrowItem(Shelf item){

    }
    public void returnItem(Shelf item){

    }
}
