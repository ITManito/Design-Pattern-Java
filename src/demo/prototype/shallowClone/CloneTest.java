package demo.prototype.shallowClone;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/29 11:29
 */
public class CloneTest {
    public static void main(String[] args) {
        CloneableObject cloneableObject = new CloneableObject();
        CloneableObject copyCloneable = (CloneableObject) cloneableObject.clone();
        System.out.println("cloneableObject==copyCloneable?");
        System.out.println(cloneableObject==copyCloneable);
        System.out.println(cloneableObject.equals(copyCloneable));
    }
}
