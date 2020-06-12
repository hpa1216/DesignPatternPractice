package StatePattern.StatePatternTrafficLight;

public class Yellow extends Light {
    @Override
    public void change(TrafficLight light) {
        System.out.println("黃燈");
        sleep(this.keepTimeOfSeconds);
        light.set(nextLight);
    }
}
