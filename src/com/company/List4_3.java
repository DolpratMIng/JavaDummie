package com.company;

public class List4_3 {
    public static void main(String[] args) {
        int weightOfAPerson = 150, elevatorWeightLimit = 1400, numberOfPeople = elevatorWeightLimit/weightOfAPerson;

        System.out.print("You can fit ");
        System.out.print(numberOfPeople);
        System.out.println(" people on the elevator.");
    }
}
