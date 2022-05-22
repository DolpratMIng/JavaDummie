package tryItOut;

import com.company.DummiesFrame; // import DummiesFrame

public class Tch7_2 {

    // main method
    public static void main(String[] args) {
        DummiesFrame frame = new DummiesFrame("Calculate the tax"); // create object
        frame.addRow("Organization's name"); // frame object's add row method
        frame.addRow("Annual revenue"); // frame object's add row method
        frame.addRow("status(For profit? (Y/N)"); // frame object's add row method
        frame.setButtonText("Display"); // frame set button text
        frame.go(); // a call to the frame object's go method

    }

    // The header of the calculate method
    public static String calculate(String name, double revenue, String status) {

        Organization organ1 = new Organization(); // create object
        organ1.name = name; // set the object's name
        organ1.revenue = revenue; // set the object's revenue value

        double tax; // create tax valuable
        // if else statement
        if(status.equals("Y")) {
            tax = revenue * 0.10; // expression
        } else{
            tax = revenue * 0.02; // expression
        }
        return "Taxi: " + tax;
    }
}
