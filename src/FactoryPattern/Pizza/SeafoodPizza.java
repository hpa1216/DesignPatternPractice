package FactoryPattern.Pizza;

public class SeafoodPizza implements Pizza {
    @Override
    public void prepare(){
        System.out.println("準備起司、花枝、蝦");
    }

    @Override
    public void make(){
        System.out.println("製作海鮮披薩");
    }
}
