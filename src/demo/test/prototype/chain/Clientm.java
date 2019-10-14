package demo.test.prototype.chain;

import demo.chainofresponsibility.ConcreteHandlerOne;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/2 15:48
 */
public class Clientm {
    public static void main(String[] args) {
        Handlerm conHandlerA = new ConHandlerA();
        Handlerm conHandlerB = new ConHandlerB();
        conHandlerA.setSuccessor(conHandlerB);
        int[] request = {2, 10, 12, 20};
        for (int i : request) {
            conHandlerA.HandleRequest(i);
        }
    }
}
