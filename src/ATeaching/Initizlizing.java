package ATeaching;

import javax.swing.JFrame;

public class Initizlizing {
    public static void main(String[] args) {
        //int weightOfAPerson = 150; // asignment statement
        //int elevatorWeightLimit;
        //int numberOfPeople;
        //int weightOfAPerson = 150, elevatorWeightLimit = 1400, numberOfPeople = elevatorWeightLimit/weightOfAPerson; // initilizing

        // char type
        String name = "long";
        char myLittleChar = 'b';
        String namebigcap = name.toUpperCase();
        char myBigChar = Character.toUpperCase(myLittleChar);
        //System.out.println(myBigChar);
        //System.out.println(namebigcap);

        //-----------------------------------//
        int weightOfAPerson = 150, elevatorWeightLimit = 1400, numberOfPeople = elevatorWeightLimit/weightOfAPerson; // initilizing

        boolean boolean1 = numberOfPeople <= 10;

        System.out.println(boolean1);
        //JFrame myFrame = new JFrame();
        JFrame myframe;
        myframe = new JFrame();

    }
}
