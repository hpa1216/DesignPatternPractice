package FactoryPattern.AbstractFactory.PizzaIngredientFactory;

import FactoryPattern.AbstractFactory.Chesse.Cheese;
import FactoryPattern.AbstractFactory.Dough.Dough;
import FactoryPattern.AbstractFactory.Sauce.Sauce;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
}
