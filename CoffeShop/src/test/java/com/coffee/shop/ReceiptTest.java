package com.coffee.shop;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReceiptTest {

    @org.junit.jupiter.api.Test
    void testGetProducts() {
        Receipt receipt = new Receipt();
        // Add some products to the list

        Product product1 = new Product(1, "Coffee small", 2.50,true, false);
        Product product2 = new Product(2, "Bacon Roll", 4.50,false, false);
        Product product3 = new Product(3, " Freshly squeezed orange juice (0.25l) ", 3.95, true, false);
        Product product4 = new Product(4, "Extra milk", 0.30,true, true);

        receipt.getProducts().add(product1);
        receipt.getProducts().add(product2);
        receipt.getProducts().add(product3);
        receipt.getProducts().add(product4);

        assertEquals(4, receipt.getProducts().size());
        assertEquals(product1, receipt.getProducts().get(0));
        assertEquals(product2, receipt.getProducts().get(1));
        assertEquals(product3, receipt.getProducts().get(2));
        assertEquals(product4, receipt.getProducts().get(3));
    }

    @org.junit.jupiter.api.Test
    void testSetProducts() {
        Receipt receipt = new Receipt();

        List<Product> products = new ArrayList<>();
        Product product1 = new Product(1, "Coffee small", 2.50,true, false);
        Product product2 = new Product(2, "Bacon Roll", 4.50,false, false);
        Product product3 = new Product(3, " Freshly squeezed orange juice (0.25l) ", 3.95, true, false);
        Product product4 = new Product(4, "Extra milk", 0.30,true, true);

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

        receipt.setProducts(products);

        assertEquals(4, receipt.getProducts().size());
        assertEquals(product1,receipt.getProducts().get(0));
        assertEquals(product2, receipt.getProducts().get(1));
        assertEquals(product3, receipt.getProducts().get(2));
        assertEquals(product4, receipt.getProducts().get(3));

    }
}
