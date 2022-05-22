package tryItOut;
import java.util.Scanner; // Scanner Class API

public class Tch6_2 {
    public static void main(String[] args) {
        int numGuesses = 0;

       Scanner in = new Scanner(System.in); // Compound refernce
        System.out.print("Enter a number: "); // text for user input
        int inputnum = in.nextInt(); // for user input
        numGuesses++;
        // while loop
        while(inputnum>0){
            System.out.println();
            System.out.println("The number is "+ inputnum + "."); // print input number

            // user input4
            System.out.print("Enter a number: ");
            inputnum = in.nextInt();
            numGuesses++;

        }

        System.out.println(inputnum);
        System.out.println("The number has been entered "+numGuesses+" time.");
    }

}

