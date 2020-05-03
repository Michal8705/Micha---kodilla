package com.kodilla.good.patterns.challenges.Food2DoorProducts;

public class ContractorOrder {

    private Contractor contractor;
    private ContractorProduct contractorProduct;
    private int quantity;

    public ContractorOrder(final Contractor contractor,
                           final ContractorProduct contractorProduct,
                           final int quantity) {
        this.contractor = contractor;
        this.contractorProduct = contractorProduct;
        this.quantity = quantity;
    }

    public Contractor getContractor() {
        return contractor;
    }

    public ContractorProduct contractorProduct() {
        return contractorProduct;
    }

    public int getQuantity() {
        return quantity;
    }

}
