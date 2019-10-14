package demo.observer;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 16:07
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.add(new ConcreteObserverm(concreteSubject, "X"));
        concreteSubject.setSubjectState("ABC");
        concreteSubject.notifym();
    }
}
