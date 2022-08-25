package com.company;

// import classes
import java.util.Scanner; // import scanner class
import java.io.File; // import file class
import java.io.IOException; // import IOException to handle error
import java.io.PrintStream; // import printSteam class to edit the file
public class List11_4 {
    public static void main(String[] args) throws IOException{
        int guests[] = new int[10]; // create an array of 10 indexes
        int roomNum; // create variable

        /*Part 1 - To put the value from the file to all the indexes of the arrays */
        // create scanner object to take the input from the file
        Scanner diskScanner = new Scanner(new File("GuestList.txt"));
        // for loop to multiply the input from the file
        for(roomNum =0; roomNum<10;roomNum++){
            guests[roomNum] = diskScanner.nextInt();
        }
        diskScanner.close(); // close method - separate the connection between file and the scanner

        roomNum = 0; // set the variable to 0

        /*Part 2 - use loop to check the vacancy in the room.*/
        while(roomNum<10 && guests[roomNum]!= 0  ){
            roomNum++;
        }

        /*Part 3 - To ask the user input to fill numbers of guests in the room and edit the value in the file*/
        //if else - to ask the input from the keyboard
        if(roomNum == 10){
            System.out.println("Sorry, no vacancy");
        } else{
            System.out.print("How many people for room");
            System.out.print("?");

            // scanner object to take keyboard input for filling the amount of guest in the room
            Scanner in = new Scanner(System.in);
            guests[roomNum] = in.nextInt();
            in.close();

            // PrintSteam object use to edit the file
            PrintStream listOut = new PrintStream("GuestList.txt");
            // to keep repeat the amount of guest in the file
            for(roomNum = 0; roomNum < 10; roomNum++){
                listOut.print(guests[roomNum]);
                listOut.println();
            }
            listOut.close();
        }
    }

}
