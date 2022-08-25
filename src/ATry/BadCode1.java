package ATry;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class BadCode1 {
    public static void main(String[] args) throws IOException{
        int guests[] = new int[10]; // create array

        Scanner diskScanner = new Scanner(new File("GuestList.txt")); // create scanner object
        PrintStream listOut = new PrintStream("GuestList.txt"); // create printSteam object to edit the file

        guests[0] = diskScanner.nextInt(); // read
        listOut.print(5);

        diskScanner.close(); // close
        listOut.close(); // close
    }
}
