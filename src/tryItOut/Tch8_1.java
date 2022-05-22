package tryItOut;
import java.util.Scanner;

public class Tch8_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  // compound reference with new file

        // create object PlaceToLive, set value and asking user input
        PlaceToLive place1 = new PlaceToLive();
        place1.setAddress("111 Main Street");
        place1.setArea(600);
        place1.setNumberBedrooms(2);
        System.out.print("Cost of " + place1.getAddress() + ": ");
        double cost1 = in.nextDouble();

        PlaceToLive place2 = new PlaceToLive();
        place2.setAddress("222 Java Road");
        place2.setArea(1000);
        place2.setNumberBedrooms(1);
        System.out.print("Cost of " + place2.getAddress() + ": ");
        double cost2 = in.nextDouble();

        // Display the place's address and cost per unit area and cost per bedroom
        System.out.println(place1.getAddress());
        System.out.println("  Cost per unit area: " + cost1 / place1.getArea());
        System.out.println("  Cost per bedroom: " + cost1 / place1.getNumberBedrooms());

        System.out.println(place2.getAddress());
        System.out.println("  Cost per unit area: " + cost2 / place2.getArea());
        System.out.println("  Cost per bedroom:   " + cost2 / place2.getNumberBedrooms());
    }

}
