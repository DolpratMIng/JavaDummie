package ATechnical;

/*JFrame - a type of container which inherits the java.awt.Frame class
         - works like the main window where components like labels, buttons, textfields are added to create GUI
         - JFrame has the option to hide or close the window with the help of setDefaultCloseOperation(int) method.*/

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StudyJFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame Example"); // create JFrame object
        JPanel panel = new JPanel(); // create JPanel object
        panel.setLayout(new FlowLayout()); // set the layout //////////////////////
        JLabel label = new JLabel("JFrame By Example"); // create JLabel
        JButton button = new JButton(); // create JButton object
        button.setText("Button");
        panel.add(label); ///////////////////////
        panel.add(button); // add button
        frame.add(panel); // add panel
        frame.setSize(200,300); // set the size
        frame.setLocationRelativeTo(null); // center the window on the screen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // create the close button
        frame.setVisible(true); // set visible


    }
}
