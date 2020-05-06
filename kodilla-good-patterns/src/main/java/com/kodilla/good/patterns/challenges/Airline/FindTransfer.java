package com.kodilla.good.patterns.challenges.Airline;

public class FindTransfer {

    private String departure;
    private String arrival;

    public FindTransfer(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }
    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

}