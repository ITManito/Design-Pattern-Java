package demo.test.prototype.flyweight;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 8:52
 */
public class Test {
    public static void main(String[] args) {
        int extension = 22;
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight flyweight = factory.getFlyweight("X");
        flyweight.opretion(--extension);
    }
}
