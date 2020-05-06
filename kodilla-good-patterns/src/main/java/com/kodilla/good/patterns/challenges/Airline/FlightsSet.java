package com.kodilla.good.patterns.challenges.Airline;

import java.util.HashSet;
import java.util.Set;

public final class FlightsSet {

    private final Set<Flight> flightsList;

    public FlightsSet() {
        flightsList = new HashSet<>();
        flightsList.add(new Flight("Warsow", "Berlin"));
        flightsList.add(new Flight("Berlin", "Moscow"));
        flightsList.add(new Flight("Berlin", "Paris"));
        flightsList.add(new Flight("Warsow", "Moscow"));
        flightsList.add(new Flight("Warsow", "Paris"));
    }

    public Set<Flight> getFlightsList() {
        return flightsList;
    }
}
