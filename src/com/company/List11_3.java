package com.company;

public class List11_3 {
    public static void main(String[] args) {
        int guests[] = {1,4,3,0,2,1,4,3,0,2}; // create an initializer arrays
        int roomNum = 0;

        System.out.println("Room\tGuests");

        // enhance for loop
        for(int numGuests : guests){
            System.out.print(roomNum++);
            System.out.print("\t\t");
            System.out.println(numGuests);
        }
    }
}
