package AdapterPattern;

public class OldBicycle implements Bicycle {
    @Override
    public void speedUp(){
        System.out.println("調整變速器");
    }
    @Override
    public void ride(){
        System.out.println("耗體力");
    }
}
