package com.kodilla.good.patterns.challenges.Airline;

public class Flights {

    private final String departure;
    private final String arrival;

    public Flights(final String departure, final String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flights flight = (Flights) o;

        if (!departure.equals(flight.departure)) return false;
        return arrival.equals(flight.arrival);
    }

    @Override
    public int hashCode() {
        int result = departure.hashCode();
        result = 7 * result + arrival.hashCode();
        return result;
    }
}