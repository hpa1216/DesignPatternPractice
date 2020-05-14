package FactoryPattern.AbstractFactory.Pizza;

import FactoryPattern.AbstractFactory.PizzaIngredientFactory.PizzaIngredientFactory;

public class HawaiiPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public HawaiiPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare(){
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        System.out.println("準備火腿、鳳梨");
    }

    @Override
    public void make(){
        System.out.println("製作夏威夷披薩");
    }
}
