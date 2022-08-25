package com.company;

public class List10_7 {
    public static void main(String[] args) {
        System.out.println("main is running");
        // create an object
        var e = new EnglishSpeakingWorld();

        //out.println(mars); cannot resolve symbol
        // print the field variable
        System.out.println(e.mars);
        // use the method
        e.visitPennsylvania();
    }
}
