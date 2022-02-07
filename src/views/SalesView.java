package views;

import models.Product;

import java.util.Scanner;

import static utils.Validator.*;

public class SalesView {

    String title;
    String name;
    int quantity;
    double price;
    Scanner scanner;
    Product model;


    public SalesView(Product model) {
        this.model = model;
    }

    public void getInputs() {

        scanner = new Scanner(System.in);

        title = "Введите наименование товара: ";

        getOutput(title);
        name = validateName(scanner);
        model.setName(name);


        title = "Введите количество: ";

        getOutput(title);
        quantity = validateQuantityInput(scanner);
        model.setQuantity(quantity);


        title = "Введите цену: ";

        getOutput(title);
        price = validatePriceInput(scanner);
        model.setPrice(price);

        scanner.close();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
