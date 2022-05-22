package com.company;

public class List7_9 {
    public static void main(String[] args) {
        // declare and create objects
        Account myAccount = new Account();
        Account yourAccount = new Account();

        // set value of the objects
        myAccount.setName("");
        myAccount.setAddress("222 Cyberspace Lane");
        myAccount.setBalance(24.02);

        yourAccount.setName("Test");
        yourAccount.setAddress("111 Consumer Street");
        yourAccount.setBalance(55.63);

        //print
        System.out.print(myAccount.getName());
        System.out.print(" (");
        System.out.print(myAccount.getAddress());
        System.out.print(") has $");
        System.out.print(myAccount.getBalance());
        System.out.println();

        System.out.print(yourAccount.getName());
        System.out.print(" (");
        System.out.print(yourAccount.getAddress());
        System.out.print(") has $");
        System.out.print(yourAccount.getBalance());
    }
}
