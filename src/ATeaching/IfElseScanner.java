package ATeaching;


import java.util.Random;
import java.util.Scanner; // import Scanner package - API

public class IfElseScanner {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in); // Scanner object
        System.out.print("Enter an int from 1 to 10: ");
        int inputNumber = keyboard.nextInt(); // read the keyboard input
        int randomNumber = new Random().nextInt(10) + 1; // generate random number

        // if else
        if(inputNumber == randomNumber){
            System.out.println("You win.");
        } else{
            System.out.println("You lose.");
            System.out.println("the random number was " + randomNumber + ".");
        }

        System.out.println("Thank you for playing");
        keyboard.close(); // disconnect the program and keyboard

    }
}
