package com.company;
//import
import java.util.Scanner; // scanner for user input

public class List5_6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // declare the class scanner and variable
        System.out.print("Which verse? ");
        int verse = keyboard.nextInt(); // take the user input

        switch (verse) { // switch statement
            case 1:
                System.out.println("That's because he has no brain.");
                break;
            case 2:
                System.out.println("That's because he is a pain");
                break;
            case 3:
                System.out.println("'Cause this is the last refrain");
                break;
            default:
                System.out.println("No such verse. Please try again.");
                break;
        }

        System.out.println("Ohhhhhhh ... .");

        keyboard.close(); // close the scanner
    }
}
