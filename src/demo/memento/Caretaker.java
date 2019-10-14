package demo.memento;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 22:51
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
