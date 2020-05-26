package FactoryPattern.FactoryMethod;

import FactoryPattern.Pizza.Pizza;
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
 * 將SimpleFactory註解中提到的問題改寫成工廠方法，
 * 依照工廠方法的定義搭配此範例解說。
 *
 * 在一個抽象類別中留下某個建立元件的抽象方法沒有實作，也就是 createPizza()
 *
 * 其它與元件操作相關聯的方法都先依賴於元件所定義的介面，而不是依賴於元件的實現，
 * 也就是 orderPizza()中使用Pizza介面的 prepare()和 make()方法，
 *
 * 當您的成品中有一個或多個元件無法確定時，您先確定與這些元件的操作介面，然後用元件的抽象操作介面先完成其它的工作，
 * 元件的實作（實現）則推遲至實現元件介面的子類完成，一旦元件加入，即可完成您的成品，
 * 也就是 ChicagoPizzaStore 和 NYPizzaStore 這兩個子類別。
 *
 */
