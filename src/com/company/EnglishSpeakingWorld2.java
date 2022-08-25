package com.company;

public class EnglishSpeakingWorld2 {
    // field
    String mars;

    // method
    void visitIdaho() {
        System.out.println("visitID is running:");

        // variable
        mars = " red planet";
        // variable
        String atomicCity = " Population: 25";

        System.out.println(mars);
        System.out.println(atomicCity);
    }

    //method
    void visitNewJersey() {
        System.out.println("visitNJ is running:");
        System.out.println(mars);
        //out.println(atomicCity); cannot resolve symbol
    }
}
