package com.kodilla.exception.test;

public class FlightRunner {
    public static void main(String[] args) {

        Flight flight1 = new Flight("Cracow", "Budapest");
        Flight flight2 = new Flight("Berlin", "Warsaw");
        SearchingFlight searchingFlight = new SearchingFlight();

        try {
            searchingFlight.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("There is no such airport");
        } finally {
            System.out.println("Still working");
        }
        try {
            searchingFlight.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println("There is no such airport");
        } finally {
            System.out.println("Still working");
        }
    }
}
