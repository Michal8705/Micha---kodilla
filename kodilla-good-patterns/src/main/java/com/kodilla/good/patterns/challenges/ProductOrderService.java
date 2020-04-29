package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    public static void main(String[] args) {

        SaleRequestRetriver saleRequestRetriever = new SaleRequestRetriver();
        SaleRequest saleRequest = saleRequestRetriever.retrive();

        SaleProcessor saleProcessor = new SaleProcessor( new EmailSend(), new SaleService());
        saleProcessor.process(saleRequest);
    }
}
