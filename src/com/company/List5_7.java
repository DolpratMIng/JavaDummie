package com.company;
//import
import java.util.Scanner; // Scanner for user input

public class List5_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Declare class scanner and variable
        System.out.print("Which verse? "); //
        int verse = sc.nextInt(); // taking for user input

        switch(verse) { // switch statement with no break
            case 3:
                System.out.print("Last refrain, ");
                System.out.println("last refrain, ");
            case 2:
                System.out.print("He's a pain, ");
                System.out.println("he's a pain");
            case 1:
                System.out.print("Has no brain, ");
                System.out.println("has no brain, ");
        }

        System.out.println("in the rain, in the rain.");
        System.out.println("Ohhhhhh...");
        System.out.println();

        sc.close(); // close method
    }
}
