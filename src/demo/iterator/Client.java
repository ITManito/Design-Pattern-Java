package demo.iterator;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 22:17
 */
public class Client {
    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.set(0, "大鸟");
        aggregate.set(1, "小菜");
        aggregate.set(2, "行李");
        aggregate.set(3, "老外");
        aggregate.set(4, "公交内部员工");
        aggregate.set(5, "小偷");

        Iterator iterator = new ConcreteIterator(aggregate);
        Object item = iterator.first();
        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem() + "请买车票!");
            iterator.next();
        }
    }
}
