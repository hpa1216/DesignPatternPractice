package DecoratePattern.decorateOrder.Meal;

import DecoratePattern.decorateOrder.Order.Order;

public class Dessert extends Meal {
    private Order order;

    public Dessert(Order order){
        this.order = order;
    }

    @Override
    public String getDescription(){
        return order.getDescription() + "甜點. ";
    }

    @Override
    public int getCost(){
        return order.getCost() + 50;
    }
}
