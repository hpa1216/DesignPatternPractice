package FactoryPattern.AbstractFactory.Pizza;

import FactoryPattern.AbstractFactory.PizzaIngredientFactory.PizzaIngredientFactory;

public class SeafoodPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public SeafoodPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare(){
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        System.out.println("準備花枝、蝦");
    }

    @Override
    public void make(){
        System.out.println("製作海鮮披薩");
    }
}
