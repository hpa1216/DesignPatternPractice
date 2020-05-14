package FactoryPattern.AbstractFactory.Pizza;

import FactoryPattern.AbstractFactory.PizzaIngredientFactory.PizzaIngredientFactory;

public class BarbecuePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public BarbecuePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare(){
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        System.out.println("準備烤肉、青椒");
    }

    @Override
    public void make(){
        System.out.println("製作BBQ披薩");
    }
}
