package com.adepuu.exercises.session10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private Auth auth;
    private MaterialList materialList;
    Menu(Scanner scanner, Auth auth, MaterialList materialList){
        this.scanner = scanner;
        this.auth = auth;
        this.materialList = materialList;
    }

    public void borrowScreen(){
        materialList.displayMaterialList(auth.userDetail());
    }
    public void returnScreen(){
        materialList.displayReturnList(auth.userDetail());
    }


    public void materialScreen(){
        int input = 0;
        System.out.println();
        System.out.println("----------------Library----------------");
        System.out.println("1. Borrow Materials");
        System.out.println("2. Return Materials");
        System.out.println("3. Exit");
        System.out.print("Choice : ");
        try{
            input= scanner.nextInt();
        }catch (InputMismatchException e){
            System.err.println("Please input the right value");
            materialScreen();
        }
        switch (input){
            case 1 -> borrowScreen();
            case 2 -> returnScreen();
            case 3 -> auth.logout();
        }
    }


    public void landingScreen(){
        int input = 0;
        System.out.println();
        System.out.println("----------------Library App----------------");
        System.out.println("1. Login");
        System.out.println("2. Register (For a new user)");
        System.out.println("3. Exit");
        System.out.print("Choice : ");

        input= scanner.nextInt();

        switch (input){
            case 1 -> loginPage();
            case 2 -> registerPage();
            case 3 -> System.out.println("exit");
        }
    }

    public void registerPage(){
        boolean register = false;
        String username,password;
        scanner.nextLine();
        while (!register){
            System.out.println();
            System.out.println("----------------Register----------------");
            System.out.print("Username \t : ");
            username = scanner.nextLine();
            System.out.print("Password \t : ");
            password = scanner.nextLine();
            register = auth.registerUser(username,password);
        }
    }

    public void loginPage(){
        String username,password;
        scanner.nextLine();
        System.out.println();
        System.out.println("----------------Login----------------");
        System.out.print("Username \t : ");
        username = scanner.nextLine();
        System.out.print("Password \t : ");
        password = scanner.nextLine();
        boolean isLogin = auth.userLogin(username,password);
        if (isLogin == true)
        {
            while (!auth.userDetail().isEmpty())
            {
                materialScreen();
            }
        }
    }
}
