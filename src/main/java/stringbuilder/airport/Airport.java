package stringbuilder.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public String getDeletedFlights() {
        StringBuilder deletedFlights = new StringBuilder("Törölt járatok: ");
        for (Flight actual : flights) {
            if (actual.getStatus() == Status.DELETED) {
                deletedFlights.append("\n");
                deletedFlights.append(actual.getFlightNumber());
            }
        }
        return deletedFlights.toString();
    }

    public static void main(String[] args) {
        Airport airport = new Airport();
        airport.addFlight(new Flight("B-2351", Status.ACTIVE));
        airport.addFlight(new Flight("N-312561", Status.DELETED));
        airport.addFlight(new Flight("S-35", Status.DELETED));
        System.out.println(airport.getDeletedFlights());
    }
}
