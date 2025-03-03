package com.adepuu.exercises.session10;

class RegularMember extends Member {

    public RegularMember(String name, String memberId) {
        super(name, memberId);
    }

    @Override
    public void borrowItem(Shelf item) {
        if(item.getStockAvability() > 1){
            System.out.println("Member Name : " + super.getName());
            System.out.println("Member ID : " + super.getMemberId());
            item.borrowItem();
            System.out.println("Upgrade to Premium member to get kuki point");
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
        System.out.println("Thank you for returning " + item.getItemType() + super.getName() + " you got 10 kuki point");
        System.out.println(" ");
    }
}
