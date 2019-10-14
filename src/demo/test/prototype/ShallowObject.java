package demo.test.prototype;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/29 14:52
 */
public class ShallowObject implements Cloneable {
    @Override
    protected Object clone() {
        ShallowObject clone = null;
        try {
            clone= (ShallowObject) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("浅克隆失败");
        }
        return clone;
    }
}
