package TryItOut;
import com.company.DummiesFrame;
public class Tch8_2 {
    public static void main(String[] args) {
      DummiesFrame frame = new DummiesFrame("Display the frame"); // create an instance
        frame.addRow("Address"); // addrow
        frame.addRow("Number of bedroom"); // addrow
        frame.addRow("Area"); // addrow
        frame.addRow("Cost"); // addrow
        frame.setButtonText("Display");
        frame.go(); // make the window app appear on the screen

    }
    public static String calculate(String address, int bedroom, double area, double cost){
        PlaceToLive myPlace = new PlaceToLive(); // create an object
        //set the value for object
        myPlace.setAddress(address);
        myPlace.setNumberBedrooms(bedroom);
        myPlace.setArea(area);


        return address + "; " + "Cost per unit area: " + (cost / myPlace.getArea()) + "; " +
                "Cost per bedroom: " + (cost / myPlace.getNumberBedrooms());
    }
}
