package CommandPattern.Command;

public interface Command {
    void execute();
    default void undo(){}
}

/*
 * 定義一個Command介面，使其他開發者可以遵照此介面提供各自實現的指令
 * 此範例為各種家電的製造商並須遵照此介面提供可使用的指令
 */
