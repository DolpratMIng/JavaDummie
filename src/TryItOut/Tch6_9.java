package TryItOut;

import java.util.Random;
import java.util.Scanner;

public class Tch6_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // declare scanner class and variable

        int numGuesses = 0; // int variable
        int randomNumber = new Random().nextInt(10) + 1; // generate random number

        System.out.println("      ************        ");
        System.out.println("Welcome to the Guessing Game");
        System.out.println("      ************        ");
        System.out.println();

        // ask for user input
        System.out.print("enter an int from 1 to 10: ");
        int inputNumber = sc.nextInt();
        numGuesses++; // number of guess for the first time.

        // do while statement
        do {
            System.out.println();
            System.out.println("Try again...");
            System.out.print("Enter an int from 1 to 10: ");
            inputNumber = sc.nextInt();
            numGuesses++;
        } while(inputNumber != randomNumber);

        System.out.print("You win after ");
        System.out.println(numGuesses + " guesses.");

        sc.close();
    }
}
