package com.coffee.shop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class Receipt {

    private List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String printOrder() {
        return "";
    }

    public String printReceipt(){

        String receiptList = "";
        for (Product product: products
        ) {
            receiptList += String.format("[%d] %s .......... %f0.2\n", product.getId(), product.getDesc(), product.getPrice());
        }
        receiptList += "Date: " + LocalDate.now() + "\n\n";
        receiptList += "Cashier: Rosa Maria\n";

        return receiptList;
    }
}
