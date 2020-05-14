package CommandPattern.Command;

public interface Command {
    void execute();
    default void undo(){}
}
