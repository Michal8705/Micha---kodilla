package com.kodilla.stream.world;
import java.util.ArrayList;
import java.util.List;


public final class Continent {
    private final List<Country> Countries = new ArrayList<>();

    public void addItem(Country Country) {
        Countries.add(Country);
    }

    public List<Country> getCountries() {
        return Countries;
    }
}
