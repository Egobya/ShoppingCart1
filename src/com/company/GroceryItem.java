package com.company;
import java.util.Scanner;
public class GroceryItem {
String name;
double price;
    Scanner keyboard = new Scanner(System.in);

    public GroceryItem(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}