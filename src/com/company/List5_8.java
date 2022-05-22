package com.company;
// import
import java.util.Scanner;

public class List5_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // declare class and variable scanner
        System.out.print("Which verse (one, two or three)? ");
        String verse = sc.next(); // taking user input

        switch(verse) { // switch with string
            case "one":
                System.out.println("That's because he has no brain.");
                break;
            case "two":
                System.out.println("That's because he is a pain.");
                break;
            case "three":
                System.out.println("Cause this is the last refrain.");
                break;
            default:
                System.out.println("No such verse. Please try again.");
                break;
        }

        System.out.println("Ohhhhhhh... .");


        sc.close();
    }
}
