package demo.state;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 15:00
 */
public class ConcreteStateB extends Statem {
//    todo
    @Override
    public void handle(Context context) {
        context.setStatem(new ConcreteStateA());
    }
}
