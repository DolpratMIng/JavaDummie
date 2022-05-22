package com.company;

public class Account { // list 7-1 create class
    // Default access
    // public string name;
    // protected String address;
    // private double balance;

    // field - a variable declared inside a class but not inside any particular method
    String name; //
    String address;
    double balance;

    //display for method instead of using sout
    public void display() {
        System.out.print(name);
        System.out.print(" (");
        System.out.print(address);
        System.out.print(") has $");
        System.out.print(balance);
    }

    // getInterest method call - a method with a passing value in a parameter
    public double getInterest(double percentageRate){
        return balance * percentageRate / 100.00;
    }

    // set and get method - accessor method

    // name variable
    public void setName(String n){
        if (!n.equals("")){ // if n unequal
            name = n;
        }
    }

    public String getName(){
        return name;
    }

    // address variable
    public void setAddress(String a){
        address = a;
    }

    public String getAddress(){
        return address;
    }

    // balance variable
    public void setBalance(double b){
        balance = b;
    }

    public double getBalance() {
        return balance;
    }
}
