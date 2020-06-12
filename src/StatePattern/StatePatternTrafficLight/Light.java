package StatePattern.StatePatternTrafficLight;

public abstract class Light implements State {
    protected int keepTimeOfSeconds;
    protected Light nextLight;

    public void setKeepTimeOfSeconds(int keepTimeOfSeconds) {
        this.keepTimeOfSeconds = keepTimeOfSeconds;
    }

    public void setNextLight(Light nextLight) {
        this.nextLight = nextLight;
    }

    @Override
    public abstract void change(TrafficLight light);

    protected void sleep(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
