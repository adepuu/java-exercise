package com.adepuu.exercises.session6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


class EmptyFileException extends Exception
{
    public EmptyFileException(String message)
    {
        super(message);
    }
}
public class Exercise2{

    /**
     * Complete the file reader program below
     * and handle all edge cases using try-catch-finally based on the logic given
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        readFileContents(fileName);
        scanner.close();
    }

    static void readFileContents(String fileName){
        BufferedReader reader = null;
        try
        {
            reader = new BufferedReader(new FileReader(fileName));
        }
        catch(FileNotFoundException e){
            System.err.println("\u001B[31m" +"File is not found: " + e.getMessage() + "\u001B[0m");
            main(new String[0]);
        }
        finally
        {
            try
            {
                if(reader.readLine() == null){
                    throw new EmptyFileException("File is empty!");
                }
                String line;
                while ((line = reader.readLine()) != null)
                {
                    System.out.println(line);
                }
            }catch (EmptyFileException e){
                System.out.println(e.getMessage());
                System.out.println();
                main(new String[0]);
            }catch (IOException e){
                System.out.println("File is empty");
            }
        }
        System.out.println();
        System.out.println("\u001B[32m"  + "Looping is done" + "\u001B[0m");
    }
}

