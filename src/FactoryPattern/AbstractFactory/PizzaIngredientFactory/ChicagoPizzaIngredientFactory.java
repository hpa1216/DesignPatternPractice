package FactoryPattern.AbstractFactory.PizzaIngredientFactory;

import FactoryPattern.AbstractFactory.Chesse.Cheese;
import FactoryPattern.AbstractFactory.Chesse.ShreddedMozzarellaCheese;
import FactoryPattern.AbstractFactory.Dough.Dough;
import FactoryPattern.AbstractFactory.Dough.ThickCrustDough;
import FactoryPattern.AbstractFactory.Sauce.PlumTomatoSauce;
import FactoryPattern.AbstractFactory.Sauce.Sauce;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough(){
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce(){
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese(){
        return new ShreddedMozzarellaCheese();
    }
}
