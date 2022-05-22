package com.company;
// java import
import java.util.Scanner; // Scanner API class

public class List5_3 {
    public static void main(String[] args) {

        System.out.print("What's the password?");

        Scanner keyboard= new Scanner(System.in); // Scanner compound reference
        String pass = keyboard.next(); // take user input

        System.out.println("You typed >>" + pass + "<<");
        System.out.println();

        // if else statement
        if (pass == "swordfish") {
            System.out.println("The word you typed is stored");
            System.out.println("in the same place as the real");
            System.out.println("password. You must a");
            System.out.println("hacker");
        } else {
            System.out.println("The word you typed is not");
            System.out.println("stored in the same place as");
            System.out.println("the real password, but that's");
            System.out.println("no big deal.");
        }
        System.out.println();

        // if else statement
        if(pass.equals("swordfish")) {
            System.out.println("The word you typed has the");
            System.out.println("same characters as the real");
            System.out.println("password. You can use our");
            System.out.println("precious system");
        } else {
            System.out.println("The word you typed doesn't");
            System.out.println("have the same characters as");
            System.out.println("the real password. YOu can't");
            System.out.println("use our precious system");
        }

        keyboard.close(); // separate the connection between the keyboard and the user
    }
}
