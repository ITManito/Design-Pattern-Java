package demo.memento;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/2 8:38
 */
public class Client {
    public static void main(String[] args) {
        Originator o = new Originator();
        o.setState("on");
        o.show();

        Caretaker c = new Caretaker();
        c.setMemento(o.createMemento());

        o.setState("off");
        o.show();
        o.setMemento(c.getMemento());
        o.show();
    }
}
