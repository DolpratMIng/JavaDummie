package ATry;

import javax.swing.*;

public class TryRunningFrame {
    public static void main(String[] args) {
        //Run this program on the Event Dispatch Thread(EDT)
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                TryJPanelExamOne fOne = new TryJPanelExamOne();
            }
        });

    }
}
