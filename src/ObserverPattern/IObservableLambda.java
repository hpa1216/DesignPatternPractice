package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public interface IObservableLambda {
    List<IObserver> players = new ArrayList<>();

    default void add(IObserver observer) {
        players.add(observer);
    }

    default void remove(IObserver observer) {
        players.remove(observer);
    }

    default void nofityAllObserver() {
        for (IObserver player: players) {
            player.update();
        }
    }
}
