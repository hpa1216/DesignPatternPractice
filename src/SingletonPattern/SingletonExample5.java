package SingletonPattern;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingletonExample5 implements Serializable {
    private static final long serialVersionUID = -8177274673658703131L;
    private volatile static SingletonExample5 instance;
    private int num = 0;

    private SingletonExample5(){}

    public static SingletonExample5 getInstance(){
        if(instance == null){
            synchronized (SingletonExample5.class){
                if(instance == null){
                    instance = new SingletonExample5();
                }
            }
        }
        return instance;
    }

    //反序列化
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
