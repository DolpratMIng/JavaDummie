package com.company;
// import
import java.util.Scanner; // scanner for user input

public class List5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner variable and class

        System.out.print("Username: ");
        String username = sc.next(); // ask for user input

        if(username.equals("bburd")){ // if user = "bburd"
            System.out.print("Password: "); // print password
            String password = sc.next();

            if(password.equals("swordfish")){ // if password = "swordfish
                System.out.println("You're in."); // print you are in
            } else {
                System.out.println("Incorrect password");
            }
        } else {
            System.out.println("Unknown user");
        }
        sc.close(); // method to close the connection between keyboard and connection
    }
}
