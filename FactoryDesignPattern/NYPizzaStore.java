package DesignPattern.FactoryDesignPatterm;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if(type.equalsIgnoreCase("cheese")){
            return new NYStyleCheesePizza();
        }
        else {
            return null;
        }

    }

}
