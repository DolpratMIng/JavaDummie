package com.company;

public class Tch9_5 {
    public static void main(String[] args) {
        var temp = new TemperatureEvenNicer();

        // convert fahrenheit to celsius
        temp.setNumber(70.0);
        temp.setScale(TempScale.FAHRENHEIT);
        temp.convertTo(TempScale.CELSIUS);
        temp.display();

        // convert fahrenheit
        temp = new TemperatureEvenNicer(32.0);
        temp.convertTo(TempScale.CELSIUS);
        temp.display();

        // convert celsius to fahrenheit
        temp = new TemperatureEvenNicer(TempScale.CELSIUS);
        temp.convertTo(TempScale.FAHRENHEIT);
        temp.display();


        temp = new TemperatureEvenNicer(2.73, TempScale.KELVIN);
        temp.display();
    }
}
