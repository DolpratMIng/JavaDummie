package com.company;
import java.text.DecimalFormat;

// class PlayerPlus inherited from Player
public class PlayerPlus extends Player{
    //static field - a non-access modifier used for methods and attributes
    //             - can be accessed without creating an object of a class.
    private static int playerCount = 0;
    private static double totalOfAverages = .000;
    private static DecimalFormat decFormat = new DecimalFormat();

    // static initializer
    /*
    - a block that runs before the main() method in Java
    -it will execute only one time
     */
    static {
        decFormat.setMaximumIntegerDigits(0);
        decFormat.setMaximumFractionDigits(3);
        decFormat.setMinimumFractionDigits(3);
    }

    // constructor inherited
    public PlayerPlus(String name, double average) {
        super(name, average);
        playerCount++;
        totalOfAverages += average;
    }

    // static method
    public static double findTeamAverage() {
        return totalOfAverages / playerCount;
    }

    // static method
    public static String findTeamAverageString() {
        return decFormat.format(totalOfAverages / playerCount);
    }
}
