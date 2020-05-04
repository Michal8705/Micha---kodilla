package com.kodilla.good.patterns.challenges.Airline;

import java.util.HashSet;
import java.util.Set;

public final class FlightsSet {

    private final Set<Flights> flightsList;

    public FlightsSet() {
        flightsList = new HashSet<>();
        flightsList.add(new Flights("Warsow", "Berlin"));
        flightsList.add(new Flights("Berlin", "Moscow"));
        flightsList.add(new Flights("Warsow", "Moscow"));
    }

    public Set<Flights> getFlightsList() {
        return flightsList;
    }
}
