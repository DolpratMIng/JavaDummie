package TryItOut;
import com.company.DummiesFrame;

public class Tch11_4 {
    // gui interface
    public static void main(String[] args) {
        DummiesFrame frame = new DummiesFrame("Hotel"); // create DummiesFrame object
        frame.addRow("Room number"); // add row
        frame.setButtonText("Number of Guests in the Room"); // add button
        frame.go(); // running the gui
    }
    // logical function
    public static int calculate(int room){
        int guests[] = {1,4,2,0,2,1,4,3,0,2}; // create array
        return guests[room]; // return the value
    }
}
