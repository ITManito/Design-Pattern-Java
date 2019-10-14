package demo.mediator;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 16:29
 */
public abstract class Mediator {
    public abstract void send(String message,Colleague colleague);
}
