package com.company;

public class TemperatureEvenNicer extends TemperatureNice{
    // inherited constructor
    public TemperatureEvenNicer() {
        super();
    }

    public TemperatureEvenNicer(double number) {
        super(number);
    }

    public TemperatureEvenNicer(TempScale scale) {
        super(scale);
    }

    public TemperatureEvenNicer(double number, TempScale scale) {
        super(number, scale);
    }


    // convert method
    public void convertTo(TempScale newScale) {
        double number = getNumber();
        TempScale scale = getScale();

        if (scale == TempScale.FAHRENHEIT &&
                newScale == TempScale.CELSIUS) {
            setNumber((number - 32) * 5.0 / 9.0);
        } else if (scale == TempScale.CELSIUS &&
                newScale == TempScale.FAHRENHEIT) {
            setNumber(number * 9.0 / 5.0 + 32);
        }
        setScale(newScale); // don't know
    }
}
