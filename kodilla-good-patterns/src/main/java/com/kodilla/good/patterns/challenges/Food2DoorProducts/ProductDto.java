package com.kodilla.good.patterns.challenges.Food2DoorProducts;

public class ProductDto {

    private Contractor contractor;
    private boolean status;

    public ProductDto(Contractor contractor, boolean status) {
        this.contractor = contractor;
        this.status = status;
    }
}
