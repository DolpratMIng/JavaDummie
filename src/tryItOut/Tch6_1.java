package tryItOut;
import java.util.Scanner; // Scanner API class
import java.util.Random;


public class Tch6_1 {
    public static void main(String[] args) {
        //
        int numGuessess = 0; // int number for counting
        int randomNumber = new Random().nextInt(100) + 1; // generate number from 1 to 100

        Scanner in = new Scanner(System.in); // Scanner compound reference
        System.out.print("Enter a number(from 1 to 100): "); // text for the user scanner
        int inputNumber = in.nextInt(); // take user input
        numGuessess++;

        // While loop to keep incorrect guesses repeating
        while(inputNumber != randomNumber) {
            System.out.println();

            // if else statement to indicate the guess number is higher or lower
            if(inputNumber<randomNumber){
                System.out.println("Try a higher number.");
            } else{
                System.out.println("Try a lower number.");
            }

            System.out.print("Enter an int from 1 to 100: ");
            inputNumber = in.nextInt();
            numGuessess++;

        }

        System.out.print("You win after ");
        System.out.println(numGuessess + " guesses.");

        in.close();// terminate the connection between the program and keyboard.
    }
}
