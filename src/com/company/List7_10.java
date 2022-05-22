package com.company;
import com.company.DummiesFrame; // import class DummiesFrame

public class List7_10 {
    public static void main(String[] args) {
        DummiesFrame frame = new DummiesFrame("Greet Me!"); // creates an instance of my DummiesFrame class
        frame.addRow("Your first name"); // create row
        frame.go(); // make the app's window appear on the screen
    }

    public static String calculate(String firstName) { // The header of the calculate method
        return "Hello, " + firstName + "!"; // return value of type string
    }
}
