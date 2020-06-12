package ProxyPattern;

public class NewsReader {
    private int page = 0;

    //啟動APP的時候就將所有新聞的文字圖片影片下載
    //開啟時間慢
    public void start(){
        loadText();
        loadImage();
        loadVideo();
        System.out.println("you can read now");
    }

    //划動頁面
    public void scroll(){
        System.out.println("show page: " + ++page);
    }

    //觀看影片
    public void playVideo(){
        System.out.println("show video");
    }

    private void loadText(){
        System.out.println("load text...");
    }

    private void loadImage(){
        System.out.println("load image...");
    }

    private void loadVideo(){
        System.out.println("load video...");
    }
}
