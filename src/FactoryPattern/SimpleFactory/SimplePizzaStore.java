package FactoryPattern.SimpleFactory;

import FactoryPattern.Pizza.Pizza;
import FactoryPattern.Pizza.PizzaType;

public class SimplePizzaStore {
    SimplePizzaFactory factory;
    public SimplePizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza;
        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.make();
        return pizza;
    }
}

/*
 * 將原本的簡單工廠改寫一下，新增兩種不同風格的Pizza工廠，繼承原本的SimplePizzaFactory並實作客製化的部分，
 * 現在使用者可以透過PizzaStore設定不同種類的Pizza工廠來取得自己想要的Pizza種類。
 *
 * 但是其他工廠在繼承SimplePizzaFactory的時候，Override了已實作的方法 createPizza，
 * 因此這邊必須把SimplePizzaFactory的類別改為abstract class，詳見FactoryMethod內的實作方式。
 */
