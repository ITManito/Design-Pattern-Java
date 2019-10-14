package demo.chainofresponsibility;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/2 9:29
 */
public class Client {
    public static void main(String[] args) {
        Handler concreteHandlerOne = new ConcreteHandlerOne();
        Handler concreteHandlerTwo = new ConcreteHandlerTwo();
        Handler concreteHandlerThree = new ConcreteHandlerThree();
        concreteHandlerOne.setSuccessor(concreteHandlerTwo);
        concreteHandlerTwo.setSuccessor(concreteHandlerThree);

        int[] requests = {2, 5, 14, 22, 18, 3, 27, 20};
        for (int request : requests) {
            concreteHandlerOne.HandleRequest(request);
        }
    }

}
