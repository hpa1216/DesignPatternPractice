package DecoratePattern.decorateOrder.Meal;

import DecoratePattern.decorateOrder.Order.Order;

public class Salad extends Meal {
    private Order order;

    public Salad(Order order){
        this.order = order;
    }

    @Override
    public String getDescription(){
        return order.getDescription() + "沙拉. ";
    }

    @Override
    public int getCost(){
        return order.getCost() + 20;
    }
}
