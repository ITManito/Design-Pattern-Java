package demo.test.prototype.statemm;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/2 17:36
 */
public class Context {
    public Stateml getState() {
        return state;
    }

    public Context(Stateml state) {
        this.state = state;
    }

    public void setState(Stateml state) {
        this.state = state;
    System.out.println("状态"+state.getClass().getName());
    }

    private Stateml state;


    public void request(){
        state.handle(this);
    }
}
