package com.company;

import java.util.Scanner; // import the scanner class
import java.io.File; // import the file class
import java.io.IOException; // import the IOException class to handle errors

public class List11_1 {
    public static void main(String args[]) throws IOException{ // use to create a custom error.
        int guests[] = new int[10]; // create an array of 10 indexes
        //Scanner object - take the input from file and create new file
        Scanner diskScanner = new Scanner(new File("GuestList.txt")); // create a scanner object

        // for loop to give the values to each index in the arrays
        for(int roomNum = 0; roomNum < 10; roomNum++){
            guests[roomNum] = diskScanner.nextInt();
        }


        System.out.println("room\tGuests");
        // for loop to display all the values
        for(int roomNum = 0; roomNum < 10; roomNum++){
            System.out.print(roomNum);
            System.out.print("\t\t");
            System.out.println(guests[roomNum]);
        }
        // to separate the connection between program and scanner
        diskScanner.close();
    }
}
