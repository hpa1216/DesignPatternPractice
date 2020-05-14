package FactoryPattern.SimpleFactory;

import FactoryPattern.Pizza.Pizza;
import FactoryPattern.Pizza.PizzaType;

public class SimplePizzaStore {
    SimplePizzaFactory factory;
    public SimplePizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza;
        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.make();
        return pizza;
    }
}
