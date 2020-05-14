package FactoryPattern.AbstractFactory.Pizza;

import FactoryPattern.AbstractFactory.Chesse.Cheese;
import FactoryPattern.AbstractFactory.Dough.Dough;
import FactoryPattern.AbstractFactory.Sauce.Sauce;

public abstract class Pizza {
    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;

    public abstract void prepare();

    public abstract void make();
}
