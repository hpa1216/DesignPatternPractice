package StrategyPattern.Strategy;

public class CycleIncrease implements Calculate{
    @Override
    public float calculate(float a , float b){
        return (a+b)*((b-a+1)/2);
    }
}
