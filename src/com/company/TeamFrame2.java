package com.company;
// import API class
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TeamFrame2 extends JFrame { // extend JFrame class
    // constructor to display
    public TeamFrame2() throws IOException {
        // declarer the class and object name
        PlayerPlus player;
        // Scanner for taking information from the file
        var hankeesData = new Scanner(new File("Hankees.txt"));

        // for loop to create 9 instances
        for (int num = 1; num <= 9; num++) {
            player = new PlayerPlus(hankeesData.nextLine(), hankeesData.nextDouble()); // create class name
            hankeesData.nextLine(); // to read the text of the the entire line and skip to the next line

            addPlayerInfo(player); // calling method to display the text from scanner
        }

        add(new JLabel()); //
        add(new JLabel("----"));
        add(new JLabel("    Team Batting Average:"));
        add(new JLabel(PlayerPlus.findTeamAverageString()));

        setTitle("The Hankees");
        setLayout(new GridLayout(12, 2, 20, 6));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack(); // set the frame's size
        setVisible(true); // make the GUI frame invincible

        hankeesData.close(); // disconnect the keyboard and the program
    }

    void addPlayerInfo(PlayerPlus player) {
        // add the name and average to the gui
        add(new JLabel("    " + player.getName()));
        add(new JLabel(player.getAverageString()));
    }
}
