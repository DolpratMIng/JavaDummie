package com.company;


import com.company.DummiesFrame; // import class DummiesFrame

public class List7_11 {
    // GUI  method
    public static void main(String[] args) {
        DummiesFrame frame = new DummiesFrame("Adding Machine"); // create DummiesFrame object
        frame.addRow("First number"); // frame object's addRow method
        frame.addRow("Second number"); // frame object's addRow method
        frame.setButtonText("Sum"); // frame object's setButton
        frame.go(); // a call to the frame object's go method
    }
    // method for calculate the user input
    public static int calculate(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
}
