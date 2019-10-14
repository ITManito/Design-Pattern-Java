package demo.test.prototype.strategymm;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/2 17:18
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInteface() {
    strategy.algorithmInterface();

}}
