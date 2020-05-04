package com.kodilla.good.patterns.challenges.Airline;

import java.util.Set;
import java.util.stream.Collectors;

public class FindArrival implements FlightsFinder{

    private String arrival;

    public FindArrival(String arrival) {
        this.arrival = arrival;
    }

    public void flightsFind() {

        Set<Flights> haveArrival = (new FlightsSet()).getFlightsList().stream()
                .filter(f -> f.getArrival().equals(arrival))
                .collect(Collectors.toSet());

        if (haveArrival.size() == 0) {
            System.out.println("No flights to " + arrival);
        } else {
            haveArrival.stream()
                    .map(f -> "Flight to " + f.getArrival() + " from " + f.getDeparture())
                    .forEach(System.out::println);
        }
    }
}

