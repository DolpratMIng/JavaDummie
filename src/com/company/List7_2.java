package com.company;

public class List7_2 {
    public static void main(String[] args) {
        //Account myAccount = new Account
        Account myAccount; // declare an objects class
        Account yourAccount; // declare an objects class

        myAccount = new Account(); // create an object
        yourAccount = new Account(); // create an object

        myAccount.name = "Barry Burd"; // name - using method variable from the class
        myAccount.address = "222 Cyberspace Lane"; // address - using method variable from the class
        myAccount.balance = 24.02; // balance -  using method variable from the class

        yourAccount.name = "Jane Q. Public"; // putting value in yourAccount
        yourAccount.address = "111 Consumer Street"; // putting value in yourAccount
        yourAccount.balance = 55.63; // balance - using method variable from the class

        System.out.print(myAccount.name); // print myAccount name
        System.out.print(" (");
        System.out.print(myAccount.address); // print myAccount address
        System.out.print(") has $");
        System.out.print(myAccount.balance); // print myAccount balance
        System.out.println();

        System.out.print(yourAccount.name); // print yourAccount
        System.out.print(" (");
        System.out.print(yourAccount.address); // print yourAccount address
        System.out.print(") has $");
        System.out.println(yourAccount.balance); // print yourAccount balance

    }
}
