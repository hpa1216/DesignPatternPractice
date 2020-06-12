package CompositeTest;

public interface Playable {
    void play();
}

/*
 * 不論是單一影格還是連續影格，都要有播放的功能
 * 所以Frame 和 PlayList都必須實作 Playable介面
 */
