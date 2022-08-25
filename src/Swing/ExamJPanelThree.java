package Swing;

//import required classes
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ExamJPanelThree extends JFrame{
    // field

    //JFrame
    static JFrame f;

    // JButton
    static JButton b, b1, b2,b3;

    //Label to display text
    static JLabel l;

    //Main method
    public static void main(String[] args) {
        // Creating a new frame to store text field and button
        f = new JFrame("panel");

        // Creating a label to display text
        l = new JLabel("panel label");

        // Creating a new buttons
        b = new JButton("button1");
        b1 = new JButton("button2");
        b2 = new JButton("button3");
        b3 = new JButton("button4");

        // Creating a panel to add buttons and textfield and a layout
        JPanel p = new JPanel();

        // Setting box layout
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

        // Adding buttons and textfield to panel
        p.add(b);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(l);

        // Setting background of panel
        p.setBackground(Color.red);

        // Adding panel to frame
        f.add(p);

        f.setSize(300, 300); // set the frame size
        f.setLocationRelativeTo(null); // center the window
        f.setDefaultCloseOperation(f.DISPOSE_ON_CLOSE); // create the close button

        f.show();
    }

}
