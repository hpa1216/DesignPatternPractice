package TemplateMethodPattern;

public class Coffee extends CaffeineBeverage {
    public Coffee(String kindOfCoffee){
        soakObject = kindOfCoffee;
    }

    void addCondiments(){
        System.out.println("加牛奶");
    }
}
