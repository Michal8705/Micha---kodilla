package com.kodilla.good.patterns.challenges.Food2DoorProducts;

public class ExtraFoodShop implements Contractor{

    private String name;
    public ExtraFoodShop() {
        this.name = "ExtraFoodShop";
    }

    public boolean orderProcess(ContractorOrder contractorOrder) {
        System.out.println("New order:"  + "\n" +
                "Shop - "+ contractorOrder.getContractor().getName() + "\n" +
                "Product - "+ contractorOrder.contractorProduct().productName() + "\n" +
                "Quantity - "+ contractorOrder.getQuantity() + "\n" +
                "Price - "+ contractorOrder.getQuantity() * contractorOrder.contractorProduct().productPrice());
        return true;
    }

    public String getName() {
        return name;
    }
}
