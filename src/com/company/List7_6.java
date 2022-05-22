package com.company;

public class List7_6 {
    public static void main(String[] args) {
        // declare and create object
        Account account1 = new Account();
        Account account2 = new Account();

        //display the account 1 information
        account1.name = "Barry Burd";
        account1.address = "222 Cyberspace Lane";
        account1.balance = 24.02;

        //display the account 2 information
        account2.name = "Jane Q. Public";
        account2.address = "111 Consumer Street";
        account2.balance = 55.63;

        //print account 1  information
        account1.display();

        // calling getInterest rate method
        System.out.print(" plus $");
        System.out.print(account1.getInterest(5.00));
        System.out.println(" interest ");

        //print account 2 information
        account2.display();

        //calling interest rate method
        double yourInterestRate = 7.00;
        System.out.print(" plus $");
        double yourInterestAmount = account2.getInterest(yourInterestRate);
        System.out.print(yourInterestAmount);
        System.out.println(" interest ");
    }
}
