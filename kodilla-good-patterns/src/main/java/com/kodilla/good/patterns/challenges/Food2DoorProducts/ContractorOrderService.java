package com.kodilla.good.patterns.challenges.Food2DoorProducts;

import com.kodilla.good.patterns.challenges.*;

public class ContractorOrderService {
    public static void main(String[] args) {

        Contractor contractor1 = new HealthyShop();
        ContractorProduct product1 = new ContractorProduct("apple",5.00);
        Contractor contractor2 = new GlutenFreeShop();
        ContractorProduct product2 = new ContractorProduct("strawberry",7.00);

        ContractorOrder contractorOrder1 = new ContractorOrder(contractor1,product1,100);
        ContractorOrder contractorOrder2 = new ContractorOrder(contractor2,product2,50);

        ContractorProcessor contractorProcessor = new ContractorProcessor();
        contractorProcessor.process(contractorOrder1);
        contractorProcessor.process(contractorOrder2);
    }
}
