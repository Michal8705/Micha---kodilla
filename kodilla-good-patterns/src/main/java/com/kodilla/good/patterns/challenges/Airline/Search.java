package com.kodilla.good.patterns.challenges.Airline;


import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Search {

    public void flightTo(FindArrival findArrival) {

        Set<Flight> haveArrival = (new FlightsSet()).getFlightsList().stream()
                .filter(f -> f.getArrival().equals(findArrival.getArrival()))
                .collect(Collectors.toSet());

        if (haveArrival.size() == 0) {
            System.out.println("No flights to " + findArrival.getArrival());
        } else {
            haveArrival.stream()
                    .map(f -> "Flight to " + f.getArrival() + " from " + f.getDeparture())
                    .forEach(System.out::println);
        }
    }

    public void flightFrom(FindDeparture findDeparture) {

        Set<Flight> haveDeparture = (new FlightsSet()).getFlightsList().stream()
                .filter(f -> f.getDeparture().equals(findDeparture.getDeparture()))
                .collect(Collectors.toSet());

        if (haveDeparture.size() == 0) {
            System.out.println("No flights from " + findDeparture.getDeparture());
        } else {
            haveDeparture.stream()
                    .map(f -> "Flight from " + f.getDeparture() + " to " + f.getArrival())
                    .forEach(System.out::println);
        }
    }

    public void flightTransfer(FindTransfer findTransfer) {
        Set<Transfer> transfers = new HashSet<>();
        FlightsSet flightsSet = new FlightsSet();

        for (Flight flight: flightsSet.getFlightsList()) {
            Set<Transfer> connections = flightsSet.getFlightsList().stream()
                    .filter(f -> f.getDeparture().equals(flight.getArrival()) && !(f.getArrival().equals(flight.getDeparture())))
                    .map(f -> new Transfer(flight.getDeparture(), f.getArrival(), f.getDeparture()))
                    .collect(Collectors.toSet());

            transfers.addAll(connections);
        }

        if (transfers.size() == 0) {
            System.out.println("No flights with transfer");
        } else {
            transfers.stream()
                    .filter(f -> f.getArrival().equals(findTransfer.getArrival()) && f.getDeparture().equals(findTransfer.getDeparture()))
                            .map(f -> "Flight from " + f.getDeparture() + " to " + f.getArrival() + " with transfer in "  + f.getTransfer())
                    .forEach(System.out::println);
        }
    }

}
