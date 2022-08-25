package com.company;
import java.text.DecimalFormat; // Java API

public class Player {
    // field
    private String name;
    private double average;

    // constructor
    public Player(String name, double average) {
        this.name = name;
        this.average = average;
    }

    // get for the field
    public String getName() {
        return name;
    }

    public double getAverage() {
        return average;
    }

    // method getAverageString
    public String getAverageString() {
        var decFormat = new DecimalFormat(); // decFormat object - show how number should be display
        decFormat.setMaximumIntegerDigits(0);
        decFormat.setMaximumFractionDigits(3);
        decFormat.setMinimumFractionDigits(3);
        return decFormat.format(average);
    }
}
