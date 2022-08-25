package TryItOut;
import java.time.LocalTime; // import API local time

public class Tch9_2 {
    public static void main(String[] args) {
        // create objects
        var flight1 = new AirplaneFlight(111, Airport.EWR, Airport.SFO);
        var flight2 = new AirplaneFlight(222, Airport.JFK, LocalTime.of(2, 14),
                Airport.LAX, LocalTime.of(6, 19));

        // display method
        flight1.display(); // have no departure and arriving time
        flight2.display(); // have departure and arriving time
    }
}
