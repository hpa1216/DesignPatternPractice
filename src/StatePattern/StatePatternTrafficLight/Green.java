package StatePattern.StatePatternTrafficLight;

public class Green extends Light {
    @Override
    public void change(TrafficLight light) {
        System.out.println("綠燈");
        sleep(this.keepTimeOfSeconds);
        light.set(nextLight);
    }
}
