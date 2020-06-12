package StatePattern.StatePatternTrafficLight;

public class TrafficLightDriver {
    private TrafficLight trafficLight;
    private Green green = new Green();
    private Yellow yellow = new Yellow();
    private Red red = new Red();
    private enum Power {ON, OFF}
    private Power power = Power.OFF;
    private Runnable runnable = new TrafficLightRunnable();
    private Thread thread;

    public TrafficLightDriver(){
        green.setKeepTimeOfSeconds(3);
        green.setNextLight(yellow);
        yellow.setKeepTimeOfSeconds(1);
        yellow.setNextLight(red);
        red.setKeepTimeOfSeconds(3);
        red.setNextLight(green);
        trafficLight = new TrafficLight(green);
    }

    public void start(){
        if(power == Power.OFF){
            System.out.println("driver on");
            thread = new Thread(runnable);
            power = Power.ON;
            thread.start();
        }
    }

    public void stop(){
        if(power == Power.ON){
            power = Power.OFF;
            thread.interrupt();
            thread.stop();
            System.out.println("driver off");
        }
    }

    private class TrafficLightRunnable implements Runnable {
        @Override
        public void run() {
            while (power == Power.ON){
                trafficLight.change();
            }
        }
    }
}
