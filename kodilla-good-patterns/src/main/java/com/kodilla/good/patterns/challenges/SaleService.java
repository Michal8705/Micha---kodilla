package com.kodilla.good.patterns.challenges;

public class SaleService {
    public boolean sale(final User user, final Product product) {
        System.out.println("Sell product : " + product.productName() + " which cost: " + product.productPrice() +
                " to " + user.getName() + " " + user.getSurname());
        return true;
    }
}
