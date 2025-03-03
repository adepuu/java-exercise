package com.adepuu.exercises.session10;

class PremiumMember extends Member {

    public PremiumMember(String name) {
        super(name);
    }


    @Override
    public void borrowItem(Shelf item) {
        if(item.getStockAvability() > 1){
            System.out.println("Member Name : " + super.getName());
            System.out.println("Member ID : " + super.getMemberId());
            item.borrowItem();
            System.out.println("Congrats " + super.getName() + " you got 10 kuki point");
            System.out.println(" ");
        } else {
            System.out.println("Out of Stock");
            System.out.println(" ");
        }
    }
    @Override
    public void returnItem(Shelf item) {
        System.out.println("Member Name : " + super.getName());
        System.out.println("Member ID : " + super.getMemberId());
        item.returnItem();
        System.out.println("Thank you for returning " + item.getItemType() + super.getName() + " you got 20 kuki point");
        System.out.println(" ");
    }
}
