package FactoryPattern.AbstractFactory.PizzaStore;

import FactoryPattern.AbstractFactory.Pizza.BarbecuePizza;
import FactoryPattern.AbstractFactory.Pizza.HawaiiPizza;
import FactoryPattern.AbstractFactory.Pizza.Pizza;
import FactoryPattern.AbstractFactory.Pizza.SeafoodPizza;
import FactoryPattern.AbstractFactory.PizzaIngredientFactory.NYPizzaIngredientFactory;
import FactoryPattern.AbstractFactory.PizzaIngredientFactory.PizzaIngredientFactory;
import FactoryPattern.Pizza.PizzaType;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(PizzaType type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        switch (type){
            case Hawaii:
                pizza = new HawaiiPizza(ingredientFactory);
                break;
            case Seafood:
                pizza = new SeafoodPizza(ingredientFactory);
                break;
            case Barbecue:
                pizza = new BarbecuePizza(ingredientFactory);
                break;
        }
        return pizza;
    }
}
