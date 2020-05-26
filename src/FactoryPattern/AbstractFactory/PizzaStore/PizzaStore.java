package FactoryPattern.AbstractFactory.PizzaStore;

import FactoryPattern.AbstractFactory.Pizza.Pizza;
import FactoryPattern.Pizza.PizzaType;

public abstract class PizzaStore {
    abstract Pizza createPizza(PizzaType type);
    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.make();
        return pizza;
    }
}

/*
 * 如果您需要一組可以隨時抽換的元件，並且希望可以簡單地一次抽換，則可以考慮使用Abstract Factory。
 * 用一個抽象工廠來定義一個創建 產品族 的介面 產品族裡面每個產品的具體類別由繼承抽象工廠的實體工廠決定
 *
 * 此範例中 PizzaStore 和 FactoryMethod中的 PizzaStore是一樣的，
 * 差別在於繼承PizzaStore 的兩個子類別中的 createPizza()方法，
 * 原本的 pizza.custom()方法較沒辦法設定太多細節。
 *
 * 此範例中將客製化的方法改為由 PizzaIngredientFactory 這個原料工廠來實現，
 * 每種Pizza在產生實例時也必須指定某一種原料工廠。
 *
 * PizzaIngredientFactory裡面定義了子類別必須要自己實作Pizza的各種原料，
 * ChicagoPizzaIngredientFactory 和 NYPizzaIngredientFactory實作了PizzaIngredientFactory後，
 * 工廠就能夠自己決定要使用哪種原料工廠來提供Pizza。
 * 也就符合定義中"一組可以隨時抽換的元件，並且希望可以簡單地一次抽換"。
 */
