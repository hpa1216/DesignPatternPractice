package FactoryPattern.SimpleFactory;

import FactoryPattern.Pizza.*;

public class SimplePizzaFactory {
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

/*
 * 對客戶端隱藏產品產生的細節，物件如何生成，生成前是否與其它物件建立依賴關係，客戶端皆不用理會，
 * 用以將物件生成方式之變化 與客戶端程式碼隔離。
 *
 * 此範例是將原本寫在非Pizza相關類別的Pizza製作方法搬移到Pizza的簡單工廠內，統一由工廠提供Pizza，
 * 這樣做可以讓所有需要取得Pizza實例的客戶端有一個共同取得實例的方法。
 */

