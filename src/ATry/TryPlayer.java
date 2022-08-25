package ATry;
import java.awt.*;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame; // JFrame
import javax.swing.JLabel; // JLabel

import com.company.Player;
@SuppressWarnings("serial") // annotation type allows Java Programmers to disable compilation warnings for a certain part of a program
public class TryPlayer extends JFrame{
    // constructor
    public TryPlayer() throws IOException{
        //Part 1: create the variables and objects
        Player player; // Declare an object's name
        Scanner hankeesData = new Scanner(new File("Hankees.txt")); // Scanner object

        // Part 2: create an object with the value from the files
        // for loop to create 9 players
        for(int num = 1; num<=9; num++){
            player = new Player(hankeesData.nextLine(), hankeesData.nextDouble());
            hankeesData.nextLine(); // to read the information in the file and go to the next line
            addPlayerInfo(player); // calling addPlayerInfo method to add the value from the object into GUI
        }


        // Part 3: Set the GUI window
        setTitle("The Hankees"); // set the title for the window
        setLayout(new GridLayout(9, 2, 20, 3)); // set the size
        setDefaultCloseOperation(EXIT_ON_CLOSE); // create close panel
        pack(); // set the frame's size
        setVisible(true); // make the gui frame invisible

        hankeesData.close();
    }
    //Void method user in part 2 to add the information to the GUI
    void addPlayerInfo(Player player){
        add(new JLabel("  " + player.getName())); //
        add(new JLabel(player.getAverageString()));
    }
}
