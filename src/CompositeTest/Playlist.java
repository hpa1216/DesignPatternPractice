package CompositeTest;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements Playable {
    private List<Playable> list = new ArrayList<Playable>();

    public void add(Playable playable) {
        list.add(playable);
    }

    @Override
    public void play() {
        for(Playable playable : list) {
            playable.play();
        }
    }
}

/*
 * Frame只紀錄單一影像，並且可以播放，
 * 而播放清單可以儲存多個Frame，
 * 且因為add方法只需要有實作Playable就能使用，
 * 所以播放清單同時也能將多個播放清單再合成一個更長的播放清單
 * 這樣的物件關係就是 部分-整體 的關係
 */
