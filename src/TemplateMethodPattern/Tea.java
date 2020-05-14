package TemplateMethodPattern;

public class Tea extends CaffeineBeverage {
    public Tea(String kindOfTea){
        soakObject = kindOfTea;
    }

    void addCondiments(){
        System.out.println("加檸檬");
    }
}
