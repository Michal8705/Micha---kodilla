package com.kodilla.good.patterns.challenges.Food2DoorProducts;

public class ContractorProcessor {

    public ProductDto process(final ContractorOrder contractorOrder) {
        boolean order = contractorOrder.getContractor().orderProcess(contractorOrder);
        if (order) {
            return new ProductDto(contractorOrder.getContractor(), true);
        } else {
            return new ProductDto(contractorOrder.getContractor(), false);
        }
    }
}
