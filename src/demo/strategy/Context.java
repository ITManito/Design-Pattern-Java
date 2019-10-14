package demo.strategy;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 14:41
 */
public class Context {
    private Strategy strategy;

    //todo
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInteface() {
        strategy.algorithmInterface();
    }
}
