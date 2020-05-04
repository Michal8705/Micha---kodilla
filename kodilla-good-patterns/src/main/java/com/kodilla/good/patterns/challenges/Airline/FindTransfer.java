package com.kodilla.good.patterns.challenges.Airline;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindTransfer implements FlightsFinder {

    private FlightsSet flightsSet;

    public FindTransfer() {
        this.flightsSet = new FlightsSet();
    }

    public void flightsFind() {
        Set<Transfer> transfers = new HashSet<>();

        for (Flights flight: flightsSet.getFlightsList()) {
            Set<Transfer> connections = flightsSet.getFlightsList().stream()
                    .filter(f -> f.getDeparture().equals(flight.getArrival()) && !(f.getDeparture().equals(flight.getDeparture())))
                    .map(f -> new Transfer(flight.getDeparture(), f.getArrival(), f.getDeparture()))
                    .collect(Collectors.toSet());

            transfers.addAll(connections);
        }

        if (transfers.size() == 0) {
            System.out.println("No flights with transfer");
        } else {
            transfers.stream()
                    .map(f -> "Flight from " + f.getDeparture() + " to " + f.getArrival() + " with transfer in "  + f.getTransfer())
                    .forEach(System.out::println);
        }
    }
}