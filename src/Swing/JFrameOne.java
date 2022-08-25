package Swing;

import javax.swing.*;

// Create JFrame by inheritance
// no need to create JFrame variable
public class JFrameOne extends JFrame {

    // constructor
    public JFrameOne(){
        initialize();
    }

    // void method
    public void initialize() {
        setTitle("JFrameOne"); // set title
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // set the close button
        setSize(500, 400); // set the size
        setLocationRelativeTo(null); // center the window
        setResizable(false); // set the resizable for window
        setVisible(true); // set the frame to be visible

    }

}
