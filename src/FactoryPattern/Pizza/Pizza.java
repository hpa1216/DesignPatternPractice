package FactoryPattern.Pizza;

public interface Pizza {
    void prepare();
    void make();
    default void custom(String style){
        System.out.println(style);
    }
}
