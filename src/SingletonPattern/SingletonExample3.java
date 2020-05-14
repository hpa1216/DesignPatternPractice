package SingletonPattern;

public class SingletonExample3 {
    private volatile static SingletonExample3 instance;

    private SingletonExample3(){}

    public static SingletonExample3 getInstance(){
        if(instance == null){
            synchronized (SingletonExample3.class){
                if(instance == null){
                    instance = new SingletonExample3();
                }
            }
        }
        return instance;
    }
}
