package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        pizzaBuilder.setPizzaDough();
        pizzaBuilder.setPizzaSauce();
        pizzaBuilder.setPizzaCheese();
        pizzaBuilder.setPizzaType();
        pizzaBuilder.setPizzaToppings();
        String pizza = pizzaBuilder.getPizza();
        System.out.println(pizza);
    }
}