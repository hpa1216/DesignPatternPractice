package FactoryPattern.Pizza;

public class HawaiiPizza implements Pizza {
    @Override
    public void prepare(){
        System.out.println("準備起司、火腿、鳳梨");
    }

    @Override
    public void make(){
        System.out.println("製作夏威夷披薩");
    }
}
