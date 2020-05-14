package StrategyPattern;

import StrategyPattern.Strategy.Calculate;

public class OnlineCalculator {
    private Calculate strategy;
    private float now = 0;

    public float execute(float num){
        now = strategy.calculate(now, num);
        return now;
    }

    public void setNumber(int num){
        this.now = num;
    }

    public void reset(){
        now = 0;
    }

    //設定演算法(策略)
    public void setStrategy(Calculate strategy){
        this.strategy = strategy;
    }
}
