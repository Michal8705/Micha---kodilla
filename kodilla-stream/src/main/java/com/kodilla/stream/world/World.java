package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class  World {
    private final Set<Continent> continents = new HashSet<>();

    public void addItem(Continent conitinent) {
        continents.add(conitinent);
           }

    public BigDecimal checkPpl() {
        Set<Country> countries = continents.stream()
                .flatMap(user -> user.getCountries().stream())
                .collect(Collectors.toSet());

        BigDecimal totalPeoples = countries.stream()
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return totalPeoples;

    }
}