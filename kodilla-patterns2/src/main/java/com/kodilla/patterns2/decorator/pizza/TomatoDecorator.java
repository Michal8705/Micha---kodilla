package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class TomatoDecorator extends AbstractPizzaOrderDecorator {
    public TomatoDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(7));
    }

    @Override
    public String getIngredient() {
        return super.getIngredient() + " + tomatos";
    }
}
