package ProxyPattern;

public class NewsReaderFix {
    private int page = 0;

    //啟動時只下載文字，圖片改用預設圖代替，影片改用預覽圖代替
    //開啟時間較快
    public void start(){
        loadText();
        getTempImage();
        getTempVideo();
        System.out.println("you can read now");
    }

    //當使用者看下一頁時，才下載該頁有出現的圖片
    public void scroll(){
        loadImage();
        System.out.println("show page: " + ++page);
    }

    //當使用者播放影片時，才開始下載影片
    public void playVideo(){
        loadVideo();
        System.out.println("show video");
    }

    private void loadText(){
        System.out.println("load text...");
    }

    private void getTempImage(){
        System.out.println("載入預設圖片，當使用者看到有圖片的那一頁才會真的下載圖片");
    }

    private void getTempVideo(){
        System.out.println("載入影片預覽圖，當使用者點擊影片播放才會真的下載影片播放");
    }

    private void loadImage(){
        System.out.println("load image...");
    }

    private void loadVideo(){
        System.out.println("load video...");
    }
}
