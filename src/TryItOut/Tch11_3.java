package TryItOut;
import java.util.Scanner; // import Scanner class
public class Tch11_3 {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in); // Scanner object
        int[] numbers = new int[5]; // array

        // for loop for taking input
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = keyboard.nextInt();
        }

        System.out.println();

        // for loop to display the star
        for (int i = 0; i < 5; i++) {
            for (int count = 0; count < numbers[i]; count++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
