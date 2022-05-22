package com.company;
// import
import java.util.Scanner; // scanner API class for user input
import java.util.Random; // Random API class for generate random value

import static java.lang.System.*;

public class List5_2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(in); // scanner compound reference - connect to the user keyboard

        out.print("Enter an int from 1 to 10: ");

        int inputNumber = keyboard.nextInt(); // keyboard variable
        int randomNumber = new Random().nextInt(10) + 1; // generate random number

        // if statement
        if(inputNumber == randomNumber) {
            out.println("*You win.*");
        }

        out.println("That was a very good guess :-");
        out.print("The random number was ");
        out.println(randomNumber + ".");
        out.println("Thank you for playing.");

        keyboard.close();
    }
}
