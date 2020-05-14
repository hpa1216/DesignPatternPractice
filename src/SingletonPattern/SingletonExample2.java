package SingletonPattern;

public class SingletonExample2 {
    private static SingletonExample2 instance;

    private SingletonExample2 (){}

    public static synchronized SingletonExample2 getInstance(){
        if (instance == null) {
            instance = new SingletonExample2();
        }
        return instance;
    }
}
