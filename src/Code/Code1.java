package Code;
import javax.swing.JOptionPane; // API JOptionPane class

public class Code1 {
    public static void main(String[] args) {
        String fname = JOptionPane.showInputDialog("Real name: "); // Jframe user input
        String lname = JOptionPane.showInputDialog("Last name: "); // Jframe user input
        int age = Integer.parseInt(JOptionPane.showInputDialog("Age: "));

        //if else
        if(
                fname != null && lname != null && //
                (
                (fname.equalsIgnoreCase("Dolprat") && lname.equalsIgnoreCase("Chuavallee") && age == 21) ||
                (fname.equalsIgnoreCase("Pantron") && lname.equalsIgnoreCase("Chuavallee") && age == 18)
                )
        )
        {
            JOptionPane.showMessageDialog(null, "You're successfully log in.");
        } else {
            JOptionPane.showMessageDialog(null, "The attending answer is not correct.");
        }


    }
}
