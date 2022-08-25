package Swing;
// requirement package
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Button;
import java.awt.Color;

//Class extends JFrame
public class ExamBorLayTwo extends JFrame {
    //Constructor of BorderDemo class.
    public ExamBorLayTwo(){

        // set the layout
        setLayout(new BorderLayout());

        // set the background
        setBackground(Color.RED);

        // creates Button (btn1)
       JButton btn1 = new JButton("Geeks");

        // creates Button (btn2)
        Button btn2 = new Button("GFG");

        // creates Button (btn3)
        Button btn3 = new Button("Sudo Placement");

        // creates Button (btn4)
        Button btn4 = new Button("GeeksforGeeks");

        // creates Button (btn5)
        Button btn5 = new Button("Java");

        // Adding JButton "btn1" on JFrame.
        add(btn1, "North");

        // Adding JButton "btn2" on JFrame.
        add(btn2, "South");

        // Adding JButton "btn3" on JFrame.
        add(btn3, "East");

        // Adding JButton "btn4" on JFrame.
        add(btn4, "West");

        // Adding JButton "btn5" on JFrame.
        add(btn5, "Center");

        // function to set the title
        setTitle("Learning a Border Layout");



        // Function to set size of JFrame.
        setSize(350, 300);

        setLocationRelativeTo(null);

        // Function to set visible status of JFrame
        setVisible(true);
    }

    // main method
    public static void main(String[] args) {
        // calling the constructor
        new ExamBorLayTwo();

    }
}


