package com.kodilla.patterns2.decorator.pizza;


import java.math.BigDecimal;

public class ExtraCocaColaDecorator extends AbstractPizzaOrderDecorator {
    public ExtraCocaColaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10));
    }

    @Override
    public String getIngredient() {
        return super.getIngredient() + " + 1 bottle of CocaCola";
    }
}