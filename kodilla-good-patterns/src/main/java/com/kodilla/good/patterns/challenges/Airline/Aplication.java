package com.kodilla.good.patterns.challenges.Airline;


public class Aplication {

    public static void main(String[] args) {

        FlightsFinderRequest flightsFinderRequest1 = new FlightsFinderRequest(new FindArrival("Moscow"));
        FlightsFinderRequest flightsFinderRequest2 = new FlightsFinderRequest(new FindDeparture("Berlin"));
        FlightsFinderRequest flightsFinderRequest3 = new FlightsFinderRequest(new FindTransfer());

        flightsFinderRequest1.process();
        flightsFinderRequest2.process();
        flightsFinderRequest3.process();
    }
}
