package com.kodilla.good.patterns.challenges;

public class SaleProcessor {

    private SaleService saleService;
    private InformationService informationService;

    public SaleProcessor(final InformationService informationService,
                         final SaleService saleService){
        this.informationService = informationService;
        this.saleService = saleService;
    }

    public saleDto process(final SaleRequest saleRequestRetriever) {
        boolean sold = saleService.sale(saleRequestRetriever.getUser(), saleRequestRetriever.getProduct());
        if (sold) {
            informationService.informUser(saleRequestRetriever.getUser());
            return new saleDto(saleRequestRetriever.getUser(), true);
        } else {
            return new saleDto(saleRequestRetriever.getUser(), false);
        }
    }
}
