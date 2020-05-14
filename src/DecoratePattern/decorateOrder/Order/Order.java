package DecoratePattern.decorateOrder.Order;

public abstract class Order {
    protected String description = "nothing";
    public String getDescription(){
        return description;
    }

    public abstract int getCost();
}

/*
 * Order 提供給各種套餐繼承，並實作自己的 getCost
 * Meal 繼承 Order 並將 getDescription Override　成　abstract Methods
 * 這樣子類別在繼承 Meal 時，就可以修改 getDescription return的值
 *
 * 各種餐點繼承 Meal 實作 餐點名稱 和 餐點價格
 * 定義好的各種套餐繼承 Order 並實作自己的 套餐名稱 和 套餐優惠價
 * 修改餐點的建構式為Order，餐點(Meal)和套餐(Set)的父類別都為Order
 */