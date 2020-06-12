package TemplateMethodPattern;

import java.util.function.Consumer;

/*
 * 將樣板模式重構為lambda版本後，如果是應用在較簡單的結構時，
 * 開發時可以不用將子類別定義好，而是交由使用的人去自訂Consumer<T>的方法要如何實作
 */
public class CaffeineBeverageLambda {
    public final void prepareRecipe(String recipe, String soakObject,
                                    String condiments, Consumer<String> addCondiments){
        System.out.println("準備製作" + recipe);
        boilWater();
        chooseSoakObject(soakObject);
        pourInCup();
        addCondiments.accept(condiments);
        System.out.println();
    }

    private void chooseSoakObject(String soakObject){
        System.out.println("選擇" + soakObject);
    }

    private void boilWater(){
        System.out.println("煮開水");
    }

    private void pourInCup(){
        System.out.println("沖泡");
    }
}
