package CommandPattern.Command;

import CommandPattern.AirCon;

public class AirConOnCommand implements Command {
    AirCon airCon;
    public AirConOnCommand(AirCon airCon){
        this.airCon = airCon;
    }

    @Override
    public void execute() {
        airCon.on();
    }

    @Override
    public void undo(){
        airCon.off();
    }
}
