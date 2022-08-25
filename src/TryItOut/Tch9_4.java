package TryItOut;
import java.time.LocalTime;

public class Tch9_4 {
    public static void main(String[] args) {
        // create objects
        var flight1 =
                new AirplaneFlightWithDuration(111, Airport.EWR, Airport.SFO);
        var flight2 =
                new AirplaneFlightWithDuration(222, Airport.JFK, LocalTime.of(2, 14),
                        Airport.LAX, LocalTime.of(6, 19));



       // System.out.println(flight1.getString());
        long duration = flight1.duration();
        if (duration != 0L) {
            System.out.println("  Duration: " + duration + " minutes.");
        }

        duration = flight2.duration();
        //System.out.println(flight2.getString());
        if (duration != 0L) {
            System.out.println("  Duration: " + duration + " minutes.");
        }
    }

}

