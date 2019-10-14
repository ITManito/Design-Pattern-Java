package demo.mediator;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 16:36
 */
public class ConcreteColleagueOne extends Colleague {
    public ConcreteColleagueOne(Mediator mediator) {
        super(mediator);
    }
    public void send(String message) {
        mediator.send(message,this);
    }

    public void notify(String message) {
        System.out.println("同事2得到消息:"+message);
    }
}
