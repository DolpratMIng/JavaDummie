package TryItOut;
import java.util.Scanner;
public class Tch11_1 {
    public static void main(String[] args) {
        // create an initializer array
        int[] words = {0,296,342,405,363,350,323,101};

        // create scanner object to take the user input
        var in = new Scanner(System.in);

        System.out.print("Which page: ");
        // nextInt() method from the scanner package which is use to read string.
        int input = in.nextInt();
        System.out.println("That page has " + words[input - 1] + " words.");
    }
}
