package demo.factory;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/27 16:09
 */
public class AddFactory implements IFactory {

    @Override
    public Operation createOperation() {
        Operation o = new OperationAdd();
        return o;
    }
}
