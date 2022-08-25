package com.company;

public class List10_14 {
    public static void main(String[] args) {
        // create an object
        var smackoverAR = new City();
        // set the field variable's value
        smackoverAR.population = 2232;
        // calling method
        smackoverAR = doBirth(smackoverAR);
        // display the value
        System.out.println(smackoverAR.population);
    }

    static City doBirth(City aCity) {
        var myCity = new City();
        myCity.population = aCity.population + 1;
        return myCity;
    }
}
