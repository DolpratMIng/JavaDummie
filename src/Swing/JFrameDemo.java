package Swing;

import javax.swing.*;

public class JFrameDemo {
    public static void main(String[] args) {
        //Run this program on the Event Dispatch Thread(EDT)
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                //JFrameTwo frame2 = new JFrameTwo();

                JPanelOne frame3 = new JPanelOne();

                //BorLayOne frame = new BorLayOne();



            }
        });
    }
}
