package Swing;

import javax.swing.JFrame;

/*
Swing setDefaultCloseOperation()
-method is used to specify one of several options for the close button

=JFrame.Exit_On_Close - Exit the application.
=JFrame.Hide_On_Close - Hide the frame, but keep the application running
=JFrame.Dispose_On_Close - Dispose of the frame object, but keep the application running
 */
public class MainWindow {
    // declare the name for JFrame object
    private JFrame window;

    // constructor
    public MainWindow(){

        window = new JFrame(); // create the JFrame object
        window.setTitle("Hello World!"); // set the title
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // create the close button
        window.setSize(800, 500); // set the size of the window
        window.setLocationRelativeTo(null); // center the window on the screen

    }

    // void method
    public void show(){
        window.setVisible(true);
    }
}
