package com.kodilla.good.patterns.challenges.Food2DoorProducts;

public class ContractorProduct {

    private String productName;
    private double productPrice;

    public ContractorProduct(String productName, double productPrice) {
            this.productName = productName;
            this.productPrice = productPrice;
        }

    public String productName() {
            return productName;
        }

    public double productPrice() {
            return productPrice;
        }
}
