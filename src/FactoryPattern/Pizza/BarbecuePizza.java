package FactoryPattern.Pizza;

public class BarbecuePizza implements Pizza {
    @Override
    public void prepare(){
        System.out.println("準備起司、烤肉、青椒");
    }

    @Override
    public void make(){
        System.out.println("製作BBQ披薩");
    }
}
