package FactoryPattern.Pizza;

public class ClassicPizza implements Pizza {
    @Override
    public void prepare(){
        System.out.println("準備三種起司、番茄醬");
    }

    @Override
    public void make(){
        System.out.println("製作經典披薩");
    }
}
