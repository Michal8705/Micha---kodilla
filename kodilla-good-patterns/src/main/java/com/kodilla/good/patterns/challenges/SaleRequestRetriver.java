package com.kodilla.good.patterns.challenges;

public class SaleRequestRetriver {

    public SaleRequest retrive() {
        User user = new User("Mark", "Smith");
        Product product = new Product("TV SONY 1231", 1000);
        return new SaleRequest(user, product);
    }
}
