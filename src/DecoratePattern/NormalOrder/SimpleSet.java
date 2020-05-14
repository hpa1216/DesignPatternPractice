package DecoratePattern.NormalOrder;

public class SimpleSet extends ChildSet {
    public SimpleSet(){
        description = "簡餐: ";
        addSoup();
        addMainMeal();
        addDessert();
    }

    @Override
    public int getCost(){
        return cost - 30;
    }

    protected void addSoup(){
        description += "湯品. ";
        cost += 30;
    }

    protected void addDessert(){
        description += "甜點. ";
        cost += 50;
    }
}
