package demo.observer;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 15:54
 */
public class ConcreteObserverm extends Observerm {
    public ConcreteSubject getSubject() {
        return subject;
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }

    private ConcreteSubject subject;
    //    TODO ??
    private String name;
    private String observerState;

    public ConcreteObserverm(ConcreteSubject subject, String name) {
        this.subject = subject;
        this.name = name;
    }

    @Override
    public void update() {
        observerState = subject.getSubjectState();
        System.out.println("观察者{0}的新状态{1}" + name + observerState);
    }
}
