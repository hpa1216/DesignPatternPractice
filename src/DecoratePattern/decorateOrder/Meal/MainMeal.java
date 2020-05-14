package DecoratePattern.decorateOrder.Meal;

import DecoratePattern.decorateOrder.Order.Order;

public class MainMeal extends Meal{
    private Order order;

    public MainMeal(Order order){
        this.order = order;
    }

    @Override
    public String getDescription(){
        return order.getDescription() + "主餐. ";
    }

    @Override
    public int getCost(){
        return order.getCost() + 100;
    }
}
