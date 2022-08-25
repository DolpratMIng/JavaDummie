package com.company;

public class List11_2ArrayInitializer {
    public static void main(String[] args) {

        // create an initializer array
        int guests[] = {1,4,3,2,0,5,3,9,8,3};

        System.out.println("room\tGuests");

        // for loop to display
        for(int roomNum = 0; roomNum <= 9; roomNum++){
            System.out.print(roomNum);
            System.out.print("\t\t");
            System.out.println(guests[roomNum]);
        }
    }
}
