package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class OneHourDeliveryDecorator extends AbstractPizzaOrderDecorator {
    public OneHourDeliveryDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getIngredient() {
        return super.getIngredient() + " + one hour on delivery";
    }
}