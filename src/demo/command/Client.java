package demo.command;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/2 9:01
 */
public class Client {
    public static void main(String[] args) {
        Reciever reciever = new Reciever();
        Command command = new ConcreteCommand(reciever);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.executeCommand();
    }
}
