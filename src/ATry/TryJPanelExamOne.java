package ATry;

// import packages
import javax.swing.*;
import java.awt.*;
public class TryJPanelExamOne {

    // declare type and name for JFrame
    private JFrame f;

    // declare type and name for JPanel
    private JPanel p;

    // declare type and name for JLabel
    private JLabel l;

    // declare type and name for JButton
    private JButton b,b1,b2;

    //crete constructor
    public TryJPanelExamOne(){
        initialize();
    }

    // create void method
    private void initialize(){
       // create JFrame object
       this.f = new JFrame("panel");

       this.f.setSize(300,300); // set the frame size
       this.f.setLocationRelativeTo(null); // set the center of the window
       this.f.setDefaultCloseOperation(f.DISPOSE_ON_CLOSE); // create the close button for the window

        // create JLabel object
        l = new JLabel("panel label");

        // create JButton object
        b = new JButton("button1");
        b1 = new JButton("button2");
        b2 = new JButton("button3");

        // create JPanel object
        p = new JPanel();

        //set the JPanel layout of the container to the specified layout manager
        p.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));

        // add all the label and button to the panel
        p.add(b);
        p.add(b1);
        p.add(b2);
        p.add(l);

        // setBackground of panel
        p.setBackground(Color.red);

        // Adding panel to the frame
        this.f.add(p, BorderLayout.CENTER); // BorderLayout - adding the alignment of panel


       this.f.setVisible(true); // set the frame visible

    }
}
