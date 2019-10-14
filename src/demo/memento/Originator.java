package demo.memento;
import	java.awt.Menu;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 22:50
 */
public class Originator {
//    备忘状态,创建/设置备忘录
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return (new Memento(state));
    }

    public void setMemento(Memento memento) {
        state = memento.getState();
    }

    public void show() {
        System.out.println("State="+state);
    }
}
