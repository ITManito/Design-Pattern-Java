package demo.test.prototype.decrator;


import demo.decorator.ConcreteComponent;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 10:59
 */
public class Test {
    public static void main(String[] args) {
        ConctreteComponetd conctreteComponetd = new ConctreteComponetd();
        ConcreteDirector concreteDirector = new ConcreteDirector();
        concreteDirector.set(conctreteComponetd);
        concreteDirector.operation();
    }
}
