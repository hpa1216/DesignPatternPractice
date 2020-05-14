package TemplateMethodPattern;

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
