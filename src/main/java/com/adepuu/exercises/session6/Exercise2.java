//package com.adepuu.exercises.session6;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//
//public class Exercise2 {
//    /**
//     * Complete the file reader program below
//     * and handle all edge cases using try-catch-finally based on the logic given
//     */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the file name: ");
//        String fileName = scanner.nextLine();
//        readFileContents(fileName);
//        scanner.close();
//    }
//
//    static void readFileContents(String fileName) {
//        BufferedReader reader = null;
//        reader = new BufferedReader(new FileReader(fileName));
//        String line;
//        while ((line = reader.readLine()) != null) {
//            System.out.println(line);
//        }
//    }
//}
