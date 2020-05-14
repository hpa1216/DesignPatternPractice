package FactoryPattern.FactoryMethod;

import FactoryPattern.Pizza.*;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(PizzaType type) {
        Pizza pizza = null;
        switch (type){
            case Hawaii:
                pizza = new HawaiiPizza();
                pizza.custom("改用莫札瑞拉起司");
                break;
            case Seafood:
                pizza = new SeafoodPizza();
                pizza.custom("改用厚餅皮");
                break;
            case Barbecue:
                pizza = new BarbecuePizza();
                pizza.custom("改用辣醬");
                break;
        }
        return pizza;
    }
}
