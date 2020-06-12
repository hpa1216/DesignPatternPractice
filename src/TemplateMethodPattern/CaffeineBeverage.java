package TemplateMethodPattern;

/*
 * 定義一個樣板提供子類別繼承，
 * 並且將已固定的流程寫成final function，讓子類別無法Override
 * 這樣做的好處是可以統一所有子類別的操作，
 * 需要客製化的部分則交由子類別自行實現abstract function
 */
public abstract class CaffeineBeverage {
    protected String soakObject;

    public final void prepareRecipe(String recipe){
        System.out.println("準備製作" + recipe);
        boilWater();
        chooseSoakObject();
        pourInCup();
        addCondiments();
        System.out.println();
    }

    abstract void addCondiments();

    private void chooseSoakObject(){
        System.out.println("選擇" + soakObject);
    }

    private void boilWater(){
        System.out.println("煮開水");
    }

    private void pourInCup(){
        System.out.println("沖泡");
    }
}
