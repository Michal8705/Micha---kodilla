package com.kodilla.good.patterns.challenges.Airline;

public class FlightsFinderRequest {

    FlightsFinder flightsFinder;

    public FlightsFinderRequest(FlightsFinder flightsFinder) {
        this.flightsFinder = flightsFinder;
    }

    public void process() {
        flightsFinder.flightsFind();
    }
}

