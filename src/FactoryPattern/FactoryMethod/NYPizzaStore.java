package FactoryPattern.FactoryMethod;

import FactoryPattern.Pizza.*;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(PizzaType type) {
        Pizza pizza = null;
        switch (type){
            case Hawaii:
                pizza = new HawaiiPizza();
                pizza.custom("改用馬斯卡彭起司");
                break;
            case Seafood:
                pizza = new SeafoodPizza();
                pizza.custom("改用薄餅");
                break;
            case Barbecue:
                pizza = new BarbecuePizza();
                pizza.custom("改用烤肉醬");
                break;
        }
        return pizza;
    }
}
