package TryItOut;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit; // import API for finding the distance of time

public class AirplaneFlightWithDuration extends AirplaneFlight{
    // inherited constructor
    public AirplaneFlightWithDuration(int flightNumber,
                                      Airport departureAirport, LocalTime departureTime,
                                      Airport arrivalAirport, LocalTime arrivalTime) {
        super(flightNumber, departureAirport, departureTime,
                arrivalAirport, arrivalTime);
    }

    public AirplaneFlightWithDuration(int flightNumber,
                                      Airport departureAirport, Airport arrivalAirport) {
        super(flightNumber, departureAirport, arrivalAirport);
    }

    // duration method
    public long duration() {
        if (getArrivalTime() != null && getDepartureTime() != null) {
            return ChronoUnit.MINUTES.between
                    (getDepartureTime(), getArrivalTime());
        } else {
            return 0L;
        }

    }
}
