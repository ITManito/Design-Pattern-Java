package demo.factory;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/27 16:19
 */
public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = super.getNumberA() + super.getNumberB();
        return result;
    }
}
