package org.example;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;


public class PizzaBuilder {
    private Pizza pizza;

    public static String[] DOUGHS = {"dough1", "dough2", "dough3"};
    public static String[] SAUCES = {"sauce1", "sauce2", "sauce3", "sauce4", "sauce5", "sauce6"};
    public static String[] CHESSES = {"cheese1", "cheese2", "cheese3", "cheese4", "cheese5", "cheese6", "cheese7", "cheese8", "cheese9", "cheese10"};

    public static Map<Integer, String[]> TOPPINGS = Map.of(
            Pizza.TYPE_VEGAN, new String[]{"vegan1", "vegan2", "vegan3", "vegan4"},
            Pizza.TYPE_VEGETARIAN, new String[]{"vegetarian1", "vegetarian2", "vegetarian3"},
            Pizza.TYPE_NON_VEGETARIAN, new String[]{"nonvegetarian1", "nonvegetarian2", "nonvegetarian3", "nonvegetarian4", "nonvegetarian5", "nonvegetarian6"}
    );

    public PizzaBuilder() {
        pizza = new Pizza();
    }

    public void setPizzaDough () {
        System.out.println("Wir have doughs: " +  String.join(", ", DOUGHS) + ". Plese enter your choice: ");
        String selectDough = getUserInput();
        while (!Arrays.stream(DOUGHS).anyMatch(selectDough::equals)) {
            System.out.println("Your choice is not found in " +  String.join(", ", DOUGHS) + ". Plese enter your choice: ");
            selectDough = getUserInput();
        }
        pizza.setPizzaDough(selectDough);
    }

    public void setPizzaSauce () {
        System.out.println("Wir have sauces: " +  String.join(", ", SAUCES) + ". Plese enter your choice: ");
        String selectSauce = getUserInput();
        while (!Arrays.stream(SAUCES).anyMatch(selectSauce::equals)) {
            System.out.println("Your choice is not found in " +  String.join(", ", SAUCES) + ". Plese enter your choice: ");
            selectSauce = getUserInput();
        }
        pizza.setPizzaSauce(selectSauce);
    }

    public void setPizzaCheese () {
        System.out.println("Wir have cheeses: " +  String.join(", ", CHESSES) + ". Plese enter your choice: ");
        String selectCheese = getUserInput();
        while (!Arrays.stream(CHESSES).anyMatch(selectCheese::equals)) {
            System.out.println("Your choice is not found in " +  String.join(", ", CHESSES) + ". Plese enter your choice: ");
            selectCheese = getUserInput();
        }
        pizza.setPizzaCheese(selectCheese);
    }

    public void setPizzaType () {
        System.out.println("Wir have types: " + Pizza.TYPE_NON_VEGETARIAN + ": Non-Vegetarian, " + Pizza.TYPE_VEGETARIAN + ": Vegetarian, " + Pizza.TYPE_VEGAN + ": Vegan. Plese enter your choice number: ");
        int selectType = Integer.parseInt(getUserInput());
        while (selectType != Pizza.TYPE_VEGETARIAN && selectType != Pizza.TYPE_VEGAN && selectType != Pizza.TYPE_NON_VEGETARIAN) {
            System.out.println("Your choice is not found in " + Pizza.TYPE_NON_VEGETARIAN + ", " + Pizza.TYPE_VEGETARIAN  + ", " +  Pizza.TYPE_VEGAN + ". Plese enter your choice: ");
            selectType = Integer.parseInt(getUserInput());
        }
        pizza.setPizzaToppingType(selectType);
    }

    public void setPizzaToppings () {
        String toppingStr = String.join(", ", TOPPINGS.get(Pizza.TYPE_VEGAN));
        if (pizza.getToppingType() >= Pizza.TYPE_VEGETARIAN) {
            toppingStr += ", " + String.join(", ", TOPPINGS.get(Pizza.TYPE_VEGETARIAN));
        }
        if (pizza.getToppingType() >= Pizza.TYPE_NON_VEGETARIAN) {
            toppingStr += ", " + String.join(", ", TOPPINGS.get(Pizza.TYPE_NON_VEGETARIAN));
        }
        System.out.println("Wir have toppings: " +  toppingStr + ". Plese enter your choice mit \", \" spilt: ");
        String selectToppings = getUserInput();
        if (!selectToppings.equals("")) {
            String[] selectToppingArr = selectToppings.split(",");
            pizza.setPizzaToppings(selectToppingArr);
        }
    }

    public String getUserInput() {
        Scanner myObj = new Scanner(System.in);
        return myObj.nextLine();
    }

    public String getPizza() {
        return pizza.getPizza();
    }

}
