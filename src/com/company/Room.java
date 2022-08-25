package com.company;

// importing packages
import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat; // make the currency look like dollars amount

public class Room {
    // field
    private int guests;
    private double rate;
    private boolean smoking;
    private static NumberFormat currency = NumberFormat.getCurrencyInstance(); // static

    // void method for Scanner class
    public void readRoom(Scanner diskScanner){
        guests = diskScanner.nextInt();
        rate = diskScanner.nextDouble();
        smoking = diskScanner.nextBoolean();
    }

    //
    public void writeRoom() {
        System.out.print(guests);
        System.out.print("\t\t");
        System.out.print(currency.format(rate));
        System.out.print("\t");
        System.out.println(smoking ? "yes" : "no");
    }


}
