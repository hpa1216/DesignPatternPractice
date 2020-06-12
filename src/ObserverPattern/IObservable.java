package ObserverPattern;

public interface IObservable {
    public void add(IObserver observer);
    public void remove(IObserver observer);
    public void notifyObservers();
}

/*
 * 定義一對多的依存關係 當物件狀態一有變動 就自動通知相依物件做該做的更新動作
 *
 * IObservable是依照java內建的Observable建立的介面，
 * 用以模擬觀察者(IObserver)和被觀察者(IObservable)之間的相依關係。
 *
 * 子類別需要自行實作add 和 remove 將觀察者也就是訂閱者們加入清單內，可以用List實現，也可以用其他方式...
 * 實作notifyObservers 當觸發某事件時，通知清單內的訂閱者們。
 */
