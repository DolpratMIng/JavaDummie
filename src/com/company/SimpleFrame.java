package com.company;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

@SuppressWarnings("serial") // tells Java not to remind that you've omitted something called a serialVersionUID field
public class SimpleFrame extends JFrame {

    public SimpleFrame() {
        setTitle("Don't click the button!"); // puts words in the frame title
        setLayout(new FlowLayout()); // setLayout - puts the new FlowLayout object in charge of arranging components
                                     // FlowLayout positions objects on the frame in a centered
        setDefaultCloseOperation(EXIT_ON_CLOSE); // tells Java what to dod when clicking the little x
        add(new JButton("Panic")); // add - places the button ono the object's surface
                                        // JButton - makes that String instance into the label on the face of the new button
        setSize(300, 100); // frame becomes 300 pixels wide and 100 pixels tall
        setVisible(true); // make the frame appears on the computer screen.
    }
}
