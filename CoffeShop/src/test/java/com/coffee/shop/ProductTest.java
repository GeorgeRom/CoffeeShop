package com.coffee.shop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void testIsBeverage() {
        Product beverage = new Product(1, "Coffee small", 2.50,true, false);
        Product extra = new Product(4, "Extra milk", 0.30,true, true);

        Assertions.assertTrue(beverage.isBeverage());
        Assertions.assertFalse(extra.isBeverage());
    }

    @Test
    void testIsExtra() {

    }
}
