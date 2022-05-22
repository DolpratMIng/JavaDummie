package com.company;

public class List7_4 {
    public static void main(String[] args) {
        // declare and create objects
        Account myAccount = new Account();
        Account yourAccount = new Account();

        // Give the information
        myAccount.name = "Barry Burd";
        myAccount.address = "222 Cyberspace Lane";
        myAccount.balance = 24.02;

        yourAccount.name = "Jane Q. Public";
        yourAccount.address = "111 Consumer Street";
        yourAccount.balance = 55.63;

        myAccount.display();
        System.out.println();
        yourAccount.display();
    }
}
