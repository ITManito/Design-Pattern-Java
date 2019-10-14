package demo.test.prototype.flyweight;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 8:40
 */
public class ConcreteFlyweight extends Flyweight {
    @Override
    void opretion(int extension) {
        System.out.println("共享对象"+extension);
    }
}
