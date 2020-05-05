package com.kodilla.good.patterns.challenges.Airline;


public class Aplication {

    public static void main(String[] args) {

        FindArrival flight1 = new FindArrival("Moscow");
        FindDeparture flight2 = new FindDeparture("Warsow");
        FindTransfer flight3 = new FindTransfer("Moscow");

        Search finder1 = new Search();

        finder1.flightTo(flight1);
        finder1.flightFrom(flight2);
        finder1.flightTransfer(flight3);
    }
}
