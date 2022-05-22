package com.company;

import java.util.Scanner; // import scanner for user input
import java.util.Random; // importing random for generate random number

public class List5_1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // class scanner // keyboard variable
        System.out.print("Enter an int from 1 to 10: ");
        int inputNumber = keyboard.nextInt(); // user input

        int randomNumber = new Random().nextInt(10) + 1; // variable randomNumber for random number

        if(inputNumber == randomNumber) { // if/else statement
            System.out.println("**********");
            System.out.println("*You win.*");
            System.out.println("**********");
        } else {
            System.out.println("You lose.");
            System.out.print("The random number was ");
            System.out.println(randomNumber + ".");
        }
    }
}
