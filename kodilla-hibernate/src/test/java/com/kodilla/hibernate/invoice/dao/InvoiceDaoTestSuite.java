package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {

        //Given
        Item item1 = new Item(new BigDecimal("2.00"), 2);
        Item item2 = new Item(new BigDecimal("3.50"), 4);
        Item item3 = new Item(new BigDecimal("8.00"), 1);
        Item item4 = new Item(new BigDecimal("4.50"), 6);
        Product product1 = new Product("Product 1");
        Product product2 = new Product("Product 2");

        product1.getItems().add(item1);
        product1.getItems().add(item2);
        product1.getItems().add(item3);
        product2.getItems().add(item4);
        item1.setProduct(product1);
        item2.setProduct(product1);
        item3.setProduct(product1);
        item4.setProduct(product2);

        Invoice invoice = new Invoice("FK1");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        int productId = product1.getId();
        int itemId = item1.getId();

        //Then
        Assert.assertNotEquals(0, invoiceId);
        Assert.assertNotEquals(0, productId);
        Assert.assertNotEquals(0, itemId);
        
        //CleanUp

        invoiceDao.deleteById(invoiceId);
    }
}
