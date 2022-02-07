package models;

import base.Fiscal;
import base.Income;

public class Product implements Fiscal, Income {


    private String name;
    private int quantity;
    private double price;

    final double TAX_RATE = 0.05;


    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    @Override public double incomeCalculation(int quantity, double price) {
        return quantity * price;
    }


    @Override public double taxCalculation(double income) {
        return income * TAX_RATE;
    }


    @Override public double incomeCalculation(double income, double tax) {
        return income - tax;
    }
}
