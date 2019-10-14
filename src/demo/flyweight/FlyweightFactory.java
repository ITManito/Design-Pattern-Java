package demo.flyweight;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/30 10:32
 */
public class FlyweightFactory {
    //todo 为啥Hashtable, hashmap不行么
    private HashMap flyweights = new HashMap<>();

    public FlyweightFactory() {
        flyweights.put("X", new ConcreteFlyweight());
        flyweights.put("Y", new ConcreteFlyweight());
        flyweights.put("Z", new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key) {
        return ((Flyweight) flyweights.get(key));
    }
}
