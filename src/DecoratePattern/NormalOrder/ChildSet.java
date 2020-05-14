package DecoratePattern.NormalOrder;

public class ChildSet extends Order {
    public ChildSet(){
        description = "兒童餐: ";
        addMainMeal();
        addBeverage();
    }

    @Override
    public int getCost(){
        return cost - 20;
    }

    protected void addBeverage(){
        description += "飲料. ";
        cost += 20;
    }
}
