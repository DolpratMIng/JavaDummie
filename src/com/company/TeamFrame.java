package com.company;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;

/*
Pack() - pack method sizes the frame so that all its contents are at above their preferred sizes.
       - alternative - to establish
 */
@SuppressWarnings("serial") // suppress annotation
public class TeamFrame extends JFrame { // class TeamFrame extends JFrame

    //constructor
    public TeamFrame() throws IOException { // IOException for warning
        Player player; // declare the class and object name
        Scanner hankeesData = new Scanner(new File("Hankees.txt")); // create scanner object to connect to the file

        //for loop
        for (int num = 1; num <= 9; num++) {
            player = new Player(hankeesData.nextLine(), hankeesData.nextDouble()); // create player object to store the data from the file
            hankeesData.nextLine(); // to read the information in the file and go to the next line
            addPlayerInfo(player); // calling addplayerInfo method
        }

        setTitle("The Hankees"); // setTitle from JFrame
        setLayout(new GridLayout(9, 2, 20, 3)); // setLayout from JFrame // new GridLayout from GridLayout
        setDefaultCloseOperation(EXIT_ON_CLOSE); // set The close operation from JFrame
        pack(); // set the frame's size from JFrame /////////////////
        setVisible(true); // make the gui frame invisible from

        hankeesData.close(); // disconnect the keyboard and program
    }

    void addPlayerInfo(Player player) {
        // add from JFrame
        add(new JLabel("    " + player.getName())); // add the object to the GUI // new JLabel from JLabel
        add(new JLabel(player.getAverageString())); // add the object to the GUI// new JLabel from JLabel
    }
}
