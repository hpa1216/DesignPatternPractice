package StatePattern.StatePatternTrafficLight;

public class Red extends Light {
    @Override
    public void change(TrafficLight light) {
        System.out.println("紅燈");
        sleep(this.keepTimeOfSeconds);
        light.set(nextLight);
    }
}
