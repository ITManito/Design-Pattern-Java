package demo.command;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/2 9:01
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
