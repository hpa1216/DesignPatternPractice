package FactoryPattern.AbstractFactory.PizzaStore;

import FactoryPattern.AbstractFactory.Pizza.Pizza;
import FactoryPattern.Pizza.PizzaType;

public abstract class PizzaStore {
    abstract Pizza createPizza(PizzaType type);
    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.make();
        return pizza;
    }
}
