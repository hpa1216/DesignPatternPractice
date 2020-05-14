package DecoratePattern.decorateOrder.Meal;

import DecoratePattern.decorateOrder.Order.Order;

public class Beverage extends Meal {
    private Order order;

    public Beverage(Order order){
        this.order = order;
    }

    @Override
    public String getDescription(){
        return order.getDescription() + "飲料. ";
    }

    @Override
    public int getCost(){
        return order.getCost() + 20;
    }
}
