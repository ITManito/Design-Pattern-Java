package demo.chainofresponsibility;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/2 9:21
 */
public class   ConcreteHandlerTwo extends Handler {

    @Override
    public void HandleRequest(int request) {
        if (request >=10&&request<20) {
            System.out.println(this.getClass().getName()+"处理请求"+request);
        }   else if(successor!=null){
//            TODO??
            successor.HandleRequest(request);
        }
    }
}
