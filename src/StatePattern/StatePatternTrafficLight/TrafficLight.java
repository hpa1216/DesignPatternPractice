package StatePattern.StatePatternTrafficLight;

class TrafficLight {
    private State current;

    public TrafficLight(State firstLight){
        current = firstLight;
    }

    void set(State state) {
        this.current = state;
    }

    void change() {
        current.change(this);
    }
}
