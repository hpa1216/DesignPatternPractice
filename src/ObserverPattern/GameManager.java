package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class GameManager implements IObservable {
    private List<IObserver> players = new ArrayList<>();
    private String announcement = "";

    @Override
    public void add(IObserver observer) {
        players.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        players.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver player: players) {
            player.update();
        }
    }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
        notifyObservers();
    }

    public String getAnnouncement() {
        return announcement;
    }
}
