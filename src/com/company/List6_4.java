package com.company;
//import
import java.io.File; // File
import java.util.Scanner;

public class List6_4 {
    public static void main(String[] args) {
        File evidence = new File("cookedBooks.txt"); // file class compound reference
        // Try and catch
        try{ // allow to define a block of code to be tested for errors while it is being executed
            System.out.println("Looking for " + evidence.getCanonicalPath()); // tell the path of the file where it should belong
        } catch (java.io.IOException e) { // allows to define a block of code to be executed, if an error occurs in the try block
            e.printStackTrace();
        }

        if(evidence.exists()){ // looking for the file in the directory
            Scanner sc = new Scanner(System.in);
            char reply; // char variable

            do{ // do loop perform at least one iteration
                System.out.print("Delete evidence? (y/n) ");
                reply = sc.findWithinHorizon(".",0).charAt(0); // the improvisation for nextChar
            } while (reply != 'y' && reply != 'Y' && reply != 'n' && reply != 'N'); // while loop

            if(reply == 'y' || reply == 'Y'){ // if else
                System.out.println("Okay, here goes...");
                evidence.delete(); // delete the file
                System.out.println("The evidence has been deleted.");
            } else {
                System.out.println("Sorr, buddy. Just asking.");
            }

            sc.close(); // close method from the keyboard.
        }

    }
}
