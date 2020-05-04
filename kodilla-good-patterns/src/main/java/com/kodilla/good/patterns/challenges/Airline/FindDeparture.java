package com.kodilla.good.patterns.challenges.Airline;

import java.util.Set;
import java.util.stream.Collectors;

public class FindDeparture implements FlightsFinder{

    private String departure;

    public FindDeparture(String departure) {
        this.departure = departure;
    }

    public void flightsFind() {

        Set<Flights> haveDeparture = (new FlightsSet()).getFlightsList().stream()
                .filter(f -> f.getDeparture().equals(departure))
                .collect(Collectors.toSet());

        if (haveDeparture.size() == 0) {
            System.out.println("No flights from " + departure);
        } else {
            haveDeparture.stream()
                    .map(f -> "Flight from " + f.getDeparture() + " to " + f.getArrival())
                    .forEach(System.out::println);
        }
    }
}
