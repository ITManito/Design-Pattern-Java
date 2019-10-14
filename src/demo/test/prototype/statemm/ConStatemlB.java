package demo.test.prototype.statemm;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/2 17:37
 */
public class ConStatemlB extends Stateml {
    @Override
    void handle(Context context) {
        context.setState(new ConStatemlA());
    }
}
