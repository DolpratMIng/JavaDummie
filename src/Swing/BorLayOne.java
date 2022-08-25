package Swing;
// import requirement package
import javax.swing.*;
import java.awt.*;

/*
BorderLayout - the default layout for the window objects such as JFrame, JWindow, JDialog, JInteralFrame etc.
             - BorderLayout arranges the components in the five regions.
             - Four sides are referred to as north, south, each, west, and center

Constructor:
1.BorderLayout(): it will construct a new borderlayout with no gaps between the components.
2.BorderLayout(int, int): it will constructs a border layout with the specified gaps between the components

Commonly Used Methods:
1.toString(): Returns a string which is the representation of the state of border layout
2.getLayoutAlignmentX(Container parent): Returns the layout alignment along the X-axis
3.getLayoutAlignmentY(Container parent): It will return the layout alignment along the Y-axis
4.removeLayoutComponent(Component comp): This method is used to remove the specified component from the borderlayout
5.getVgap(): Return the vertical gap between the components.
6.getHgap(): Return the horizontal gap between the components
7.setHgap(int hgap): It is used to set the horizontal gap between the components.
8.setVgap(int vgap): it is used to set the vertical gap between the components.
 */
public class BorLayOne {
    // declare the type and name for JFrame instance
    private JFrame frame;

    //constructor
    public BorLayOne(){
        initialize();
    }

    private void initialize(){
        // JFrame section
        frame = new JFrameOne(); // create JFrameOne object
        frame.setTitle("BorderPane Demo"); // set frame title
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // set the closing window
        frame.setSize(800, 500); // set the frame size

        // BorderLayOut section
        frame.setLayout(new BorderLayout()); // has two constructor - one is to allow you to specify both horizontal and vertical

        frame.add(new JButton("NORTH"), BorderLayout.NORTH); // add the JButton

        frame.setLocationRelativeTo(null); // center the window
    }

    public void show(){
        this.frame.setVisible(true);
    }
}
