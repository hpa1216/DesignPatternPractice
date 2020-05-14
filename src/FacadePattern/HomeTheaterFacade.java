package FacadePattern;

public class HomeTheaterFacade {
    Amplifier amplifier;
    DvdPlayer dvdPlayer;
    Projector projector;
    Screen screen;
    TheaterLights theaterLights;

    public HomeTheaterFacade(Amplifier amplifier, DvdPlayer dvdPlayer, Projector projector,
                             Screen screen, TheaterLights theaterLights){
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.screen = screen;
        this.theaterLights = theaterLights;
    }

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
