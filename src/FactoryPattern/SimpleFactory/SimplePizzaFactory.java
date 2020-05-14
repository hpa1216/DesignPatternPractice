package FactoryPattern.SimpleFactory;

import FactoryPattern.Pizza.*;

public class SimplePizzaFactory {
    //將原本寫在非Pizza相關類別的製作方法搬移到Pizza的簡單工廠內，統一由工廠提供Pizza
    public Pizza createPizza(PizzaType type){
        Pizza pizza = new ClassicPizza();
        switch (type){
            case Hawaii:
                pizza = new HawaiiPizza();
                break;
            case Seafood:
                pizza = new SeafoodPizza();
                break;
            case Barbecue:
                pizza = new BarbecuePizza();
                break;
        }
        return pizza;
    }
}
