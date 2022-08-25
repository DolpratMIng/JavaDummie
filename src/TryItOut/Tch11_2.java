package TryItOut;

// import the classes
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Tch11_2 {
    public static void main(String[] args) throws IOException {
        int[] guests = new int[10]; // create an array of 0 indexes
        var in = new Scanner(new File("GuestList.txt")); // create scanner object to take the input from the file

        // create for loop to give the to the indexes
        for(int roomNum = 0; roomNum < 10; roomNum++){
            guests[roomNum] = in.nextInt();
        }

        System.out.println("Room\tGuests");

        // for loop to display all the valuees
        for(int roomNum = 0; roomNum < 10; roomNum++){
            System.out.print(roomNum);
            System.out.print("\t\t");
            System.out.println(guests[roomNum]);
        }


    }
}
