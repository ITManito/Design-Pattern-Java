package demo.command;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/2 9:02
 */
public class ConcreteCommand extends Command {
    private Reciever reciever;

//    todo
    public ConcreteCommand(Reciever reciever) {
        this.reciever = reciever;
    }

    @Override
    public void execute() {

        reciever.action();

    }
}
