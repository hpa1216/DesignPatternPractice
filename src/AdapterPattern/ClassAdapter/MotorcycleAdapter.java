package AdapterPattern.ClassAdapter;

//使用此方法做轉接的好處是adapter可以override 被轉接對象的方法
public class MotorcycleAdapter extends Bicycle implements Motorcycle {
    @Override
    public void speedUp(){
        super.speedUp();
        System.out.println("adapter accelerator");
    }

    @Override
    public void ride(){
        super.ride();
        System.out.println("adapter drive");
    }

    @Override
    public void accelerator() {
        this.speedUp();
    }

    @Override
    public void drive() {
        this.ride();
    }
}
