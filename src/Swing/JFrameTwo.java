package Swing;

import javax.swing.*;
import java.awt.*;




// create JFrame by composition
public class JFrameTwo {

    // declare the type and name for JFrame instance
    private JFrame frame;

    // constructor
    public JFrameTwo(){
        initialize();
    }

    // void method
    public void initialize(){
        // JFrame section
        this.frame = new JFrame(); // create JFrame object
        this.frame.setTitle("JFrameTwo"); // set the title for JFrame
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // create the close operation for window
        this.frame.setSize(500, 400); // set the size
        this.frame.setLocationRelativeTo(null); // center the window
        this.frame.setResizable(false); // set the resize of the window


        this.frame.setVisible(true); // make the frame visible



    }
}
