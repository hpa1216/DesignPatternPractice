package ObserverPattern;

public class GamePlayer implements IObserver {

    private IObservable observable;
    private String playerName;
    private String announcement;

    public GamePlayer(IObservable observable, String playerName){
        this.observable = observable;
        this.playerName = playerName;
        announcement = ((GameManager)observable).getAnnouncement();
        System.out.println(playerName + " 登入成功");
    }

    @Override
    public void update(){
        String newAnnouncement = ((GameManager)observable).getAnnouncement();
        if(!(announcement.equals(newAnnouncement))){
            System.out.println(playerName + " 收到新公告:");
            announcement = newAnnouncement;
            System.out.println(announcement);
        }
    }
}
