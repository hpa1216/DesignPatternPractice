package FactoryPattern.AbstractFactory.PizzaIngredientFactory;

import FactoryPattern.AbstractFactory.Chesse.Cheese;
import FactoryPattern.AbstractFactory.Chesse.ReggianoCheese;
import FactoryPattern.AbstractFactory.Dough.Dough;
import FactoryPattern.AbstractFactory.Dough.ThinCrustDough;
import FactoryPattern.AbstractFactory.Sauce.MarinaraSauce;
import FactoryPattern.AbstractFactory.Sauce.Sauce;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough(){
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce(){
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese(){
        return new ReggianoCheese();
    }
}
