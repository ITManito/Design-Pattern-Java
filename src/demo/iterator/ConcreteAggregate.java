package demo.iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 17:32
 */
public class ConcreteAggregate extends Aggregate {
    private List<Object> items = new ArrayList<Object>();

    @Override
    public Iterator createIteratorm() {
        return new ConcreteIterator(this);
    }

    public int count() {

        return items.size();
    }

    public Object get(int index) {
        return items.get(index);
    }

    public void set(int index, Object object) {
        items.add(index,object);
    }

}
