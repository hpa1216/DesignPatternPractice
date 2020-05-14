package CommandPattern.Command;

import CommandPattern.AirCon;

public class AirConOffCommand implements Command {
    AirCon airCon;
    public AirConOffCommand(AirCon airCon){
        this.airCon = airCon;
    }

    @Override
    public void execute() {
        airCon.off();
    }

    @Override
    public void undo(){
        airCon.on();
    }
}
