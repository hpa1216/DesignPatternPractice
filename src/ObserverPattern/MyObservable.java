package ObserverPattern;

import java.util.Observable;

public class MyObservable extends Observable {
    public void setChanged(boolean changed){
        if(changed){
            setChanged();
        }else{
            clearChanged();
        }
    }
}
