package com.company;

// import package
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class List11_6 {
    public static void main(String[] args) throws IOException {

        // create rooms array of 10 indexes
        Room rooms[];
        rooms = new Room[10];

        // create scanner object for connecting the file
        Scanner diskScanner = new Scanner(new File("RoomList.txt"));

        // Part 1 for loop to store the information in file to the array
        for (int roomNum = 0; roomNum < 10; roomNum++){

            rooms[roomNum] = new Room(); //
            rooms[roomNum].readRoom(diskScanner);
        }

        // Part 2 using for loop to display the information
        System.out.println("Room\tGuests\tRate\tSmoking?");

        for(int roomNum = 0; roomNum < 10; roomNum++){
            System.out.print(roomNum);
            System.out.print("\t\t");
            rooms[roomNum].writeRoom(); // calling writeRoom to print
        }
        diskScanner.close();

    }

}
