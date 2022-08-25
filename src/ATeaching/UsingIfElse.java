package ATeaching;

import java.util.Scanner;
import java.util.Random;
public class UsingIfElse {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in); // Scanner object - connect the program to the keyboard.

        System.out.print("Enter your number: ");
        int num1 = key.nextInt();
        int num2 = new Random().nextInt(10)+1;

        // if else statement
        if(num1 == num2){
            System.out.println("It's equal.");
        }
        

        key.close();
    }
}
