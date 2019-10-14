package demo.memento;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 22:50
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

}
