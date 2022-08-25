package ATechnical;
// import package


import java.util.Scanner; // import the scanner class to take user input
import java.io.File; // import the file class to handle about the file stuffs
import java.io.IOException; // import the IOException to handle errors

public class tryFileArray {
    public static void main(String[] args) throws IOException {
        int guests[] = new int[10]; // create an arrays of 10 indexes

        // create an Scanner object to take the input from the file
        Scanner in = new Scanner(new File("GuestList.txt"));

        // for loop for give the value to the array
        for(int roomNum = 0; roomNum<10; roomNum++){
            guests[roomNum] = in.nextInt();
        }

        System.out.println("RoomNum\tGuests");
        // for loop for display the all the values
        for(int roomNum=0; roomNum<10; roomNum++){
            System.out.print(roomNum);
            System.out.print("\t\t");
            System.out.println(guests[roomNum]);
        }
        in.close(); // to separate the connection between the file and program
    }
}