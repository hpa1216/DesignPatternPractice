package StrategyPattern.Strategy;

public class NthPower implements Calculate {
    @Override
    public float calculate(float a, float b){
        float result = 0;
        if(b < 0){
            result = 1;
            for(int i=0; i>b; i--){
                result /= a;
            }
        } else if(b == 0){
            result = 1;
        } else if(b > 0){
            result = a;
            for(int i=1; i<b; i++){
                result *= a;
            }
        }
        return result;
    }
}
