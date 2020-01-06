package DesignPattern.FactoryDesignPatterm;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if(type.equalsIgnoreCase("cheese")){
            return new ChicagoStyleCheesePizza();
        }
        else {
            return null;
        }
    }
}
