package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        System.out.println(randomNumber);

    }
}
