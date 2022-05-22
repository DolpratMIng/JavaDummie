package com.company;
// import random number
import java.util.Random;
//import class DummiesFrame for GUI
import com.company.DummiesFrame;

public class List7_12 {
    public static void main(String[] args) { // method for GUI
        DummiesFrame frame = new DummiesFrame("Guessing Game"); // create an instance of my Dummies frame
        frame.addRow("Enter an int from 1 to 10"); // add row method for user input
        frame.setButtonText("Submit your guess"); // add row method for user input
        frame.go(); // make the app's window appear

    }

    public static String calculate(int inputNumber){ //method for calculation
        Random random = new Random(); // create a class for random number
        int randomNumber = random.nextInt(10) + 1; // create an instance for random number

        // if else statement
        if(inputNumber == randomNumber){
            return "You win.";
        } else{
            return "You lose. The random number was " + randomNumber + ".";
        }
    }
}
