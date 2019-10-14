package demo.test.prototype.statemm;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/2 17:37
 */
public class Client {
    public static void main(String[] args) {
       ConStatemlA statemlA= new ConStatemlA();

        Context con = new Context(statemlA);


        con.request();
        con.request();
    }
}
