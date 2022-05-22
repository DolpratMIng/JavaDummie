package com.company;
// import the class for GUI
import com.company.DummiesFrame;

public class List7_13 {
    //method for GUI
    public static void main(String[] args) {
        DummiesFrame frame = new DummiesFrame("Display an Account"); // create an instance Dummeies class frame.
        frame.addRow("Full name"); // addrow
        frame.addRow("Address"); // addrow
        frame.addRow("Balance"); // addrow
        frame.setButtonText("Display"); // addrow
        frame.go(); // make the window app appear on the screen
    }
    // method for calculate
    public  static String calculate(String name, String address, double balance){
        Account myAccount = new Account(); // create and declare instance for account class
        myAccount.setName(name); // set the name
        myAccount.setAddress(address); // set the address
        myAccount.setBalance(balance); // set the balance
        return myAccount.getName() + " (" + myAccount.getAddress() + ") has $" + myAccount.getBalance(); // return the result
    }
}
