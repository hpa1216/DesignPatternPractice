package CommandPattern;

public class TV {
    String name;

    public TV() {}
    public TV(String name){
        this.name = name;
    }

    public void on() {
        System.out.println("TV is on");
    }
    public void off() {
        System.out.println("TV is off");
    }
}
