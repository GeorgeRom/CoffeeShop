package com.coffee.shop;

public class ProductFactory {

    private static Product actualProd = new Product();

    public static Product createProduct (int ProductId) {

        switch (ProductId){
            case 1:
                actualProd = new Product(1, "Coffee small", 2.50,true, false);
                break;
            case 2:
                actualProd = new Product(2, "Bacon Roll", 4.50,false, false);
                break;
            case 3:
                actualProd = new Product(3, " Freshly squeezed orange juice (0.25l) ", 3.95, true, false);
                break;
            case 4:
                actualProd = new Product(4, "Extra milk", 0.30,true, true);
                break;
            case 5:
                actualProd = new Product(5, "Foamed milk ", 0.50, true, true);
                break;
            case 6:
                actualProd = new Product(6, "Special roast coffee", 0.90, false, true);
                break;
        }

        return actualProd;
    }
}
