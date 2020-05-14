package DecoratePattern.NormalOrder;

public class FullSet extends SimpleSet {
    public FullSet(){
        description = "全餐: ";
        addSalad();
        addSoup();
        addMainMeal();
        addBeverage();
        addDessert();
    }

    @Override
    public int getCost(){
        return cost - 50;
    }

    protected void addSalad(){
        description += "沙拉. ";
        cost += 20;
    }
}
