package DecoratePattern.decorateOrder.Meal;

import DecoratePattern.decorateOrder.Order.Order;

public abstract class Meal extends Order {
    @Override
    public abstract String getDescription();
}
