package StrategyPattern.Strategy;

public class Divide implements Calculate {
    @Override
    public float calculate(float a, float b) {
        return a / b ;
    }

}
