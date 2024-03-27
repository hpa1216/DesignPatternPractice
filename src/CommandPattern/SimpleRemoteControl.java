package CommandPattern;

import CommandPattern.Command.Command;

/*
 * 實作一個可以輸入各種家電開關指令的控制器
 * Command 的實現交由該電器的開發者提供
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}