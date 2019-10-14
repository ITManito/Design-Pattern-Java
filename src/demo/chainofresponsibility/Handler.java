package demo.chainofresponsibility;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/2 9:20
 */
public abstract class Handler {
    protected  Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
//    todo
    public abstract void HandleRequest(int request);

}
