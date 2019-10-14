package demo.test.prototype.chain;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/2 15:43
 */
abstract class Handlerm {
    protected Handlerm successor;

    public void setSuccessor(Handlerm successor) {
        this.successor = successor;
    }
    public abstract void HandleRequest(int request);


}
