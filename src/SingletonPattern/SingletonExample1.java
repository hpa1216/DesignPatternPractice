package SingletonPattern;

public class SingletonExample1 {
    private static SingletonExample1 instance = new SingletonExample1();

    private SingletonExample1(){}

    public static SingletonExample1 getInstance(){
        return instance;
    }
}
