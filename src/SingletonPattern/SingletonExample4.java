package SingletonPattern;

public class SingletonExample4 {
    private SingletonExample4(){}

    public static SingletonExample4 getInstance(){
        return StaticInnerClass.instance;
    }

    private static class StaticInnerClass{
        private static SingletonExample4 instance = new SingletonExample4();
    }
}
