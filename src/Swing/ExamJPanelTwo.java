package Swing;

// Important required classes
import java.awt.*;
import java.awt.event.*; // I don't know what is this?
import javax.swing.*;

// Java Program to Create a JPanel with a Border Layout
public class ExamJPanelTwo extends JFrame{
    // JFrame
    static JFrame f;

    //JButton
    static JButton b,b1,b2,b3;

    //Label to display text
    static JLabel l;

    // main method
    public static void main(String[] args) {
        // creating a new frame to store text field and button
        f = new JFrame("panel");

        // Creating a label to display text
        l = new JLabel("panel label");

        // Creating a new buttons
        b = new JButton("button1");
        b1 = new JButton("button2");
        b2 = new JButton("button3");
        b3 = new JButton("button4");

        // Creating a panel to add buttons and a specific layout
        JPanel p = new JPanel(new BorderLayout());

        // Adding buttons and textfield to panel using add() method
        p.add(b, BorderLayout.NORTH);
        p.add(b1, BorderLayout.SOUTH);
        p.add(b2, BorderLayout.EAST);
        p.add(b3, BorderLayout.WEST);
        p.add(l, BorderLayout.CENTER);

        // setbackground of panel
        p.setBackground(Color.red);

        //adding panel to frame
        f.add(p);

        //Setting the size of frame
        f.setSize(300,300);
        f.setLocationRelativeTo(null); // center the window
        f.setDefaultCloseOperation(f.DISPOSE_ON_CLOSE); // create the close button

        f.show();

    }


}
