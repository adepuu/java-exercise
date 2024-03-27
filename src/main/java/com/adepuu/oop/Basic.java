package com.adepuu.oop;

public class Basic {
    public static void main(String[] args) {
        // Creating instances of the House class
        House myHouse = new House("123 Main St", 4, true);
//        House neighborsHouse = new House("456 Elm St", 3, false);
//        House exHouse = new House("455556 Elmoo St", 3);

//        // Calling instance methods on objects
//        myHouse.printDetails();
//        neighborsHouse.printDetails();
//        exHouse.printDetails();
        var updateResult = myHouse.updateAddress("New Address 2");
        if (updateResult) {
            System.out.println("Update success");
        }
        System.out.println(myHouse.getHouseAddress());
        updateResult = myHouse.updateAddress("");
        if (updateResult) {
            System.out.println("Update success");
        }
        System.out.println(myHouse.getHouseAddress());

    }
}
