package DesignPattern.FactoryDesignPatterm;

import java.util.ArrayList;

public abstract class Pizza {

    String name;

    String dough;

    String sauce;

    ArrayList<String> toppings = new ArrayList<String>();

    void prepare(){
        System.out.printf("Preparing " + name);

        System.out.printf("Tossing dough");

        System.out.printf("Adding Sauce");

        System.out.printf("Adding toppings ... ");

        for(String topping:toppings){
            System.out.printf("    "+topping);
        }
    }

    void bake(){
        System.out.printf("Bake for 25 minutes at 350 C");
    }

    void cut(){
        System.out.printf("Cutting the pizza in diagnoal slices");
    }

    void box(){
        System.out.printf("Place pizza in official Pizzabox");
    }

    public String getName() {
        return name;
    }
}
