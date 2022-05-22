package tryItOut;
import javax.swing.JOptionPane; // JOptionPane API class

public class Tch5_1 {
    public static void main(String[] args) {
        String username = JOptionPane.showInputDialog("Username:"); // variable for user input
        String password = JOptionPane.showInputDialog("Password:"); // variable for user input

        // if else statement
        if(
              //  username != null && password != null &&
              // !(username == null && password == null) &&
              //  username != null || password != null &&
                !(username == null || password == null) &&
                        (
                            (username.equalsIgnoreCase("bburd")) && password.equalsIgnoreCase("swordfish") ||
                            (username.equalsIgnoreCase("hritter")) && password.equalsIgnoreCase("preakston") ||
                            (username.equalsIgnoreCase("Ming")) && password.equalsIgnoreCase("long")
                        )
        )
        {
            JOptionPane.showMessageDialog(null, "You are in.");
        } else {
            JOptionPane.showMessageDialog(null, "You're suspicious.");
        }
    }
}
