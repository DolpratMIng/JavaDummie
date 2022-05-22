package tryItOut;
import java.util.Scanner;

public class Tch6_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.print("Enter an int value: ");
            int i = in.nextInt();
            if(i > 10) {
                continue; // continue statement - skips to the end of its loop and begins the next iteration of that loop.
            }
            if(i == 0){
                break;
            }
            System.out.println(i);
        }

        System.out.println("Done!");
        in.close();
    }
}
