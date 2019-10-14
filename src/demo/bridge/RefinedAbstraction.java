package demo.bridge;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/30 11:31
 */
public class RefinedAbstraction extends Abstraction {

    @Override
    public void operation() {
//        super.getImplementor().operation();
        implementor.operation();
    }
}
