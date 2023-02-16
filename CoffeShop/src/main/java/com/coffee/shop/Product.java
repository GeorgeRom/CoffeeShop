package com.coffee.shop;

public class Product {

    private int id;
    private String desc;
    private double price;
    private boolean isBeverage;

    public Product() {    }

    public Product(int id, String desc, double price, boolean isBeverage, boolean isExtra) {
        this.id = id;
        this.desc = desc;
        this.price = price;
        this.isBeverage = isBeverage;
        this.isExtra = isExtra;
    }

    public boolean isBeverage() {
        return isBeverage;
    }

    public void setBeverage(boolean beverage) {
        isBeverage = beverage;
    }



    public boolean isExtra() {
        return isExtra;
    }

    public void setExtra(boolean extra) {
        isExtra = extra;
    }

    private boolean isExtra;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return desc + " / Price:  " + price + " CHF";
    }
}
