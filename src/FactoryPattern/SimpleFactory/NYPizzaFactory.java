package FactoryPattern.SimpleFactory;

import FactoryPattern.Pizza.Pizza;
import FactoryPattern.Pizza.PizzaType;

public class NYPizzaFactory extends SimplePizzaFactory {
    @Override
    public Pizza createPizza(PizzaType type){
        Pizza pizza = super.createPizza(type);
        pizza.custom("NewYork Style");
        return pizza;
    }
}
