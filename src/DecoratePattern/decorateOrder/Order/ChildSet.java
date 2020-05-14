package DecoratePattern.decorateOrder.Order;

public class ChildSet extends Order {
    public ChildSet(){
        description = "兒童餐: ";
    }

    @Override
    public int getCost() {
        return -20;
    }
}
