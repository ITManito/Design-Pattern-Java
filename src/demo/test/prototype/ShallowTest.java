package demo.test.prototype;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/29 14:56
 */
public class ShallowTest {
    public static void main(String[] args) {
        ShallowObject shallowObject = new ShallowObject();
        ShallowObject copyShallow = (ShallowObject) shallowObject.clone();
        System.out.println("shallowObject==copyShallow??");
        System.out.println(shallowObject==copyShallow);
    }
}
