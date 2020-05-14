package StrategyPattern.Strategy;

public class Multyply implements Calculate {
    @Override
    public float calculate(float a, float b) {
        return a * b;
    }
}
