package org.example;

import java.util.Map;

public class Pizza {
    private String dough;
    private String sauce;
    private String cheese;
    private int toppingType;
    private String[] toppings;

    public static int TYPE_NON_VEGETARIAN = 2;
    public static int TYPE_VEGETARIAN = 1;
    public static int TYPE_VEGAN = 0;

    public Pizza() {
        dough = "";
        sauce = "";
        cheese = "";
        toppingType = TYPE_NON_VEGETARIAN;
    }

    public Pizza(String dough, String sauce, String cheese) {
        dough = dough;
        sauce = sauce;
        cheese = cheese;
        toppingType = TYPE_NON_VEGETARIAN;
    }

    public void setPizzaDough(String dough) {
        this.dough = dough;
    }

    public void setPizzaSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setPizzaCheese(String cheese) {
        this.cheese = cheese;
    }

    public void setPizzaToppingType(int toppingType) {
        this.toppingType = toppingType;
    }

    public void setPizzaToppings(String[] toppings) {
        this.toppings = toppings;
    }

    public int getToppingType() {
        return toppingType;
    }

    public String getPizza() {
        String pizzaStr = "";
        pizzaStr += "Dough: " + this.dough + "\n";
        pizzaStr += "Sauce: " + this.sauce + "\n";
        pizzaStr += "Cheese: " + this.cheese + "\n";
        pizzaStr += "Topping: " + String.join(", ", this.toppings) + "\n";
        return pizzaStr;
    }
}
