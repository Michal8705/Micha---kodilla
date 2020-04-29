package com.kodilla.good.patterns.challenges;

public class SaleRequest {

    private User user;
    private Product product;

    public SaleRequest(final User user, final Product product) {
        this.user = user;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }
}
