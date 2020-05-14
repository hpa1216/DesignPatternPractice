package AdapterPattern;

public class MotorcycleAdapter implements Motorcycle {
    Bicycle bicycle;

    public MotorcycleAdapter(Bicycle bicycle){
        this.bicycle = bicycle;
    }

    @Override
    public void accelerator(){
        bicycle.speedUp();
    }

    @Override
    public void drive(){
        bicycle.ride();
    }
}
