package com.adepuu.exercises.session11.tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        System.out.println("Masukkan ingin berapa node");
        Scanner scanner = new Scanner(System.in);
        int inputan = scanner.nextInt();


        for(int i = 0; i < inputan; i++){

            System.out.println("Masukkan angka");
            int tampungan = scanner.nextInt();
            bt.insert(tampungan);
        }

        System.out.println("Angka berapa yang ingin kamu cari");
        int search = scanner.nextInt();

        System.out.println(bt.search(search));
        if(bt.search(search)){
            System.out.println("Data ditemukan");
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}

