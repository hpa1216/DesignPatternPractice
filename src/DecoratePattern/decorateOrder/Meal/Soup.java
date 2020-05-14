package DecoratePattern.decorateOrder.Meal;

import DecoratePattern.decorateOrder.Order.Order;

public class Soup extends Meal {
    private Order order;

    public Soup(Order order){
        this.order = order;
    }

    @Override
    public String getDescription(){
        return order.getDescription() + "湯品. ";
    }

    @Override
    public int getCost(){
        return order.getCost() + 30;
    }
}
