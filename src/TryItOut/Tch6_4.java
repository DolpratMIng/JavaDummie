package TryItOut;
import java.util.Scanner; // Scanner API class

public class Tch6_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Scanner compound reference
        System.out.print("Enter number: ");
        int n = in.nextInt(); // user input

        int factorial = 1; // factorial val - accumulate variable.
        // for loop
        for(int i= 1;i<= n;i++){
            factorial *= i;
        }

        System.out.println(n + "! is " + factorial);
        in.close();
    }
}
