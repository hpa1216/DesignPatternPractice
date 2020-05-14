package DecoratePattern.NormalOrder;
public abstract class Order {
    protected String description = "餐點: ";
    protected int cost = 0;

    public Order(){}

    public String getDescription(){
        return description;
    }

    public abstract int getCost();

    protected void addMainMeal(){
        description += "主餐. ";
        cost += 100;
    }
}

/*
 * 假設 1=主餐 2=湯品 3=甜點 4=飲料
 * 若每種套餐至少須包含一個主餐則可能的套餐組合為:
 * 2種餐點組合: 12  13  14
 * 3種餐點組合: 123 124 134
 * 4種餐點組合: 1234
 * 共3+3+1=7種
 * 如果不使用裝飾模式則必須建立7個套餐類別(此範例只先建立了其中3種)，這樣做會有許多重複的程式碼
 * 因為每種套餐的餐點組合都不一樣，所以也不適合使用繼承
 * 如果使用一個已實作4種餐點的抽象類別提供套餐子類別繼承，則每個子類別都會有幾個餐點是完全用不到的
 * 這時候就可以考慮重構成裝飾模式
 */