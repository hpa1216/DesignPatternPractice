package TemplateMethodPattern;

import java.util.function.Consumer;

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
