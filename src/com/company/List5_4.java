package com.company;

// import
import javax.swing.JOptionPane; // JOption is defined in Java's API

public class List5_4 {
    public static void main(String[] args) {

        String username = JOptionPane.showInputDialog("Username:"); // Jframe username input
        String pass = JOptionPane.showInputDialog("Password:");// Jframe password input

        //if else statement
        if(
                username != null && pass != null && // != null to make sure that haven't click cancel.
                        (
                                (username.equalsIgnoreCase("bburd") && pass.equalsIgnoreCase("swordfish")) ||
                                        (username.equalsIgnoreCase("hritter") && pass.equalsIgnoreCase("preakston"))
                                )
                /*username equals to "bburd" and password equals to "swordfish" or
                username equals to "hritter" and password equals to "preaskton" */
        )
        {
            JOptionPane.showMessageDialog(null, "You are in."); // the word null  stands for "no other dialog box."
        } else { // else
            JOptionPane.showMessageDialog(null, "You're suspicious."); // the word null  stands for "no other dialog box."
        }
        }
    }
