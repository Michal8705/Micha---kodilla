package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetValueToPay() {
        //Given
        Country poland = new Country("Poland", "1000000");
        Country germany = new Country("Germany", "2000000");
        Country china = new Country("China", "3000000");
        Country india = new Country("India", "4000000");

        Continent europa = new Continent();
        europa.addItem(poland);
        europa.addItem(germany);

        Continent asia = new Continent();
        asia.addItem(china);
        asia.addItem(india);

        //When
        World world = new World();
        world.addItem(europa);
        world.addItem(asia);

        //Then
        BigDecimal expectedPpl = new BigDecimal("10000000");
        Assert.assertEquals(expectedPpl, world.checkPpl());
    }
}
