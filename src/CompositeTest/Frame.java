package CompositeTest;

public class Frame implements Playable {
    private String image;

    public Frame(String image) {
        this.image = image;
    }

    @Override
    public void play() {
        System.out.println("播放 " + image);
    }
}