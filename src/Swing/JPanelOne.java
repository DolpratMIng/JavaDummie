package Swing;

import javax.swing.*;
import java.awt.*;

/* JPanel
-part of the Java Swing package, - a container that can store a group of components. The main task of JPanel is to organized
components, various layouts can be set in JPanel which provide better organization of components, however, it does not have
a title bar.

-a default layout of JPanel is flow layout

//Commonly used Functions of JPanel
1.add(Component c): Adds component to a specified container
2.setLayOut(LayoutManager l): sets the layout of the container to the specified layout manager
3.updateUI(): resets the UI property with a value from the current look and feel.
4.SetUI(PanelUI ui): set the look and feel of an object that renders this component
5.getUI(): returns the look and feel object that renders this component.
6.paramString(): returns a string representation of this JPanel
7.getUIClassID(): returns the name of the Look and feel class that renders this component
8.getAccessibleContext(): get the AccessibleContext associated with the JPane
*/

public class JPanelOne {

    //declare the type and name for JFrame instance
    private JFrame frame;

    // constructor
    public JPanelOne(){
        initilize();
    }

    // void method
    private void initilize(){
        //JFrame section
        this.frame = new JFrame(); // create JFrame object
        //frame.setLayOut(new BorderLayout(10,5));
        this.frame.setTitle("Java Swing JPanel Demo"); // set the title for JFrame
        this.frame.setSize(800, 500); // create the close operation for window
        this.frame.setLocationRelativeTo(null); // center the window
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // create the close operation for window

        //JPanel section
        JPanel panel = new JPanel(); // create JPanel object
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 5)); // set the layout, horizontal, vertical

        panel.setBackground(Color.RED); // the background color

        // JButton
        Button button1 = new Button("Button 1");
        panel.add(button1);


        Button button2 = new Button("Button 2");
        panel.add(button2);


        Button button3 = new Button("Button 3");
        panel.add(button3);

        //Set preferred width and height or the preferred size
        //panel.setPreferredSize(new Dimension(250, 100));

        this.frame.add(panel, BorderLayout.CENTER); // add panel to the JFrame & direction

        this.frame.setVisible(true); // set the frame to be visible
    }
}
