package DecoratePattern.decorateOrder.Order;

public class FullSet extends Order {
    public FullSet(){
        description = "全餐: ";
    }

    @Override
    public int getCost() {
        return -50;
    }
}
