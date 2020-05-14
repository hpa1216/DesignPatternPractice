package StrategyPattern;

public class NormalCalculator {
    public enum CalculatorType {
        ADD, MINUS, MULTIPLY, DIVIDE
    }
    private float now = 0;

    //沒有使用策略模式的寫法，要擴充新功能時就要增加case且無法與其他類別共用演算法
    public float execute(CalculatorType calculatorType, float num){
        switch (calculatorType){
            case ADD:
                now += num;
                break;
            case MINUS:
                now -= num;
                break;
            case MULTIPLY:
                now *= num;
                break;
            case DIVIDE:
                now /= num;
                break;
        }
        return now;
    }

    public void setNumber(float num){
        this.now = num;
    }

    public void reset(){
        now = 0;
    }
}
