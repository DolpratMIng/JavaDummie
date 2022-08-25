package ATeaching;

import javax.swing.JFrame;

public class ReferenceType {
    public static void main(String[] args) {
        // create reference type
        JFrame myFrame = new JFrame();
        String myTitle = "12Tail";

        // create JFrame object
        myFrame.setTitle(myTitle);
        myFrame.setSize(300, 200);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);

    }
}
