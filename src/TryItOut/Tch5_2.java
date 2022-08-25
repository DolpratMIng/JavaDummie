package TryItOut;
import javax.swing.JOptionPane; // JOptionPane API class

public class Tch5_2 {
    public static void main(String[] args) {

        //JOptionPane API class compound reference
        String username = JOptionPane.showInputDialog("Username:");
        String password = JOptionPane.showInputDialog("Password:");


        if(username == null||password == null){ // if username and pass = null
            JOptionPane.showMessageDialog(null,"Not enough information");
        } else if(
                (username.equalsIgnoreCase("bburd") && password.equalsIgnoreCase("swordfish")) ||
                (username.equalsIgnoreCase("hritter") && password.equalsIgnoreCase("preakston"))
        )
        {
            JOptionPane.showMessageDialog(null, "You are in.");
        } else{
            JOptionPane.showMessageDialog(null, "You're suspicious.");
        }
    }
}
