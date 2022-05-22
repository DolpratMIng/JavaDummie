package com.company;

public class List4_7 {
    public static void main(String[] args) {
        int total = 248;
        int quarters = total / 25; // quarters = 9
        int whatsLeft = total % 25; // whatsLeft = 23

        int dimes = whatsLeft / 10;
        whatsLeft = whatsLeft % 10; // whatsLeft = 3

        int nickels = whatsLeft / 5; // nickels = 0
        whatsLeft = whatsLeft % 5; // whatsLeft = 3
        int cents = whatsLeft; // cents = 3

        System.out.println("From " + total + " cents you get");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimess");
        System.out.println(nickels + " nickels");
        System.out.println(cents + " cents ");

    }
}
