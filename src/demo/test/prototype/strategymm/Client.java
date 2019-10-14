package demo.test.prototype.strategymm;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/2 17:19
 */
public class Client {
    public static void main(String[] args) {
        Context con = new Context(new ConStraOne());
        Context con2 = new Context(new ConStraTwo());
        con.contextInteface();
        con2.contextInteface();
    }
}
