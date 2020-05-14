package StrategyPattern.Strategy;

public class Minus implements Calculate {
    @Override
    public float calculate(float a, float b) {
        return a - b ;
    }
}
