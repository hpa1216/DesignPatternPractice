package CommandPattern;

public class AirCon {
    String name;

    public AirCon() {}
    public AirCon(String name){
        this.name = name;
    }

    public void on() {
        System.out.println("AirCon is on");
    }
    public void off() {
        System.out.println("AirCon is off");
    }
}
