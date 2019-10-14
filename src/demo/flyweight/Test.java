package demo.flyweight;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/30 10:55
 */
public class Test {
    public static void main(String[] args) {
        int extrinsicstate = 22;
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight fx = flyweightFactory.getFlyweight("X");
        fx.Operation(--extrinsicstate);

        Flyweight fy = flyweightFactory.getFlyweight("Y");
        fy.Operation(--extrinsicstate);

        Flyweight fz = flyweightFactory.getFlyweight("Z");
        fz.Operation(--extrinsicstate);

        UnsharedConcreteFlyweight unsharedConcreteFlyweight = new UnsharedConcreteFlyweight();
        unsharedConcreteFlyweight.Operation(--extrinsicstate);
    }
}
