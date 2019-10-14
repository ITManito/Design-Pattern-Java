package demo.flyweight;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/30 10:44
 */
public class ConcreteFlyweight extends  Flyweight {
    @Override
    public void Operation(int extrinsicstate) {
        System.out.println("具体Flyweight"+ extrinsicstate);
    }
}
