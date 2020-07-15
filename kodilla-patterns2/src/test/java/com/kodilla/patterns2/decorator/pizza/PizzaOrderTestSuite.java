package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(20), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetIngredient() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        String ingredients = pizzaOrder.getIngredient();
        //Then
        assertEquals("Pizza", ingredients);
    }

    @Test
    public void testPizzaTomatoDoubleCheeseOneHourGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new TomatoDecorator(pizzaOrder);
        pizzaOrder = new DoubleCheeseDecorator(pizzaOrder);
        pizzaOrder = new OneHourDeliveryDecorator(pizzaOrder);
        //When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(37), calculatedCost);
    }

    @Test
    public void testPizzaTomatoDoubleCheeseOneHourGetIngredient() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new TomatoDecorator(pizzaOrder);
        pizzaOrder = new DoubleCheeseDecorator(pizzaOrder);
        pizzaOrder = new OneHourDeliveryDecorator(pizzaOrder);
        //When
        String ingredients = pizzaOrder.getIngredient();
        //Then
        assertEquals("Pizza + tomatos + double cheese + one hour on delivery", ingredients);
    }
}