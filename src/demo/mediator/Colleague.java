package demo.mediator;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 16:31
 */
public abstract class Colleague {
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    protected Mediator mediator;

}
