package controllers;

import models.Product;
import utils.Rounder;
import views.SalesView;


public class ProductController {

    Product model;
    SalesView view;


    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();


        String name = model.getName();


        double income = model.incomeCalculation(model.getQuantity(), model.getPrice());
        double tax = model.taxCalculation(income);
        double netIncome = model.incomeCalculation(income, tax);


        income = Rounder.round(income);
        tax = Rounder.round(tax);
        netIncome = Rounder.round(netIncome);



        String output = "Наименование товара: " + name + "\nОбщий доход (грн.): " + income + "\nСумма налога (грн.): " + tax + "\nЧистый доход (грн.): " + netIncome;

        view.getOutput(output);
    }
}
