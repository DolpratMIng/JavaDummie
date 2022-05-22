package com.company;

public class List7_7 {
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account();

        account1.balance = 24.02;
        account2.balance = 55.63;

        double myInterest1 = account1.getInterest(5.00);
        double myInterest2 = account2.getInterest(7.00);

        System.out.printf("$%4.2f\n", myInterest1);
        System.out.printf("$%5.2f\n", myInterest1);
        System.out.printf("$%3.2f\n", myInterest1);
        System.out.printf("$%3.2f\n", myInterest1);
        System.out.printf("$%.2f $%.2f", myInterest1, myInterest2);
    }
}
