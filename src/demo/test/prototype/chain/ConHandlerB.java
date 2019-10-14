package demo.test.prototype.chain;
import demo.chainofresponsibility.ConcreteHandlerOne;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/2 15:43
 */
public class ConHandlerB extends Handlerm {

    @Override
    public void HandleRequest(int request) {
        if (request>=10&& request<20) {
            System.out.println(this.getClass().getName()+"处理请求"+request);
        }else if (successor != null) {
        successor.HandleRequest(request);

    }
}}
