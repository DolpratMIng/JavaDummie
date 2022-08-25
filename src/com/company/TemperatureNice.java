package com.company;

// create subclass to create display method
public class TemperatureNice extends Temperature {
    // inherited the constructors from the parent class
    public TemperatureNice() {
        super();
    }

    public TemperatureNice(double number) {
        super(number);
    }

    public TemperatureNice(TempScale scale) {
        super(scale);
    }

    public TemperatureNice(double number, TempScale scale) {
        super(number, scale);
    }

    public void display() {
        System.out.printf("%5.2f degrees %s\n", getNumber(), getScale()); // getNumber and getScale have been used to accessed from Temperature class

    }
}
