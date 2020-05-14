package DecoratePattern.decorateOrder.Order;

public class SimpleSet extends Order {
    public SimpleSet(){
        description = "簡餐: ";
    }

    @Override
    public int getCost() {
        return -30;
    }
}
