package AdapterPattern.ObjectAdapter;

public class Honda implements Motorcycle {
    @Override
    public void accelerator(){
        System.out.println("催油門");
    }
    @Override
    public void drive(){
        System.out.println("耗油");
    }
}
