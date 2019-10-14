package demo.prototype.shallowClone;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/29 11:18
 */
public class CloneableObject implements Cloneable {
    @Override
    protected Object clone() {
        CloneableObject clone=null;
        try {
            clone= (CloneableObject) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone failure");
        }
        return clone;
    }
}
