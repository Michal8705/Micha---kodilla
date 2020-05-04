package com.kodilla.good.patterns.challenges.Food2DoorProducts;

public class GlutenFreeShop implements Contractor{

    private String name;
    public GlutenFreeShop() {
        this.name = "GlutenFreeShop";
    }

    public boolean orderProcess(ContractorOrder contractorOrder) {
        System.out.println("New order:" + "\n" +
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
