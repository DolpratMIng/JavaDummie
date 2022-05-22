package tryItOut;
// importing API
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Tch8_3 {
public static void main(String[] args) throws  IOException{ // precautions about the file
    Scanner diskScanner = new Scanner(new File("place.txt")); // create Scanner & new File object
                                                                                 // diskScanner stand for PlaceToLiveInfo.txt
    Scanner keyboard = new Scanner(System.in); //for keyboard user input

    // create place1 object
    PlaceToLive place1 = new PlaceToLive();

    // read the text from the file and set it as variable for place1
    place1.setAddress(diskScanner.nextLine());
    place1.setArea(diskScanner.nextDouble());
    place1.setNumberBedrooms(diskScanner.nextInt());
    // Ask the cost for place1
    System.out.print("Cost of " + place1.getAddress() + ": ");
    double cost1 = keyboard.nextDouble();

    diskScanner.nextLine(); // rule to put diskScanner.nextLine() after the double primitive type

    // read the text from the file and set it as variable for place2
    PlaceToLive place2 = new PlaceToLive();
    place2.setAddress(diskScanner.nextLine());
    place2.setArea(diskScanner.nextDouble());
    // Ask the cost for place 2
    place2.setNumberBedrooms(diskScanner.nextInt());
    System.out.print("Cost of " + place2.getAddress() + ": ");
    double cost2 = keyboard.nextDouble();



    // Display the for place1 and 2
    System.out.println(place1.getAddress());
    System.out.println(" Cost per unit area: " + cost1/place1.getArea());
    System.out.println(" Cost per bedroom: " + cost1/place1.getNumberBedrooms());

    System.out.println(place2.getAddress());
    System.out.println(" Cost per unit area: " + cost2/ place2.getArea());
    System.out.println(" Cost per bedroom: " + cost2/ place2.getNumberBedrooms());

    diskScanner.close(); //terminate the connection
    keyboard.close(); // terminate the connection


    }
}
