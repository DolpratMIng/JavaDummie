package Swing;

// Java program to illustrate the BorderLayout
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

 class ExamBorLayOne extends JFrame{

    ExamBorLayOne(){

        //Creating Object of JPanel class
        JPanel pa = new JPanel();

        // set the layout
        pa.setLayout(new BorderLayout());


        // add a new JButton with name "wel" and it is
        // lie top of the container
        pa.add(new JButton("welcome"), BorderLayout.NORTH);

        // add a new JButton with name "come" and and it is
        // lie buttom of the container
        pa.add(new JButton("Geeks"), BorderLayout.SOUTH);

        // add a new JButton with name "Layout" and it is
        // lie left of the container
        pa.add(new JButton("Layout"), BorderLayout.EAST);

        // add a new JButton with name "Border" and it is
        // lie right of the container
        pa.add(new JButton("Border"), BorderLayout.WEST);

        // add a new JButton with name "hello everybody" and it is
        // lie center of the container
        pa.add(new JButton("GeeksforGeeks"), BorderLayout.CENTER);

        // add the panel object
        add(pa);

        // Function to close the operation of JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Function to set the size of JFrame
        setSize(300,300);

        // setVisible
        setVisible(true);

    }


}

class MainFrame{
     // Main method
    public static void main(String[] args) {
        // calling the constructor
        new ExamBorLayOne();
    }
}
