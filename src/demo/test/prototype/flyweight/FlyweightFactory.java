package demo.test.prototype.flyweight;

import java.util.HashMap;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 8:39
 */
public class FlyweightFactory {
     HashMap flyweights = new HashMap();

    public FlyweightFactory() {
        flyweights.put("X",new  ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key) {
        return (Flyweight) flyweights.get(key);
    }
}
