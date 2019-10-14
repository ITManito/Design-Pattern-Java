package demo.test.prototype.chain;
import demo.chainofresponsibility.ConcreteHandlerOne;

import	java.util.logging.Handler;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/2 15:43
 */
public class ConHandlerA extends Handlerm {

    @Override
    public void HandleRequest(int request) {
        if (request>=0&& request<10) {
            System.out.println(this.getClass().getName()+"处理请求"+request);
        }else if (successor != null) {
        successor.HandleRequest(request);

    }
}}
