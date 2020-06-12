package FacadePattern;

/*
 * 一件工作可以細分為多個步驟，若每個步驟使用到不同的物件，
 * 這時可以建立一個表象類別來統整這一流程化的操作步驟，
 * 好處是使用者不需面對各個類別的方法，只需要知道如何使用表象類別的方法
 */
public class HomeTheaterFacade {
    Amplifier amplifier;
    DvdPlayer dvdPlayer;
    Projector projector;
    Screen screen;
    TheaterLights theaterLights;

    //初始化時必須把需要控制的物件傳入
    public HomeTheaterFacade(Amplifier amplifier, DvdPlayer dvdPlayer, Projector projector,
                             Screen screen, TheaterLights theaterLights){
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.screen = screen;
        this.theaterLights = theaterLights;
    }

    /*
     * 看電影前的準備工作交由表象類別中的方法完成，
     * 使用者不需要自己一個一個操作，且使用者在需要的時候仍然可以各別操作各個類別的方法，
     * 例如我只是要停止播放，那我就可以自己使用 dvdPlayer.stop() 而不是此類別中的 endMovie()
     */
    public void watchMovie(String movie){
        theaterLights.dim(10);
        screen.down();
        projector.on();
        amplifier.on();
        amplifier.setDvd();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie(){
        dvdPlayer.stop();
        dvdPlayer.off();
        amplifier.off();
        projector.off();
        screen.up();
        theaterLights.on();
    }
}
