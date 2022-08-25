package Swing;


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
8.getAccessibleContext(): get the AccessibleContext associated with the JPanel
 */

// import package
import javax.swing.*;
import java.awt.*;
// Helper class extending JFrame class
public class ExamJPanelOne extends JFrame {
    // field
    // declare JFrame type and name
    static JFrame f;

    //declare JButton type and names
    static JButton b, b1, b2;

    //declare JLabel type and name to display text
    static JLabel l;


    // Main method
    public static void main(String[] args) {

        // creating a new frame to store text field and button
        f = new JFrame("panel");

        // creating a label to display text
        l = new JLabel("panel label");


        // Creating a new buttons
        b = new JButton("button1");
        b1 = new JButton("button2");
        b2 = new JButton("button3");

        // Creating a panel to add buttons
        JPanel p = new JPanel();

        // Adding buttons and textfield to panel
        // using add() method
        //p.add(l);
        p.add(b);
        p.add(b1);
        p.add(b2);
        p.add(l);

        // setBackground of panel
        p.setBackground(Color.red);

        // Adding panel to frame
        f.add(p);

        // Setting the size of farme
        f.setSize(300,300);
        f.setLocationRelativeTo(null); // center window
        f.setDefaultCloseOperation(f.DISPOSE_ON_CLOSE); // the close button

        f.show();
    }


}
