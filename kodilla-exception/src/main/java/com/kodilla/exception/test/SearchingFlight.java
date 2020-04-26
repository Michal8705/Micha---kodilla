package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchingFlight {

    Map<String, Boolean> flights = new HashMap<>();

    public SearchingFlight () {
        flights.put("Cracow", true);
        flights.put("Warsaw", false);
        flights.put("Berlin", true);
    }

    public void findFlight(Flight flight) throws  RouteNotFoundException {
        int airport = 0;
        int possibleFlight = 0;
        for (Map.Entry<String, Boolean> entry : flights.entrySet()) {
            if (flight.getArrivalAirport().equals(entry.getKey())) {
                airport = 1;
                if (entry.getValue() == true) {
                    possibleFlight = 1;
                }
            }
        }

        if (airport == 0) {
            throw new RouteNotFoundException("There is no such airport");
        } else {
            if (possibleFlight == 1) {
            System.out.println("Your flight to " + flight.getArrivalAirport() + " from " + flight.getDepartureAirport());
            } else {
            System.out.println("There is no flight");
            }
        }
    }
}
