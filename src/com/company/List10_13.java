package com.company;

public class List10_13 {
    public static void main(String[] args) {
        // create an object
        City smackoverAR = new City();
        // set the field population from the class to 2332
        smackoverAR.population = 2332;
        // call method
        birth(smackoverAR);
        //display the passage
        System.out.println(smackoverAR.population);
    }

    static void birth(City aCity){
        aCity.population++;
    }
}
