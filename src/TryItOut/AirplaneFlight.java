package TryItOut;
import java.time.LocalTime;

public class AirplaneFlight {
    private int flightNumber;
    private Airport departureAirport;
    private LocalTime departureTime;
    private Airport arrivalAirport;
    private LocalTime arrivalTime;

    public AirplaneFlight(int flightNumber,
                          Airport departureAirport, LocalTime departureTime,
                          Airport arrivalAirport, LocalTime arrivalTime) {
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.arrivalAirport = arrivalAirport;
        this.arrivalTime = arrivalTime;
    }

    public AirplaneFlight(int flightNumber,
                          Airport departureAirport, Airport arrivalAirport) {
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public void display() {
        String info = "Flight:" + flightNumber + "; ";
        info += "From:" + departureAirport;
        if (departureTime != null) { // if depart time is not equal null
            info += " at " + departureTime;
        }
        info += "; ";
        info += "To:" + arrivalAirport;
        if (arrivalTime != null) { // if arrival time is not equal null
            info += " at " + arrivalTime;
        }
        System.out.println(info);
    }

    // set and get
    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(Airport departureAirport) {
        this.departureAirport = departureAirport;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(Airport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
}
