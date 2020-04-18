package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String name;
    private final String people;

    public Country(final String name, final String peoples) {
        this.name = name;
        this.people = peoples;
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal sandQuantity = new BigDecimal(people);
        return sandQuantity;
    }
}