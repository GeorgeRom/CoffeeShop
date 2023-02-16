package com.coffee.shop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) {

        try {
            new App().RunCoffeeOrders();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(1);
        }
    }

    private void RunCoffeeOrders() throws IOException {
        Receipt receipt = new Receipt();

        String message2TheClients = "Please select your item and enter '0' to place your order: \n"
                + "1 - Coffee (small, medium, large) 2.50 CHF, 3.00 CHF, 3.50 CHF\n"
                + "2 - Bacon Roll 4.50 CHF\n"
                + "3 - Freshly squeezed orange juice (0.25l) 3.95 CHF\n"
                + "Extras:\n"
                + "4 - Extra milk 0.30 CHF\n"
                + "5 - Foamed milk 0.50 CHF\n"
                + "6 - Special roast coffee 0.90 CHF\n\n"
                + "0 - To close order\n";

        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);
        boolean closeOrder = false;
        int beverageCounter = 0;

        System.out.println(message2TheClients);
        while(!closeOrder) {
            String customerInput = br.readLine();


            if (customerInput.matches("[a-zA-Z_]+")){
                System.out.println("Invalid input. Please enter a number to continue");
                continue;
            }


            if(customerInput.equals("0")) {
                closeOrder = true;
                System.out.println("Thanks for visiting us. Your order with " + receipt.getProducts().size() + " items will be closed.");
                continue;
            }

            Product product = ProductFactory.createProduct(Integer.parseInt(customerInput));

            if(product.isBeverage())
                beverageCounter++;

            if(beverageCounter > 0 && beverageCounter % 5 == 0)
                product.setPrice(0);

            receipt.getProducts().add(product);
            System.out.println("Added to your basket '" + product+ "'");
        }

        System.out.println("Thanks for visiting us. Please come back soon! ");
        System.out.println( receipt.printReceipt());

    }
}
